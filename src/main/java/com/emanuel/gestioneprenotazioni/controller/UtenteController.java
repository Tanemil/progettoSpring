package com.emanuel.gestioneprenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.emanuel.gestioneprenotazioni.Services.UtenteServices;
import com.emanuel.gestioneprenotazioni.entity.Utente;

public class UtenteController {
	
	@Autowired
	private UtenteServices libroService;

	@GetMapping
	public List<Utente> trovaTutti() {
		return libroService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Utente trovaPerId(@PathVariable Long id) {
		return libroService.trovaPerId(id);
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		libroService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Utente utente) {
		libroService.crea(utente);
	}
	
	@PutMapping
	public void modifica(@RequestBody Utente utente) {
		libroService.modifica(utente);
	}
}
