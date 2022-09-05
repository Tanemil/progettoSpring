package com.emanuel.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.gestioneprenotazioni.entity.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
