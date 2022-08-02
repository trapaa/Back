package com.example.demo.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class TypeCritere {
	@Id
	@GeneratedValue 
	private long typeCritereId;
	@Column(nullable = true)
	private String typeCritereLibelle;
	@Column(columnDefinition = "TEXT")
	private String typeCritereDescription;
	private String typeCritereLibelleAr;
	private String typeCritereDescriptionAr;
	
	
	
	public String getTypeCritereLibelleAr() {
		return typeCritereLibelleAr;
	}
	public void setTypeCritereLibelleAr(String typeCritereLibelleAr) {
		this.typeCritereLibelleAr = typeCritereLibelleAr;
	} 
	public String getTypeCritereDescriptionAr() {
		return typeCritereDescriptionAr;
	}
	public void setTypeCritereDescriptionAr(String typeCritereDescriptionAr) {
		this.typeCritereDescriptionAr = typeCritereDescriptionAr;
	}
	public long getTypeCritereId() {
		return typeCritereId;
	}
	public void setTypeCritereId(long typeCritereId) {
		this.typeCritereId = typeCritereId;
	}
	public String getTypeCritereLibelle() {
		return typeCritereLibelle;
	}
	public void setTypeCritereLibelle(String typeCritereLibelle) {
		this.typeCritereLibelle = typeCritereLibelle;
	}
	public String getTypeCritereDescription() {
		return typeCritereDescription;
	}
	public void setTypeCritereDescription(String typeCritereDescription) {
		this.typeCritereDescription = typeCritereDescription;
	}
	public TypeCritere() {
		super();
	}
	
	
	
	@OneToMany(mappedBy = "TypeCritere", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	
	
			private Set<TypeCahierCharges> TypeCahierCharges;


}
