package com.example.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "gouvernerat")
public class Gouvernerat implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2607324122184719996L;
	private Integer gouverneratId;
	private Pays pays;
	private String gouverneratLibelle;
	//private Set<Ville> villes = new HashSet<Ville>(0);

	public Gouvernerat() {
	}

	public Gouvernerat(Pays pays, String gouverneratLibelle /*,Set<Ville> villes*/) {
		this.pays = pays;
		this.gouverneratLibelle = gouverneratLibelle;
		//this.villes = villes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "gouverneratId", unique = true, nullable = false)
	public Integer getGouverneratId() {
		return this.gouverneratId;
	}

	public void setGouverneratId(Integer gouverneratId) {
		this.gouverneratId = gouverneratId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "paysId")
	public Pays getPays() {
		return this.pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	@Column(name = "gouverneratLibelle", length = 254)
	public String getGouverneratLibelle() {
		return this.gouverneratLibelle;
	}

	public void setGouverneratLibelle(String gouverneratLibelle) {
		this.gouverneratLibelle = gouverneratLibelle;
	}
	
	
	
	

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "gouvernerat")
	public Set<Ville> getVilles() {
		return this.villes;
	}

	public void setVilles(Set<Ville> villes) {
		this.villes = villes;
	}*/

}
