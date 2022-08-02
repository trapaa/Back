package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TypeCahierCharges;
import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.TypeCahierChargesRepository;
import com.example.demo.repository.TypeCritereRepository;

@Service
public class TypeCahierChargesService {
	
	@Autowired
	TypeCahierChargesRepository repo;
	@Autowired
	TypeCritereRepository repo1;
	
	public List<TypeCahierCharges> ajouter(TypeCahierCharges t,Long typeCahierChargeIdType) {
	
		TypeCritere t1=new  TypeCritere();
		t1=repo1.getById(typeCahierChargeIdType);
		 t.setTypeCritere(t1);;
				repo.save(t);
		   return repo.findAll();
	 }
	
	
	
	public List<TypeCahierCharges> supprimer(Long id) {
		repo.deleteById(id);
		return repo.findAll();
	}
	
	
	public List<TypeCahierCharges> getAll(){
		return repo.findAll();
	}
	
	
	public TypeCahierCharges getone(Long id){
		return repo.getById(id);
	}
	
	public void update(Long id,TypeCahierCharges t1,Long typeCahierChargeIdType) {
		TypeCahierCharges t = new TypeCahierCharges();
		TypeCritere t2=new  TypeCritere();
		t2=repo1.getById(typeCahierChargeIdType);
		t= repo.getById(id);
		t.setOrdre(t1.getOrdre());
		t.setTypeCahierChargesDescription(t1.getTypeCahierChargesDescription());
		t.setTypeCahierChargesLibelle(t1.getTypeCahierChargesLibelle());
		t.setTypeCritere(t2);
		repo.save(t);
		
	}

}
