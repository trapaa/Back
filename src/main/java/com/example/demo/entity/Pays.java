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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "pays")
public class Pays  implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer paysId;
	private Devise devise;
	private String paysCode;
	private String paysLibelle;
	//private Set<Gouvernerat> gouvernerats = new HashSet<Gouvernerat>(0);

	
	
	public Pays() {
	}

	public Pays(Devise devise, String paysCode, String paysLibelle,
			Set<Gouvernerat> gouvernerats) {
		this.devise = devise;
		this.paysCode = paysCode;
		this.paysLibelle = paysLibelle;
		//this.gouvernerats = gouvernerats;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paysId", unique = true, nullable = false)
	public Integer getPaysId() {
		return this.paysId;
	}

	public void setPaysId(Integer paysId) {
		this.paysId = paysId;
	}


	//@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "deviseId")

	public Devise getDevise() {
		return this.devise;
	}

	public void setDevise(Devise devise) {
		this.devise = devise;
	}

	@Column(name = "paysCode", length = 254)
	public String getPaysCode() {
		return this.paysCode;
	}

	public void setPaysCode(String paysCode) {
		this.paysCode = paysCode;
	}

	@Column(name = "paysLibelle", length = 254)
	public String getPaysLibelle() {
		return this.paysLibelle;
	}

	public void setPaysLibelle(String paysLibelle) {
		this.paysLibelle = paysLibelle;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "pays")
	public Set<Gouvernerat> getGouvernerats() {
		return this.gouvernerats;
	}

	public void setGouvernerats(Set<Gouvernerat> gouvernerats) {
		this.gouvernerats = gouvernerats;
	}*/

}
