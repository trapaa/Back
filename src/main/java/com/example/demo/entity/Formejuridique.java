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
@Table(name = "formejuridique")
public class Formejuridique implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7236597661381059264L;
	private Integer formeJuridiqueId;
	private String formeJuridiqueNom;
//	private Set<Soumissionnaire> soumissionnaires = new HashSet<Soumissionnaire>(
//			0);

	public Formejuridique() {
	}

	public Formejuridique(String formeJuridiqueNom) {
		this.formeJuridiqueNom = formeJuridiqueNom;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "formeJuridiqueId", unique = true, nullable = false)
	public Integer getFormeJuridiqueId() {
		return this.formeJuridiqueId;
	}

	public void setFormeJuridiqueId(Integer formeJuridiqueId) {
		this.formeJuridiqueId = formeJuridiqueId;
	}

	@Column(name = "formeJuridiqueNom", length = 254)
	public String getFormeJuridiqueNom() {
		return this.formeJuridiqueNom;
	}

	public void setFormeJuridiqueNom(String formeJuridiqueNom) {
		this.formeJuridiqueNom = formeJuridiqueNom;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formejuridique")
//	public Set<Soumissionnaire> getSoummissionnaires() {
//		return this.soumissionnaires;
//	}
//
//	public void setSoummissionnaires(Set<Soumissionnaire> soumissionnaires) {
//		this.soumissionnaires = soumissionnaires;
//	}

}
