package com.ldmdev.lembrete.api.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldmdev.lembrete.domain.model.Lembrete;

/**
 * 
 * 
 * 
 **/
@RestController
public class LembreteController {
	
	@GetMapping("/clientes")
	public List<Lembrete> listar() {
		
		Lembrete lembrete1 = new Lembrete();
		lembrete1.setId(1L);
		lembrete1.setNome("Dormir");
		lembrete1.setData(new Date());
		
		Lembrete lembrete2 = new Lembrete();
		lembrete2.setId(2L);
		lembrete2.setNome("Dormi maisr");
		lembrete2.setData(new Date());
		
		
		return Arrays.asList(lembrete1,lembrete2);
	}
}
