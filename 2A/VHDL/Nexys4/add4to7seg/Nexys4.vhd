library IEEE;
use IEEE.std_logic_1164.all;
use IEEE.std_logic_arith.all;
use IEEE.std_logic_unsigned.all;

entity Nexys4 is
  port (
    -- les 16 switchs
    swt : in std_logic_vector (15 downto 0);
    -- les anodes pour sélectionner l'afficheur 7 segments
    an : out std_logic_vector (7 downto 0);
    -- afficheur 7 segments (point décimal compris, segment 7)
    ssg : out std_logic_vector (7 downto 0);
    -- horloge
    mclk : in std_logic;
    -- les 5 boutons noirs
    btnC, btnU, btnL, btnR, btnD : in std_logic;
    -- les 16 leds
    led : out std_logic_vector (15 downto 0)
  );
end Nexys4;

architecture synthesis of Nexys4 is

	-- rappel du (des) composant(s)
	component add4 is
	port ( A 			: in  	STD_LOGIC_VECTOR (3 downto 0);
          sum 			: out  	STD_LOGIC_VECTOR (3 downto 0);
          carryOut 	: out  	STD_LOGIC;
          carryin 	: in  	STD_LOGIC;
          B 			: in  	STD_LOGIC_VECTOR (3 downto 0));
	end component;

	component dec7seg
    port (	value 	: in 		std_logic_vector (3 downto 0);
				seg 		: out 	std_logic_vector (7 downto 0)
    );
	end component ;
	
	signal res_add  	: std_logic_vector (3 downto 0);
	
begin

  -- valeurs des sorties (à modifier)

  -- convention afficheur 7 segments 0 => allumé, 1 => éteint
  --ssg <= (others => '1');
  -- aucun afficheur sélectionné
  an(7 downto 0) <= (0 => '0', others => '1');
  -- 16 leds éteintes
  led(14 downto 0) <= (others => '0');

  -- connexion du (des) composant(s) avec les ports de la carte
	add : add4
		port map (swt(3 downto 0),  res_add, led(15), swt(15), swt(7 downto 4));
   	 
	dec7 : dec7seg
		port map (res_add, ssg);
	 
end synthesis;
