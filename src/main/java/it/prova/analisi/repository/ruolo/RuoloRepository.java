package it.prova.analisi.repository.ruolo;

import org.springframework.data.repository.CrudRepository;

import it.prova.analisi.model.Ruolo;

public interface RuoloRepository extends CrudRepository<Ruolo, Long> {

	Ruolo findByDescrizioneAndCodice(String descrizione, String codice);

}
