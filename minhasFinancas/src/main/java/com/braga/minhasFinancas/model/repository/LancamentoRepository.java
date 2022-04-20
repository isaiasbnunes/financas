package com.braga.minhasFinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.braga.minhasFinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento,Long>{

}
