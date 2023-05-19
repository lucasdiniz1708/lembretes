package com.ldmdev.lembrete.api.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldmdev.lembrete.domain.model.Lembrete;

/**
 * 
 **/
@RestController
public class LembreteController {
	
	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping("/lembretes")
	public List<Lembrete> listar() {
		
		return manager.createQuery("from Lembrete", Lembrete.class)
				.getResultList();
	}
}
