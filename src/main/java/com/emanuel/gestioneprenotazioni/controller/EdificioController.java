package com.emanuel.gestioneprenotazioni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emanuel.gestioneprenotazioni.Services.EdificioServices;
import com.emanuel.gestioneprenotazioni.entity.Edificio;

@RestController
@RequestMapping("/Edifici")
public class EdificioController {

	@Autowired
	private EdificioServices libroService;

	@GetMapping
	public List<Edificio> trovaTutti() {
		return libroService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public Edificio trovaPerId(@PathVariable Long id) {
		return libroService.trovaPerId(id);
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		libroService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody Edificio edificio) {
		libroService.crea(edificio);
	}
	
	@PutMapping
	public void modifica(@RequestBody Edificio edificio) {
		libroService.modifica(edificio);
	}
}
