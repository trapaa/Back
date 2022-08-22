package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pays;
import com.example.demo.entity.Soumissionnaire;

public interface SoumissionnaireRepository extends JpaRepository<Soumissionnaire, Integer >{
	public List<Soumissionnaire> findByOrderBySoumissionnaireReferenceDesc();

	
}
