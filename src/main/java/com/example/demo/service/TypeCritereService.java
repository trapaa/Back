package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.TypeCritereRepository;

@Service
public class TypeCritereService {
	@Autowired
	TypeCritereRepository repo;
	
	
	public List<TypeCritere> ajouter(TypeCritere t) {
		   repo.save(t);
		   return repo.findByOrderByTypeCritereIdDesc();
	 }
	
	
	public List<TypeCritere> supprimer(Long id) {
		repo.deleteById(id);
		return repo.findByOrderByTypeCritereIdDesc();
	}
	
	
	public List<TypeCritere> getAll(){
		return repo.findByOrderByTypeCritereIdDesc();
	}
	
	
	public TypeCritere getone(Long id){
		return repo.getById(id);
	}
	
	public void update(Long id,TypeCritere t1) {
		TypeCritere t = new TypeCritere();
		t= repo.getById(id);
		t.setTypeCritereDescription(t1.getTypeCritereDescription());
		
		t.setTypeCritereLibelle(t1.getTypeCritereLibelle());
		
		t.setTypeCritereDescriptionAr(t1.getTypeCritereDescriptionAr());
		t.setTypeCritereLibelleAr(t1.getTypeCritereLibelleAr());
		
		repo.save(t);
		
	}
	

}
