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

import com.example.demo.entity.Gouvernerat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCritere;
import com.example.demo.service.GouverneratService;
import com.example.demo.service.TypeCritereService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="gouv")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class GouverneratController {
	
	@Autowired
	GouverneratService Ser;
	
	
	@GetMapping(path="/all")
	public String test() {
		return "xtensus";
	}
	
	
	@GetMapping(value = "")
	public List<Gouvernerat> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Gouvernerat> supp(@PathVariable Integer id){
	return Ser.supprimer(id);
		}	
	
	
	
	
	@PostMapping("/ajouter/{id}")
	public List<Gouvernerat> ajouter(@RequestBody Gouvernerat t,@PathVariable int id) {
		return Ser.ajouter(t,id);
		
	}
	

	
	@PutMapping("{id}/update/{id1}")
	public void update(@PathVariable Integer id,@RequestBody Gouvernerat t1,@PathVariable int id1) {
		Ser.update(id, t1,id1);
		
	}
	
	
	
	@GetMapping(value = "getone/{id}")
	public Gouvernerat getone(@PathVariable Integer id){
	return Ser.getone(id);
		}
	

}
