package com.emanuel.gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emanuel.gestioneprenotazioni.entity.PostazioneAziendale;

@Repository
public interface PostazioneAziendaleRepository extends CrudRepository<PostazioneAziendale, Long> {

}
