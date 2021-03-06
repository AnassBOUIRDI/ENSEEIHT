/* Multiplication de matrices avec decoupage vertical de B sur l'indice j et execution dans differents thread 
*/

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>

/* nombre de threads */
#define NB_TH 4 
#define PASK 8 

/*au cas ou on abesoin de synchroniser l'acces memoire 
static pthread_mutex_t mon_verrou;
pthread_mutex_lock(&mon_verrou);
pthread_mutex_unlock(&mon_verrou);
*/

/* pour que les matrices soient visibles par les threads */
float *MA, *MB, *MC;  
int TM;
  
/* -------------- Fonction pour les thread ----------*/
void * thread_fonc(void * p_data) {
  int i,j,j1,j2,k, ke;
  float cc;

/*Compléter pour récupérer j1 et j2, bornes de la bande de B sur laquelle travaille le thread */

  j1 			= * ((int*) p_data);
  j2 			= *(((int*) p_data)+1);

	for (ke = 0 ; ke < TM ; ke+=PASK){ 
   		for (i = 0 ; i < TM ; i++){ 
		     for (j = j1 ; j < j2 ; j++){
	  			cc=MC[i*TM+j];

    			for (k = ke ; k < ke+PASK ; k++){
  					cc +=MA[i*TM+k]*MB[k*TM+j];
    			}

	  			MC[i*TM+j] =cc;
				}
			}
	}
 pthread_exit(NULL);
}
/*_____________________ AVEC COPIE DANS UNE MATRICE C ______________*/
void * thread_fonc(void * p_data) {
  int i,j,j1,j2,k, ke, largeur;
  float * C;
  float cc;

/*Compléter pour récupérer j1 et j2, bornes de la bande de B sur laquelle travaille le thread */

  j1 	= * ((int*) p_data);
  j2 	= *(((int*) p_data)+1);
  largeur = j2-j1;

  C = (float*) malloc(largeur*TM*sizeof(float));

  for (i = 0 ; i < TM ; i++){ 
  		for (j = 0 ; j < largeur; j++){ 
   				C[i*largeur+j] = 0.0;
   		}
  }

	for (ke = 0 ; ke < TM ; ke+=PASK){ 
   		for (i = 0 ; i < TM ; i++){ 
		     for (j = j1 ; j < j2 ; j++){
	  			cc=C[i*largeur+j-j1];

    			for (k = ke ; k < ke+PASK ; k++){
  					cc +=MA[i*TM+k]*MB[k*TM+j];
    			}

	  			C[i*largeur+j-j1] = cc;
				}
			}
	}
	
	for (i = 0 ; i < TM ; i++){ 
  		for (j = 0 ; j < largeur ; j++){ 
   				MC[i*TM+j1+j] = C[i*largeur+j];
   		}
  }
 pthread_exit(NULL);
}
/* _______________ FIN COPIE DANS MATRICE C ____________________*/

/* _______________ DEBUT DECOUPAGE i ou k  _______________*/

void * thread_fonc(void * p_data) {
  int i,j,i1,i2,j1,j2,k, ke, largeur;
  float * C;
  float cc;

/*Compléter pour récupérer j1 et j2, bornes de la bande de B sur laquelle travaille le thread */

  i1 	= * ((int*) p_data);
  i2 	= * (((int*) p_data)+1);
  j1 	= * (((int*) p_data)+2);
  j2 	= * (((int*) p_data)+3);
  largeur = j2-j1;

  C = (float*) malloc(largeur*TM*sizeof(float));

  for (i = 0 ; i < TM ; i++){ 
  		for (j = 0 ; j < largeur; j++){ 
   				C[i*largeur+j] = 0.0;
   		}
  }

	for (ke = 0 ; ke < TM ; ke+=PASK){ 
   		for (i = 0 ; i < TM ; i++){ 
		     for (j = j1 ; j < j2 ; j++){
	  			cc=C[i*largeur+j-j1];

    			for (k = ke ; k < ke+PASK ; k++){
  					cc +=MA[i*TM+k]*MB[k*TM+j];
    			}

	  			C[i*largeur+j-j1] = cc;
				}
			}
	}
	
	for (i = 0 ; i < TM ; i++){ 
  		for (j = 0 ; j < largeur ; j++){ 
   				MC[i*TM+j1+j] = C[i*largeur+j];
   		}
  }

 	pthread_exit(NULL);
}
 /*_________________ FIN ____________________*/


/*-------------------------------------------------------
 Program main
--------------------------------------------------------*/
 
int main(int argc, char* argv[])
{
   register int i, j, msec, ret,nth;
   
/* Structure stockant les id des threads */
   pthread_t thread_id[NB_TH];

/*tableau des parametres des threads*/
   int ta[NB_TH][2]; 

/* TM saisie comme argument du main, sinon 1000 par defaut */
   TM=1000;
   if (argc > 1) {
   	TM=atoi(argv[1]);
   }
/* Verification de la faisabilite du decoupage */
   if ((TM % NB_TH)!=0) {
   	printf("TM doit etre multiple de %d\n",NB_TH);
		exit(1);
   }

/* allocation memoire pour les matrices A, B, et C */
   MA = (float *) malloc(TM*TM*sizeof(float));
   MB = (float *) malloc(TM*TM*sizeof(float));
   MC = (float *) malloc(TM*TM*sizeof(float));

/* initialisation des matrices avec des valeurs permettant de verifier le resultat */
   for(i = 0; i < TM; i++){
      for(j = 0; j < TM; j++){
	      	MA[i*TM+j] = 1.0;
	      	MB[i*TM+j] = 1.0;
					MC[i*TM+j]=0.0;
					if (i==j) {
						MA[i*TM+j]=(float) (i+1);
						MB[i*TM+j]=(float) (i+1);
					}
      }
   }

/* Creation des threads */
   printf ("Creation des threads  !\n");
   for (nth=0; nth<NB_TH; nth++) {
   		/* remplir dans ta les parametres pour thread_fonc */

   		ta[nth][0] =  nth * TM/NB_TH;
   		ta[nth][1] = (nth+1) * 	TM/NB_TH;
			ret = pthread_create (&thread_id[nth], NULL, thread_fonc, (void *) ta[nth]);
     	if (ret) {
       	perror ("thread_create");
				exit(2);
     	}
   } 

   /* Attente de la fin des threads. */
   printf ("Attente de la fin des threads  !\n");
   for (i=0; i<NB_TH; i++) {
   	pthread_join (thread_id[i], NULL);
   }

/* Verification des resultats */
  for(i = 0; i < TM; i++){
    for(j = 0; j < TM; j++){
	if ((i==j) && (MC[i*TM+j] != (float)((i+1)*(i+1)+TM-1))) 	   	{		printf("Erreur i: %d j: %d\n", i, j); exit(1);
		}
		else if ((i!=j) && (MC[i*TM+j] != (float)(i+j+TM))) 			{
			printf("Erreur i: %d j: %d\n", i, j);
			exit(1);
		}
      }
   } 

/* liberation de l'espace memoire */
   free(MA);
   free(MB);
   free(MC);
  
   return EXIT_SUCCESS;
}

-D_REENTRANT pour que la fonction utilisée par les threads soit réentrante. Une fonction
réentrante peut être parcourue simultanément par plusieurs fils d’exécution
sans que cela ne cause de problèmes. Elle ne conserve pas de données
statiques entre appels successifs, ne retourne pas de données statiques, et
n’appelle pas de fonctions non-réentrantes.
