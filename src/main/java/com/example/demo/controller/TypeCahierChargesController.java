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
import com.example.demo.entity.TypeCritere;
import com.example.demo.service.TypeCahierChargesService;
import com.example.demo.service.TypeCritereService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="cahier")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})


public class TypeCahierChargesController {
	@Autowired
	TypeCahierChargesService Ser;
	
	@PostMapping("/ajouter/{typeCahierChargeIdType}")
	public List<TypeCahierCharges> ajouter(@RequestBody TypeCahierCharges t,@PathVariable Long typeCahierChargeIdType) {
		return Ser.ajouter(t,typeCahierChargeIdType);
		
	}
	
	@GetMapping(value = "")
	public List<TypeCahierCharges> getAll(){
	return Ser.getAll();
		}
	
	
	@DeleteMapping(value = "/supp/{id}")
	public List<TypeCahierCharges> supp(@PathVariable Long id){
	return Ser.supprimer(id);
		}	
	
	
	@PutMapping("{id}/update/{typeCahierChargeIdType}")
	public void update(@PathVariable Long id,@RequestBody TypeCahierCharges t1,@PathVariable Long typeCahierChargeIdType) {
		Ser.update(id, t1,typeCahierChargeIdType);
		
	}
	
	
	@GetMapping(value = "getone/{id}")
	public TypeCahierCharges getone(@PathVariable Long id){
	return Ser.getone(id);
		}
	
}
