package com.jean.mida.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Appartement implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long codeAppart;
	private Long numEtage;
	private Long superficie;
	private Long nbreChambre;
	private Long prixPrevisionel;
	
	
	public Appartement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Appartement( Long numEtage, Long superficie, Long nbreChambre, Long prixPrevisionel) {
		super();
		
		this.numEtage = numEtage;
		this.superficie = superficie;
		this.nbreChambre = nbreChambre;
		this.prixPrevisionel = prixPrevisionel;
	}


	public Long getCodeAppart() {
		return codeAppart;
	}


	public void setCodeAppart(Long codeAppart) {
		this.codeAppart = codeAppart;
	}


	public Long getNumEtage() {
		return numEtage;
	}


	public void setNumEtage(Long numEtage) {
		this.numEtage = numEtage;
	}


	public Long getSuperficie() {
		return superficie;
	}


	public void setSuperficie(Long superficie) {
		this.superficie = superficie;
	}


	public Long getNbreChambre() {
		return nbreChambre;
	}


	public void setNbreChambre(Long nbreChambre) {
		this.nbreChambre = nbreChambre;
	}


	public Long getPrixPrevisionel() {
		return prixPrevisionel;
	}


	public void setPrixPrevisionel(Long prixPrevisionel) {
		this.prixPrevisionel = prixPrevisionel;
	}
	
	

	

}
