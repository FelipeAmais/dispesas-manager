package com.felipe.despesas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.felipe.despesas.model.Despesa;
import com.felipe.despesas.repository.DespesaRepository;

@Service
public class DespesaService {

    private final DespesaRepository despesaRepository;

    public DespesaService(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    public List<Despesa> listarDespesas() {
        return despesaRepository.findAll();
    }

    public Despesa criarDespesa(Despesa despesa) {
        // Aqui você pode adicionar regras de negócio ou validações
        return despesaRepository.save(despesa);
    }

    public Despesa atualizarDespesa(Despesa despesa) {
        if (despesa.getId() == null || !despesaRepository.existsById(despesa.getId())) {
            throw new IllegalArgumentException("Despesa não encontrada");
        }
        return despesaRepository.save(despesa);
    }

    public void excluirDespesa(Long id) {
        if (!despesaRepository.existsById(id)) {
            throw new IllegalArgumentException("Despesa não encontrada");
        }
        despesaRepository.deleteById(id);
    }
}
