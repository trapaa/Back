package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Fonction;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.FonctionRepository;

@Service
public class FonctionService {
	@Autowired
	FonctionRepository repo;
	
	
	public List<Fonction> ajouter(Fonction t) {
		   repo.save(t);
		   return repo.findByOrderByFonctionIdDesc();
	 }
	
	
	public List<Fonction> supprimer(Integer id) {
		repo.deleteById(id);
		return repo.findByOrderByFonctionIdDesc();
	}
	
	
	public List<Fonction> getAll(){
		return repo.findByOrderByFonctionIdDesc();
	}
	
	
	public Fonction getone(Integer id){
		return repo.getById(id);
	}
	
	public void update(Integer id,Fonction t1) {
		Fonction t = new Fonction();
		t= repo.getById(id);
		t.setFonctionLibelle(t1.getFonctionLibelle());;
	
		
		repo.save(t);
		
	}

}
