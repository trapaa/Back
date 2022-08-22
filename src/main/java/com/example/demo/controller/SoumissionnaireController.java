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

import com.example.demo.entity.Pays;
import com.example.demo.entity.Soumissionnaire;
import com.example.demo.service.PaysService;
import com.example.demo.service.SoumissionnaireService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="sou")
@CrossOrigin(origins = "http://localhost:4200")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class SoumissionnaireController {
	@Autowired
	SoumissionnaireService Ser;
	
	@GetMapping(value = "")
	public List<Soumissionnaire> getAll(){
	return Ser.getAll();
		}
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Soumissionnaire> supp(@PathVariable int id){
	return Ser.supprimer(id);
		}	
	
	


	
	
	@PostMapping("/ajouter")
	public List<Soumissionnaire> ajouter(@RequestBody Soumissionnaire t) {
		return Ser.ajouter(t);
		
	}
	
	
	
	
	
	
	@PutMapping("update")
	public void update(@RequestBody Soumissionnaire t1) {
		Ser.update(t1);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public Soumissionnaire getone(@PathVariable int id){
	return Ser.getone(id);
		}
}
