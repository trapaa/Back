package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Operateurs;
import com.example.demo.entity.TypeCritere;
import com.example.demo.repository.OperateursRepository;

@Service
public class OperateursService {
	@Autowired
	OperateursRepository repo;
	
	
	
	public List<Operateurs> ajouter(Operateurs o) {
		   repo.save(o);
		   return repo.findByOrderByOperateursIdDesc();
	 }
	
	
	public List<Operateurs> supprimer(Long id) {
		repo.deleteById(id);
		   return repo.findByOrderByOperateursIdDesc();
	}
	
	
	
	public List<Operateurs> getAll(){
		   return repo.findByOrderByOperateursIdDesc();
	}
	
	
	public Operateurs getone(Long id){
		return repo.getById(id);
	}
	
	
	public void update(Long id,Operateurs t1) {
		Operateurs t = new Operateurs();
		t= repo.getById(id);
		t.setOperateursDescription(t1.getOperateursDescription());;
		t.setOperateursSymbole(t1.getOperateursSymbole());
		repo.save(t);
		
	}

}
