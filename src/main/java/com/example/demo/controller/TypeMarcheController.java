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

import com.example.demo.entity.Etat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeMarche;
import com.example.demo.service.PaysService;
import com.example.demo.service.TypeMarcheService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="typemarche")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class TypeMarcheController {
	
	@Autowired
TypeMarcheService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<TypeMarche> getAll(){
	return Ser.getAll();
		}
	
	@GetMapping(value = "Etat")
	public List<Etat> getAllEtat(){
	return Ser.getAllEtat();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<TypeMarche> supp(@PathVariable int id){
	return Ser.supprimer(id);
		}	
	
	


	
	
	@PostMapping("/ajouter/{id}")
	public List<TypeMarche> ajouter(@RequestBody TypeMarche t,@PathVariable Integer id) {
		return Ser.ajouter(t,id);
		
	}
	
	
	
	
	
	
	@PutMapping("{id}/update/{id1}")
	public void update(@PathVariable int id,@RequestBody TypeMarche t1,@PathVariable Integer id1) {
		Ser.update(id, t1,id1);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public TypeMarche getone(@PathVariable int id){
	return Ser.getone(id);
		}
	

}
