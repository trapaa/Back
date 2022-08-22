package com.example.demo.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCritere;

public interface DeviseRepository extends JpaRepository<Devise, Integer >{
	public List<Devise> findByOrderByDeviseIdDesc();

}
