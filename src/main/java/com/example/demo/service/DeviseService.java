package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.TypeCritereRepository;

@Service
public class DeviseService {
	@Autowired
	DeviseRepository repo;
	
	
	public List<Devise> ajouter(Devise t) {
		   repo.save(t);
		   return repo.findByOrderByDeviseIdDesc();
	 }
	
	
	public List<Devise> supprimer(Integer id) {
		repo.deleteById(id);
		return repo.findByOrderByDeviseIdDesc();
	}
	
	
	public List<Devise> getAll(){
		return repo.findByOrderByDeviseIdDesc();
	}
	
	
	public Devise getone(Integer id){
		return repo.getById(id);
	}
	
	public void update(Integer id,Devise t1) {
		Devise t = new Devise();
		t= repo.getById(id);
		t.setDeviseIdentifiant(t1.getDeviseIdentifiant());
		t.setDeviseNbDecimale(t1.getDeviseNbDecimale());
		t.setDeviseNom(t1.getDeviseNom());
		t.setDeviseNomDecimale(t1.getDeviseNomDecimale());
		
		repo.save(t);
		
	}

}
