package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Etat;
import com.example.demo.entity.Pays;
import com.example.demo.repository.DeviseRepository;
import com.example.demo.repository.EtatRepository;
@Service
public class EtatService {
	@Autowired
	EtatRepository repo;
	public List<Etat> getAll(){
		return repo.findAll();
	}
}
