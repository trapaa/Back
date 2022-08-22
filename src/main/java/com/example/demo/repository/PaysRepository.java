package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCritere;

public interface PaysRepository extends JpaRepository<Pays, Integer >{
	public List<Pays> findByOrderByPaysIdDesc();
}
