package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "etat")
public class Etat {
private Integer etatId;
	
	private String etatLibelle;
	private int etatOrdre;
	private String etatImageCouleur;
	private EtatCategorie EtatCategorie;
	public Etat(String etatLibelle, int etatOrdre, String etatImageCouleur,
			com.example.demo.entity.EtatCategorie etatCategorie) {
		super();
		this.etatLibelle = etatLibelle;
		this.etatOrdre = etatOrdre;
		this.etatImageCouleur = etatImageCouleur;
		EtatCategorie = etatCategorie;
	}
	public Etat() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEtatId() {
		return etatId;
	}
	public void setEtatId(Integer etatId) {
		this.etatId = etatId;
	}
	public String getEtatLibelle() {
		return etatLibelle;
	}
	public void setEtatLibelle(String etatLibelle) {
		this.etatLibelle = etatLibelle;
	}
	public int getEtatOrdre() {
		return etatOrdre;
	}
	public void setEtatOrdre(int etatOrdre) {
		this.etatOrdre = etatOrdre;
	}
	public String getEtatImageCouleur() {
		return etatImageCouleur;
	}
	public void setEtatImageCouleur(String etatImageCouleur) {
		this.etatImageCouleur = etatImageCouleur;
	}
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "etatCategorieId")
	public EtatCategorie getEtatCategorie() {
		return EtatCategorie;
	}
	public void setEtatCategorie(EtatCategorie etatCategorie) {
		EtatCategorie = etatCategorie;
	}

	
	
}


