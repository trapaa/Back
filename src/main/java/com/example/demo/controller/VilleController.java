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

import com.example.demo.entity.TypeCahierCharges;
import com.example.demo.entity.Ville;
import com.example.demo.service.TypeCahierChargesService;
import com.example.demo.service.VilleService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@ResponseBody
@Controller
@RequestMapping(path="ville")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class VilleController {
	@Autowired
	VilleService Ser;
	
	@PostMapping("/ajouter/{id}")
	public List<Ville> ajouter(@RequestBody Ville t,@PathVariable int id) {
		return Ser.ajouter(t,id);
		
	}
	
	@GetMapping(value = "")
	public List<Ville> getAll(){
	return Ser.getAll();
		}
	
	@GetMapping(value = "/{id}")
	public List<Ville> getAllbygou(@PathVariable int id){
	return Ser.getAllbygou(id);
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<Ville> supp(@PathVariable int id){
	return Ser.supprimer(id);
		}	
	
	
	@PutMapping("{id}/update/{gouverneratId}")
	public void update(@PathVariable int id,@RequestBody Ville t1,@PathVariable int gouverneratId) {
		Ser.update(id, t1,gouverneratId);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public Ville getone(@PathVariable int id){
	return Ser.getone(id);
		}
	
}
