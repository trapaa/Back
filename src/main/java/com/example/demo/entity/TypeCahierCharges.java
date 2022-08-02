package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class TypeCahierCharges {
	@Id
	@GeneratedValue 
	@Column(nullable = false,length=20)
	private long typeCahierChargesId;
	@Column(columnDefinition = "TEXT")
	private String typeCahierChargesDescription;
	@Column(nullable = true,length=50)
	private String typeCahierChargesLibelle;
	@Column(nullable = true,length=11)
	private int ordre;
	
	
	
	
	
	
	public long getTypeCahierChargesId() {
		return typeCahierChargesId;
	}






	public void setTypeCahierChargesId(long typeCahierChargesId) {
		this.typeCahierChargesId = typeCahierChargesId;
	}






	public String getTypeCahierChargesDescription() {
		return typeCahierChargesDescription;
	}






	public void setTypeCahierChargesDescription(String typeCahierChargesDescription) {
		this.typeCahierChargesDescription = typeCahierChargesDescription;
	}






	public String getTypeCahierChargesLibelle() {
		return typeCahierChargesLibelle;
	}






	public void setTypeCahierChargesLibelle(String typeCahierChargesLibelle) {
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
	}






	public int getOrdre() {
		return ordre;
	}






	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}






	public TypeCritere getTypeCritere() {
		return TypeCritere;
	}






	public void setTypeCritere(TypeCritere typeCritere) {
		TypeCritere = typeCritere;
	}






	public TypeCahierCharges() {
		super();
	}






	public TypeCahierCharges(String typeCahierChargesDescription, String typeCahierChargesLibelle, int ordre,
			com.example.demo.entity.TypeCritere typeCritere) {
		super();
		this.typeCahierChargesDescription = typeCahierChargesDescription;
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
		this.ordre = ordre;
		TypeCritere = typeCritere;
	}






	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "typeCahierChargeIdType",referencedColumnName="typeCritereId", nullable = false)
	 @OnDelete(action = OnDeleteAction.CASCADE)
	private TypeCritere TypeCritere;
	

}
