package com.example.demo.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "ville")
public class Ville  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer villeId;
	private Gouvernerat gouvernerat;
	private String villeNom;

	
	
	
	public Ville() {
	}

	public Ville(Gouvernerat gouvernerat) {
		this.gouvernerat = gouvernerat;
	}

	public Ville(Gouvernerat gouvernerat, String villeNom) {
		this.gouvernerat = gouvernerat;
		this.villeNom = villeNom;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "villeId", unique = true, nullable = false)
	public Integer getVilleId() {
		return this.villeId;
	}

	public void setVilleId(Integer villeId) {
		this.villeId = villeId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "gouverneratId", nullable = false)
	public Gouvernerat getGouvernerat() {
		return this.gouvernerat;
	}

	public void setGouvernerat(Gouvernerat gouvernerat) {
		this.gouvernerat = gouvernerat;
	}

	@Column(name = "villeNom", length = 254)
	public String getVilleNom() {
		return this.villeNom;
	}

	public void setVilleNom(String villeNom) {
		this.villeNom = villeNom;
	}
	
	

}
