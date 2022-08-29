package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Gouvernerat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.GouverneratRepository;
import com.example.demo.repository.PaysRepository;
import com.example.demo.repository.TypeCritereRepository;

@Service
public class GouverneratService {
	@Autowired
	GouverneratRepository repo;
	
	@Autowired
	PaysRepository repo1;
	
	
	
	
	
	
	
	public List<Gouvernerat> ajouter(Gouvernerat t,int id) {
		
		Pays t1=new  Pays();
		t1=repo1.getById(id);
		 t.setPays(t1);;
				repo.save(t);
		   return repo.findByOrderByGouverneratIdDesc();
	 }
	
	
	public List<Gouvernerat> supprimer(Integer id) {
		repo.deleteById(id);
		 return repo.findByOrderByGouverneratIdDesc();
	}
	
	
	public List<Gouvernerat> getAll(){
		 return repo.findByOrderByGouverneratIdDesc();
	}
	
	public List<Gouvernerat> getbypays(int id){
		 return repo.findByPaysPaysId(id);
	}
	
	
	public Gouvernerat getone(Integer id){
		return repo.getById(id);
	}
	
	public void update(Integer id,Gouvernerat t1) {
		Gouvernerat t = new Gouvernerat();
		t= repo.getById(id);
		t.setGouverneratLibelle(t1.getGouverneratLibelle());
		
		repo.save(t);
		
	}
	
	
	
	public void update(Integer id,Gouvernerat t1,int int1) {
		Gouvernerat t = new Gouvernerat();
		Pays t2=new  Pays();
		t2=repo1.getById(int1);
		t= repo.getById(id);
		t.setGouverneratLibelle(t1.getGouverneratLibelle());
		t.setPays(t2);
		repo.save(t);
		
	}


}
