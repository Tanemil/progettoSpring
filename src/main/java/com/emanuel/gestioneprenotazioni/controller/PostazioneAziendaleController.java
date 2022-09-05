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

import com.emanuel.gestioneprenotazioni.Services.PostazioneAziendaleServices;
import com.emanuel.gestioneprenotazioni.entity.PostazioneAziendale;
import com.emanuel.gestioneprenotazioni.interfaces.TipoPostazione;

@RestController
@RequestMapping("/Postazioni")
public class PostazioneAziendaleController {
	
	@Autowired
	private PostazioneAziendaleServices libroService;

	@GetMapping
	public List<PostazioneAziendale> trovaTutti() {
		return libroService.trovaTutti();
	}
	
	@GetMapping("/{id}")
	public PostazioneAziendale trovaPerId(@PathVariable Long id) {
		return libroService.trovaPerId(id);
	}
	
	@GetMapping("/byPostazione/{postazione}")
	public  List<PostazioneAziendale> trovaPerPostazione(TipoPostazione postazione) {
		return libroService.trovaTutti();
	}
	
	@GetMapping("/byCitta/{citta}")
	public  List<PostazioneAziendale> trovaPerCitta(String citta) {
		return libroService.trovaTutti();
	}
	
	@DeleteMapping("/{id}")
	public void cancella(@PathVariable Long id) {
		libroService.cancella(id);
	}
	
	@PostMapping
	public void crea(@RequestBody PostazioneAziendale postazioneAziendale) {
		libroService.crea(postazioneAziendale);
	}
	
	@PutMapping
	public void modifica(@RequestBody PostazioneAziendale postazioneAziendale) {
		libroService.modifica(postazioneAziendale);
	}

}
