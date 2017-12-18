---------------- MODULE run_tas_pile ----------------

EXTENDS Naturals, FiniteSets, Sequences, var_raffinement

CONSTANT
    D, N

A == INSTANCE tas

C == INSTANCE pile

Liaison(tas, pile) ==
 \A d \in D : Cardinality({i \in 1..Len(pile) : pile[i] = d}) = IF d \in DOMAIN(tas) THEN  
                                                                     tas[d]
                                                                ELSE 0  

INSTANCE run_raffinement WITH ETATA <- A!ETAT, InitA <- A!Init, ContratClientA <- A!ContratClient, ContratModuleA <- A!ContratModule,
                              ETATC <- C!ETAT, InitC <- C!Init, ContratClientC <- C!ContratClient, ContratModuleC <- C!ContratModule


================================================================
