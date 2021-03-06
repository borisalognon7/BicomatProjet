package com.c353.bicomat.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompteBancaire {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String numeroCompte;
	
	@Column
	private String typeCompte;
	
	@Column
	private boolean decouvert;
	
	@Column
	private double tauxRenumeration;

    @ManyToOne
    @JoinColumn( name = "id_banque" )
    private Banque  banque;
    
	public Long getId() {
		return id;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public boolean isDecouvert() {
		return decouvert;
	}

	public void setDecouvert(boolean decouvert) {
		this.decouvert = decouvert;
	}

	public double getTauxRenumeration() {
		return tauxRenumeration;
	}

	public void setTauxRenumeration(double tauxRenumeration) {
		this.tauxRenumeration = tauxRenumeration;
	}

	
	public Banque getBanque() {
		return banque;
	}

	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	public CompteBancaire(Long id, String numeroCompte, String typeCompte, boolean decouvert, double tauxRenumeration) {
		super();
		this.id = id;
		this.numeroCompte = numeroCompte;
		this.typeCompte = typeCompte;
		this.decouvert = decouvert;
		this.tauxRenumeration = tauxRenumeration;
	}

	public CompteBancaire() {
		super();
		
	}
	
	

}
