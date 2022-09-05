package com.emanuel.gestioneprenotazioni.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.emanuel.gestioneprenotazioni.interfaces.TipoPostazione;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostazioneAziendale {
	
	private String Descrizione;
	private TipoPostazione TipoPostazione;
	private int numeroOccupanti;
	private Edificio edificio;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
}

