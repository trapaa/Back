package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class Operateurs {
	@Id
	@GeneratedValue
	@Column(nullable = true)
	private long operateursId;
	@Column(nullable = true,length=512)
	private String operateursSymbole;
	@Column(columnDefinition = "TEXT")
	private String operateursDescription;
	
	
	
	public long getOperateursId() {
		return operateursId;
	}
	public void setOperateursId(long operateursId) {
		this.operateursId = operateursId;
	}
	public String getOperateursSymbole() {
		return operateursSymbole;
	}
	public void setOperateursSymbole(String operateursSymbole) {
		this.operateursSymbole = operateursSymbole;
	}
	public String getOperateursDescription() {
		return operateursDescription;
	}
	public void setOperateursDescription(String operateursDescription) {
		this.operateursDescription = operateursDescription;
	}
	public Operateurs(String operateursSymbole, String operateursDescription) {
		super();
		this.operateursSymbole = operateursSymbole;
		this.operateursDescription = operateursDescription;
	}
	public Operateurs() {
		super();
	}
	
	
	
	
	
	
	 
}
