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
import com.example.demo.entity.Formejuridique;
import com.example.demo.service.DeviseService;
import com.example.demo.service.FormejuridiqueService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="forme")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class FomejuridiqueController {
	@Autowired
	FormejuridiqueService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<Formejuridique> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Formejuridique> supp(@PathVariable Integer id){
	return Ser.supprimer(id);
		}	
	
	
	@PostMapping("/ajouter")
	public List<Formejuridique> ajouter(@RequestBody Formejuridique t) {
		return Ser.ajouter(t);
		
	}
	
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Integer id,@RequestBody Formejuridique t1 ) {
		Ser.update(id, t1);
		
	}
	
	
	

	
	@GetMapping(value = "getone/{id}")
	public Formejuridique getone(@PathVariable Integer id){
	return Ser.getone(id);
		}
	

}
