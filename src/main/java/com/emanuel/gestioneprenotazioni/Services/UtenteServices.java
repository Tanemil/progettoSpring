package com.emanuel.gestioneprenotazioni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuel.gestioneprenotazioni.entity.Utente;
import com.emanuel.gestioneprenotazioni.repository.UtenteRepository;

@Service
public class UtenteServices {

	@Autowired
	private UtenteRepository repo;
	
	public List<Utente> trovaTutti() {
		return (List<Utente>) repo.findAll();
	}
	
	public Utente trovaPerId(Long id) {
		return repo.findById(id).get();
	}
	
	public void cancella(Long id) {
		repo.deleteById(id);
	}
	
	public void crea(Utente libro) {
		repo.save(libro);
	}
	
	public void modifica(Utente libro) {
		repo.save(libro);
	}
}
