package com.emanuel.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.gestioneprenotazioni.entity.Edificio;

@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long> {

}
