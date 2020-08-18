package com.jean.mida.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int Id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", password=" + password
				+ "]";
	}
	public User(int id, String nom, String prenom, String email, String password) {
		super();
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}
	
	

}
