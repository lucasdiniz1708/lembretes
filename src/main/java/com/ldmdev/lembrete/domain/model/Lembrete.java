package com.ldmdev.lembrete.domain.model;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lembrete {
	
	private Long id;
	private String nome;
	private Date data;
	
	
}
