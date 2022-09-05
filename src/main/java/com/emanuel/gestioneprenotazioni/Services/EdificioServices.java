package com.emanuel.gestioneprenotazioni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuel.gestioneprenotazioni.entity.Edificio;
import com.emanuel.gestioneprenotazioni.repository.EdificioRepository;

@Service
public class EdificioServices {
	
	@Autowired
	private EdificioRepository repo;
	
	public List<Edificio> trovaTutti() {
		return (List<Edificio>) repo.findAll();
	}
	
	public Edificio trovaPerId(Long id) {
		return repo.findById(id).get();
	}
	
	public void cancella(Long id) {
		repo.deleteById(id);
	}
	
	public void crea(Edificio libro) {
		repo.save(libro);
	}
	
	public void modifica(Edificio libro) {
		repo.save(libro);
	}
}
