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
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TypeCritere;
import com.example.demo.service.TypeCritereService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="type")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class TypeCritereController {
	
	@Autowired
	TypeCritereService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<TypeCritere> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<TypeCritere> supp(@PathVariable Long id){
	return Ser.supprimer(id);
		}	
	
	
	@PostMapping("/ajouter")
	public List<TypeCritere> ajouter(@RequestBody TypeCritere t) {
		return Ser.ajouter(t);
		
	}
	
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable Long id,@RequestBody TypeCritere t1) {
		Ser.update(id, t1);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public TypeCritere getone(@PathVariable Long id){
	return Ser.getone(id);
		}
	
	
}
