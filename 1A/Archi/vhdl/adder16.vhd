library IEEE;
library UNISIM;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

entity adder16 is
	port (
		a : in std_logic_vector (15 downto 0) ;
		b : in std_logic_vector (15 downto 0) ;
		cin : in std_logic ;
		s : out std_logic_vector (15 downto 0) ;
		cout : out std_logic
	);
end adder16;

architecture synthesis of adder16 is

	-- submodules declarations
	component adder8
		port (
			a : in std_logic_vector (7 downto 0) ;
			b : in std_logic_vector (7 downto 0) ;
			cin : in std_logic ;
			s : out std_logic_vector (7 downto 0) ;
			cout : out std_logic
		) ;
	end component ;

	-- internal signals declarations
	signal cout1 : std_logic ;

begin

	-- components instanciations
	adder8_0 : adder8 port map (a(7 downto 0), b(7 downto 0), cin, s(7 downto 0), cout1) ;
	adder8_1 : adder8 port map (a(15 downto 8), b(15 downto 8), cout1, s(15 downto 8), cout) ;

end synthesis;
