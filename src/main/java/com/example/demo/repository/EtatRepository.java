package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Etat;
import com.example.demo.entity.Fonction;

public interface EtatRepository  extends JpaRepository< Etat, Integer >{

}
