package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Etat;
import com.example.demo.entity.Pays;
import com.example.demo.service.EtatService;
import com.example.demo.service.PaysService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@ResponseBody
@Controller
@RequestMapping(path="etat")
@CrossOrigin(origins = "*")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class EtatController {
	@Autowired
	EtatService Ser;
	
	@GetMapping(value = "")
	public List<Etat> getAll(){
	return Ser.getAll();
		}
}
