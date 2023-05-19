package com.ldmdev.lembrete.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ldmdev.lembrete.domain.model.Lembrete;

@Repository
public interface LembreteRepository extends JpaRepository<Lembrete,Long>{

}
