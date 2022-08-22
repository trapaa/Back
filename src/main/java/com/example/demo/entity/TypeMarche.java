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
@Table(name = "typemarche")
public class TypeMarche {
private Integer typeMarcheId;
	
	private String typeMarcheLibelle;
	private String typeMarcheAcronyme;
	private String typeMarcheDescription;
private int typeMarcheOrdre;
private Etat etat;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getTypeMarcheId() {
	return typeMarcheId;
}
public void setTypeMarcheId(Integer typeMarcheId) {
	this.typeMarcheId = typeMarcheId;
}
public String getTypeMarcheLibelle() {
	return typeMarcheLibelle;
}
public void setTypeMarcheLibelle(String typeMarcheLibelle) {
	this.typeMarcheLibelle = typeMarcheLibelle;
}
public String getTypeMarcheAcronyme() {
	return typeMarcheAcronyme;
}
public void setTypeMarcheAcronyme(String typeMarcheAcronyme) {
	this.typeMarcheAcronyme = typeMarcheAcronyme;
}
public String getTypeMarcheDescription() {
	return typeMarcheDescription;
}
public void setTypeMarcheDescription(String typeMarcheDescription) {
	this.typeMarcheDescription = typeMarcheDescription;
}
public int getTypeMarcheOrdre() {
	return typeMarcheOrdre;
}
public void setTypeMarcheOrdre(int typeMarcheOrdre) {
	this.typeMarcheOrdre = typeMarcheOrdre;
}
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "etatId")
public Etat getEtat() {
	return etat;
}
public void setEtat(Etat etat) {
	this.etat = etat;
}
public TypeMarche(String typeMarcheLibelle, String typeMarcheAcronyme, String typeMarcheDescription,
		int typeMarcheOrdre, Etat etat) {
	super();
	this.typeMarcheLibelle = typeMarcheLibelle;
	this.typeMarcheAcronyme = typeMarcheAcronyme;
	this.typeMarcheDescription = typeMarcheDescription;
	this.typeMarcheOrdre = typeMarcheOrdre;
	this.etat = etat;
}
public TypeMarche() {
	super();
}





}
