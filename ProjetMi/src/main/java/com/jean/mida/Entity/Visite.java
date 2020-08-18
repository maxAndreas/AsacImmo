package com.jean.mida.Entity;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity

public class Visite implements Serializable {

	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long codeVisite;
	private Date dateVisite;
	private String remarque;
	private String decision;
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private Client client;
	public Visite(Date dateVisite, String remarque, String decision) {
		super();
		this.dateVisite = dateVisite;
		this.remarque = remarque;
		this.decision = decision;
	}
	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Date getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	

}
