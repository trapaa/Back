package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "etatCategorie")
public class EtatCategorie {

	private Integer etatCategorieId;
	
	private String etatCategorieLibelle;
	private String etatCategorieDescription;
	public EtatCategorie(String etatCategorieLibelle, String etatCategorieDescription) {
		super();
		this.etatCategorieLibelle = etatCategorieLibelle;
		this.etatCategorieDescription = etatCategorieDescription;
	}
	public EtatCategorie() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEtatCategorieId() {
		return etatCategorieId;
	}
	public void setEtatCategorieId(Integer etatCategorieId) {
		this.etatCategorieId = etatCategorieId;
	}
	public String getEtatCategorieLibelle() {
		return etatCategorieLibelle;
	}
	public void setEtatCategorieLibelle(String etatCategorieLibelle) {
		this.etatCategorieLibelle = etatCategorieLibelle;
	}
	public String getEtatCategorieDescription() {
		return etatCategorieDescription;
	}
	public void setEtatCategorieDescription(String etatCategorieDescription) {
		this.etatCategorieDescription = etatCategorieDescription;
	}
	 
}
