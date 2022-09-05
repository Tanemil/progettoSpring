package com.emanuel.gestioneprenotazioni.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emanuel.gestioneprenotazioni.entity.PostazioneAziendale;
import com.emanuel.gestioneprenotazioni.repository.PostazioneAziendaleRepository;

@Service
public class PostazioneAziendaleServices {
	
	@Autowired
	private PostazioneAziendaleRepository repo;
	
	public List<PostazioneAziendale> trovaTutti() {
		return (List<PostazioneAziendale>) repo.findAll();
	}
	
	public PostazioneAziendale trovaPerId(Long id) {
		return repo.findById(id).get();
	}
	
	public void cancella(Long id) {
		repo.deleteById(id);
	}
	
	public void crea(PostazioneAziendale libro) {
		repo.save(libro);
	}
	
	public void modifica(PostazioneAziendale libro) {
		repo.save(libro);
	}
}
