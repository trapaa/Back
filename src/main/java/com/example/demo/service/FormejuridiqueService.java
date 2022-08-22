package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Formejuridique;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.FormejuridiqueRepository;

@Service
public class FormejuridiqueService {
	@Autowired
	FormejuridiqueRepository repo;
	
	
	public List<Formejuridique> ajouter(Formejuridique t) {
		   repo.save(t);
		   return repo.findByOrderByFormeJuridiqueIdDesc();
	 }
	
	
	public List<Formejuridique> supprimer(Integer id) {
		repo.deleteById(id);
		return repo.findByOrderByFormeJuridiqueIdDesc();
	}
	
	
	public List<Formejuridique> getAll(){
		return repo.findByOrderByFormeJuridiqueIdDesc();
	}
	
	
	public Formejuridique getone(Integer id){
		return repo.getById(id);
	}
	
	public void update(Integer id,Formejuridique t1) {
		Formejuridique t = new Formejuridique();
		t= repo.getById(id);
	t.setFormeJuridiqueNom(t1.getFormeJuridiqueNom());
		
		repo.save(t);
		
	}

}
