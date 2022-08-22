package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Formejuridique;
import com.example.demo.entity.Ville;

public interface FormejuridiqueRepository  extends JpaRepository< Formejuridique, Integer >{
	public List<Formejuridique> findByOrderByFormeJuridiqueIdDesc();

}
