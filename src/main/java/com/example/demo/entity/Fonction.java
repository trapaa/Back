package com.example.demo.entity;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "fonction")
public class Fonction implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2437377783933444166L;
	private Integer fonctionId;
	private String fonctionLibelle;
//	private Set<Soumissionnaire> soumissionnaires = new HashSet<Soumissionnaire>(
//			0);

	public Fonction() {
	}

	public Fonction(String fonctionLibelle) {
		this.fonctionLibelle = fonctionLibelle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "fonctionId", unique = true, nullable = false)
	public Integer getFonctionId() {
		return this.fonctionId;
	}

	public void setFonctionId(Integer fonctionId) {
		this.fonctionId = fonctionId;
	}

	@Column(name = "fonctionLibelle", length = 254)
	public String getFonctionLibelle() {
		return this.fonctionLibelle;
	}

	public void setFonctionLibelle(String fonctionLibelle) {
		this.fonctionLibelle = fonctionLibelle;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fonction")
//	public Set<Soumissionnaire> getSoummissionnaires() {
//		return this.soumissionnaires;
//	}
//
//	public void setSoummissionnaires(Set<Soumissionnaire> soumissionnaires) {
//		this.soumissionnaires = soumissionnaires;
//	}

}
