package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pays;
import com.example.demo.entity.TypeCahierCharges;


public interface TypeCahierChargesRepository extends JpaRepository<TypeCahierCharges, Long >{
	public List<TypeCahierCharges> findByOrderByTypeCahierChargesIdDesc();
}
