package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Operateurs;
import com.example.demo.entity.TypeCritere;
import com.example.demo.service.OperateursService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="operateur")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class OperateursController {
	
	@Autowired
	OperateursService Ser;
	
	
	
	@GetMapping(value = "")
	public List<Operateurs> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Operateurs> supp(@PathVariable Long id){
	return Ser.supprimer(id);
		}	
	
	
	@PostMapping("/ajouter")
	public List<Operateurs> ajouter(@RequestBody Operateurs t) {
		return Ser.ajouter(t);
		
	}
	
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Long id,@RequestBody Operateurs t1) {
		Ser.update(id, t1);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public Operateurs getone(@PathVariable Long id){
	return Ser.getone(id);
		}

}
