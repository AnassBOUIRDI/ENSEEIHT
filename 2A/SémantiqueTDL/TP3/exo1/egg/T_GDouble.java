package egg;
import java.util.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.lex.*;
public class T_GDouble {
  LEX_GDouble att_scanner;
  String att_txt;
  LEX_GDouble scanner;
  private String txt;
  public String getTxt(){return txt;}
  public T_GDouble(LEX_GDouble scanner ) {
	this.scanner = scanner ;
	this.att_scanner = scanner ;
	}
  public void analyser(int t) throws EGGException {
	scanner.lit ( 1 ) ;
	txt = scanner.fenetre[0].getNom() ;
	att_txt = txt ;
	scanner.accepter_sucre ( t ) ;
	}
	}
