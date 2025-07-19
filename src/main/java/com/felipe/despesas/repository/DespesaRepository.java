package com.felipe.despesas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.despesas.model.Despesa;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
  
}
