package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Gouvernerat;
import com.example.demo.entity.TypeCahierCharges;
import com.example.demo.entity.TypeCritere;
import com.example.demo.entity.Ville;
import com.example.demo.repository.GouverneratRepository;
import com.example.demo.repository.TypeCahierChargesRepository;
import com.example.demo.repository.TypeCritereRepository;
import com.example.demo.repository.VilleRepository;
@Service
public class VilleService {
	@Autowired
	VilleRepository repo;
	@Autowired
	GouverneratRepository repo1;
	
	public List<Ville> ajouter(Ville t,int id) {
	
		Gouvernerat t1=new  Gouvernerat();
		t1=repo1.getById(id);
		 t.setGouvernerat(t1);;
				repo.save(t);
		   return repo.findByOrderByVilleIdDesc();
	 }
	
	
	
	public List<Ville> supprimer(int id) {
		repo.deleteById(id);
		   return repo.findByOrderByVilleIdDesc();
	}
	
	
	public List<Ville> getAll(){
		   return repo.findByOrderByVilleIdDesc();
	}
	
	
	public Ville getone(int id){
		return repo.getById(id);
	}
	
	public void update(int id,Ville t1,int gouverneratId) {
		Ville t = new Ville();
		Gouvernerat t2=new  Gouvernerat();
		t2=repo1.getById(gouverneratId);
		t= repo.getById(id);
		t.setVilleNom(t1.getVilleNom());
		t.setGouvernerat(t2);
		repo.save(t);
		
	}


}
