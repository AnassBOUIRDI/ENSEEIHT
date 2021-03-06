package egg;
import java.util.*;
import fr.n7.stl.ast.*;
import fr.n7.stl.ast.impl.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_Instructions_Bloc {
LEX_Bloc scanner;
  S_Instructions_Bloc() {
	}
  S_Instructions_Bloc(LEX_Bloc scanner, boolean eval) {
	this.scanner = scanner;
	this.att_eval = eval;
	this.att_scanner = scanner;
	}
int [] sync= new int[0];
  BlockFactory att_factory;
  boolean att_eval;
  List<Instruction> att_listInst;
  LEX_Bloc att_scanner;
  private void regle6() throws Exception {

	//declaration
	S_Instruction_Bloc x_2 = new S_Instruction_Bloc(scanner,att_eval) ;
	S_Instructions_Bloc x_3 = new S_Instructions_Bloc(scanner,att_eval) ;
	//appel
if  (att_eval)	  action_auto_inh_6(x_2, x_3);
	x_2.analyser() ;
	x_3.analyser() ;
if  (att_eval)	  action_listInst_6(x_2, x_3);
  }
  private void regle5() throws Exception {

	//declaration
	//appel
if  (att_eval)	  action_listInst_5();
  }
private void action_auto_inh_6(S_Instruction_Bloc x_2, S_Instructions_Bloc x_3) throws Exception {
try {
// instructions
x_2.att_factory=this.att_factory;
x_3.att_factory=this.att_factory;
}catch(RuntimeException e) {	   att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "Bloc", "#auto_inh","Instructions -> Instruction Instructions1 #listInst ;"});
}
  }
private void action_listInst_6(S_Instruction_Bloc x_2, S_Instructions_Bloc x_3) throws Exception {
try {
// instructions
this.att_listInst= new ArrayList<Instruction>(x_3.att_listInst);
this.att_listInst.add(x_2.att_inst);
}catch(RuntimeException e) {	   att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "Bloc", "#listInst","Instructions -> Instruction Instructions1 #listInst ;"});
}
  }
private void action_listInst_5() throws Exception {
try {
// instructions
this.att_listInst= new ArrayList<Instruction>();
}catch(RuntimeException e) {	   att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "Bloc", "#listInst","Instructions -> #listInst ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_Bloc.token_accolade_fermante : // 20
        regle5 () ;
      break ;
      case LEX_Bloc.token_type_bool : // 51
        regle6 () ;
      break ;
      case LEX_Bloc.token_type_int : // 50
        regle6 () ;
      break ;
      case LEX_Bloc.token_inferieur : // 25
        regle6 () ;
      break ;
      case LEX_Bloc.token_identificateur : // 54
        regle6 () ;
      break ;
      case LEX_Bloc.token_si : // 44
        regle6 () ;
      break ;
      case LEX_Bloc.token_tant_que : // 47
        regle6 () ;
      break ;
      case LEX_Bloc.token_afficher : // 46
        regle6 () ;
      break ;
      default :
        	   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IBlocMessages.id_Bloc_unexpected_token,BlocMessages.Bloc_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
