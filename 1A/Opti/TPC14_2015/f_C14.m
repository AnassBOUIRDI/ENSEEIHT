function fval=f_C14(beta)
%
% Calcul de la fonctionnelle des moindres carres correspondant au probleme de 
% datation par le carbone 14, traite dans le cadre des TP d'Optimisation
% Numerique de 2e annee ENSEEIHT-IMA.
% 
% FVAL = f_C14(BETA) renvoie en FVAL la valeur de la fonctionnelle des moindres 
% carres calculee en le vecteur BETA. Elle suppose initialisees les variables
% globales Ti et Ai, representant des ages en annees ainsi que les 
% radioactivites du carbone 14 mesurees a ces ages.
%
% Entree :
%	beta : un vecteur representant les parametres du modele d'evolution
%	de la radioactivite du carbone 14
%
% Sortie :
%	fval : valeur de la fonctionnelle des moindres carres calculee en
%	beta
%
% ENSEEIHT - Annee universitaire 2015-2016
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
global Ti Ai % Vecteurs lignes des ages et radioactivites correspondantes

tmp = res_C14(beta);

fval = 1/2 * power(norm(tmp, 2), 2);