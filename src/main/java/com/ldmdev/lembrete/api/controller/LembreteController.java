package com.ldmdev.lembrete.api.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ldmdev.lembrete.domain.model.Lembrete;
import com.ldmdev.lembrete.domain.repository.LembreteRepository;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/lembretes")
public class LembreteController {
	

	@Autowired
	private LembreteRepository lembreteRepository;
	
	@GetMapping
	public List<Lembrete> listar() {
		return lembreteRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Lembrete adicionar(@RequestBody Lembrete lembrete) {
		return lembreteRepository.save(lembrete);
	}
	
	@DeleteMapping("/{lembreteId}")
	public ResponseEntity<Void> remover(@PathVariable Long lembreteId) {
		if(!lembreteRepository.existsById(lembreteId)) {
			return ResponseEntity.notFound().build();
		}
		
		lembreteRepository.deleteById(lembreteId);
		return ResponseEntity.noContent().build();
	}
	
	
}
