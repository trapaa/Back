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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Devise;
import com.example.demo.entity.TypeCritere;
import com.example.demo.service.DeviseService;
import com.example.demo.service.TypeCritereService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="devise")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class DeviseController {
	
	@Autowired
	DeviseService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<Devise> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Devise> supp(@PathVariable Integer id){
	return Ser.supprimer(id);
		}	
	
	
	@PostMapping("/ajouter")
	public List<Devise> ajouter(@RequestBody Devise t) {
		return Ser.ajouter(t);
		
	}
	
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Integer id,@RequestBody Devise t1 ) {
		Ser.update(id, t1);
		
	}
	
	
	

	
	@GetMapping(value = "getone/{id}")
	public Devise getone(@PathVariable Integer id){
	return Ser.getone(id);
		}
	

}
