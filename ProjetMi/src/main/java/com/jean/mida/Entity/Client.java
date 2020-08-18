package com.jean.mida.Entity;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity

public class Client implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long codeClient;
	private String nomClient;
	private String prenom;
	private String profession;
	private Long numPhone;
	private String adresse;
	@OneToMany(mappedBy= "client",fetch=FetchType.LAZY)
	private Collection<Visite> visites;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomClient, String prenom, String profession, Long numPhone, String adresse) {
		super();
		this.nomClient = nomClient;
		this.prenom = prenom;
		this.profession = profession;
		this.numPhone = numPhone;
		this.adresse = adresse;
	}

	public Long getCodeClient() {
		return codeClient;
	}

	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public Long getNumPhone() {
		return numPhone;
	}

	public void setNumPhone(Long numPhone) {
		this.numPhone = numPhone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Collection<Visite> getVisites() {
		return visites;
	}

	public void setVisites(Collection<Visite> visites) {
		this.visites = visites;
	}
}
