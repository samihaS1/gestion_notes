package gestion_note;

import aiac.gi18.java.complexe.Complexe;

public class etudiannt {
	 private int id;
	private String nom;
	private double note;
	public etudiannt() {
		this.note =10;
	}
	public etudiannt(int id ,string nom) {
	    note =10;
	    this.nom=nom;
	    this.id=id;
		
	}
	
	public String  toString( ) {
		 return this.nom +":" this.note;
	}
	@Override
	public boolean equals(object obj) {
		if (! (obj instanceof etudiannt ) ){
			return false;
		}
	return	((etudiann)obj).id==this.id&& ((etudiannt)obj).nom==this.nom;
	}
	@Override
		
	}
	
	
	

}
