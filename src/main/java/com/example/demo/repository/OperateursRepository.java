package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Operateurs;
import com.example.demo.entity.Pays;


public interface OperateursRepository extends JpaRepository<Operateurs, Long >{
	public List<Operateurs> findByOrderByOperateursIdDesc();

}
