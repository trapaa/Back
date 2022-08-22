package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Gouvernerat;
import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCritere;

public interface GouverneratRepository extends JpaRepository<Gouvernerat, Integer >{
	public List<Gouvernerat> findByOrderByGouverneratIdDesc();

}
