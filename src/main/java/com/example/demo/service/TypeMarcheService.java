package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Etat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeMarche;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.EtatRepository;
import com.example.demo.repository.PaysRepository;
import com.example.demo.repository.TypeMarcheRepository;

@Service
public class TypeMarcheService {
	@Autowired
	TypeMarcheRepository repo;
	@Autowired
	EtatRepository repo1;
	
	
	
	
	
	public List<TypeMarche> ajouter(TypeMarche t,Integer id) {
		
		Etat t1=new  Etat();
		t1=repo1.getById(id);
		 t.setEtat(t1);
				repo.save(t);
				return repo.findByOrderByTypeMarcheIdDesc();
	 }
	
	
	
	
	
	
	public List<TypeMarche> supprimer(int id) {
		repo.deleteById(id);
		return repo.findByOrderByTypeMarcheIdDesc();
	}
	
	
	public List<TypeMarche> getAll(){
		return repo.findByOrderByTypeMarcheIdDesc();
	}
	
	public List<Etat> getAllEtat(){
		return repo1.findAll();
	}
	
	
	public TypeMarche getone(int id){
		return repo.getById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
	public void update(int id,TypeMarche t1,Integer int1) {
		TypeMarche t = new TypeMarche();
		Etat t2=new  Etat();
		t2=repo1.getById(int1);
		t= repo.getById(id);
		t.setTypeMarcheOrdre(t1.getTypeMarcheOrdre());
		t.setEtat(t2);
		t.setTypeMarcheAcronyme(t1.getTypeMarcheAcronyme());
		t.setTypeMarcheDescription(t1.getTypeMarcheDescription());
		t.setTypeMarcheLibelle(t1.getTypeMarcheLibelle());
		t.setTypeMarcheOrdre(t1.getTypeMarcheOrdre());
		repo.save(t);
		
	}

}
