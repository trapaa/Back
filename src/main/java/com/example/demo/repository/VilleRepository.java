package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Devise;
import com.example.demo.entity.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer >{
	public List<Ville> findByOrderByVilleIdDesc();
	public List<Ville> findByGouverneratGouverneratId(int id);

}
