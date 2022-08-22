package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Fonction;
import com.example.demo.entity.Formejuridique;

public interface FonctionRepository  extends JpaRepository< Fonction, Integer >{
	public List<Fonction> findByOrderByFonctionIdDesc();

}
