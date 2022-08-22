package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "devise")
public class Devise  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7104263402000907190L;
	private Integer deviseId;
	private String deviseIdentifiant;
	private String deviseNom;
	private Integer deviseNbDecimale;
	private String deviseNomDecimale;
	private Set<Pays> payses = new HashSet<Pays>(0);

	public Devise() {
	}

	public Devise(String deviseIdentifiant, String deviseNom,
			Integer deviseNbDecimale, String deviseNomDecimale, Set<Pays> payses) {
		this.deviseIdentifiant = deviseIdentifiant;
		this.deviseNom = deviseNom;
		this.deviseNbDecimale = deviseNbDecimale;
		this.deviseNomDecimale = deviseNomDecimale;
		this.payses = payses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "deviseId", unique = true, nullable = false)
	public Integer getDeviseId() {
		return this.deviseId;
	}

	public void setDeviseId(Integer deviseId) {
		this.deviseId = deviseId;
	}

	@Column(name = "deviseIdentifiant", length = 254)
	public String getDeviseIdentifiant() {
		return this.deviseIdentifiant;
	}

	public void setDeviseIdentifiant(String deviseIdentifiant) {
		this.deviseIdentifiant = deviseIdentifiant;
	}

	@Column(name = "deviseNom", length = 254)
	public String getDeviseNom() {
		return this.deviseNom;
	}

	public void setDeviseNom(String deviseNom) {
		this.deviseNom = deviseNom;
	}

	@Column(name = "deviseNbDecimale")
	public Integer getDeviseNbDecimale() {
		return this.deviseNbDecimale;
	}

	public void setDeviseNbDecimale(Integer deviseNbDecimale) {
		this.deviseNbDecimale = deviseNbDecimale;
	}

	@Column(name = "deviseNomDecimale", length = 254)
	public String getDeviseNomDecimale() {
		return this.deviseNomDecimale;
	}

	public void setDeviseNomDecimale(String deviseNomDecimale) {
		this.deviseNomDecimale = deviseNomDecimale;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "Devise")
	public Set<Pays> getPayses() {
		return this.payses;
	}

	public void setPayses(Set<Pays> payses) {
		this.payses = payses;
	}*/
	
	
	
	
	
	
	
	
	

	
	
}
