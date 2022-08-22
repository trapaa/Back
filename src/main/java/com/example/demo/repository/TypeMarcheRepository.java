package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeMarche;

public interface TypeMarcheRepository extends JpaRepository<TypeMarche, Integer > {
	public List<TypeMarche> findByOrderByTypeMarcheIdDesc();
}
