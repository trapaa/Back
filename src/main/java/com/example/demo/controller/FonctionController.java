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

import com.example.demo.entity.Devise;
import com.example.demo.entity.Fonction;
import com.example.demo.service.DeviseService;
import com.example.demo.service.FonctionService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="fonction")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class FonctionController {
	@Autowired
	FonctionService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<Fonction> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Fonction> supp(@PathVariable Integer id){
	return Ser.supprimer(id);
		}	
	
	
	@PostMapping("/ajouter")
	public List<Fonction> ajouter(@RequestBody Fonction t) {
		return Ser.ajouter(t);
		
	}
	
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Integer id,@RequestBody Fonction t1 ) {
		Ser.update(id, t1);
		
	}
	
	
	

	
	@GetMapping(value = "getone/{id}")
	public Fonction getone(@PathVariable Integer id){
	return Ser.getone(id);
		}
	

}
