package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCahierCharges;
import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.PaysRepository;
import com.example.demo.repository.TypeCritereRepository;

@Service
public class PaysService {
	@Autowired
	PaysRepository repo;
	@Autowired
	DeviseRepository repo1;
	
	
	
	
	
	public List<Pays> ajouter(Pays t,Integer id) {
		
		Devise t1=new  Devise();
		t1=repo1.getById(id);
		 t.setDevise(t1);
				repo.save(t);
				return repo.findByOrderByPaysIdDesc();
	 }
	
	
	
	
	
	
	public List<Pays> supprimer(int id) {
		repo.deleteById(id);
		return repo.findByOrderByPaysIdDesc();
	}
	
	
	public List<Pays> getAll(){
		return repo.findByOrderByPaysIdDesc();
	}
	
	
	public Pays getone(int id){
		return repo.getById(id);
	}
	
	
	public void update(int id,Pays t1) {
		Pays t = new Pays();
		t= repo.getById(id);
		t.setPaysCode(t1.getPaysCode());
		t.setPaysLibelle(t1.getPaysLibelle());
		repo.save(t);
		
	}
	
	
	
	
	
	
	
	
	public void update(int id,Pays t1,Integer int1) {
		Pays t = new Pays();
		Devise t2=new  Devise();
		t2=repo1.getById(int1);
		t= repo.getById(id);
		t.setPaysCode(t1.getPaysCode());
		t.setPaysLibelle(t1.getPaysLibelle());
		t.setDevise(t2);
		repo.save(t);
		
	}

}
