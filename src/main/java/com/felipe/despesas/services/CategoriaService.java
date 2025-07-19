package com.felipe.despesas.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.felipe.despesas.repository.CategoriaRepository;
import com.felipe.despesas.model.Categoria;


@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria criarCategoria(Categoria categoria) {
        Optional<Categoria> existente = categoriaRepository.findByNome(categoria.getNome());
        if (existente.isPresent()) {
            throw new IllegalArgumentException("Já existe uma categoria com esse nome");
        }
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarCategoria(Categoria categoria) {
        if (categoria.getId() == null || !categoriaRepository.existsById(categoria.getId())) {
            throw new IllegalArgumentException("Categoria não encontrada");
        }
        Optional<Categoria> existente = categoriaRepository.findByNome(categoria.getNome());
        if (existente.isPresent() && !existente.get().getId().equals(categoria.getId())) {
            throw new IllegalArgumentException("Já existe uma categoria com esse nome");
        }
        return categoriaRepository.save(categoria);
    }

    public void excluirCategoria(Long id) {
        if (!categoriaRepository.existsById(id)) {
            throw new IllegalArgumentException("Categoria não encontrada");
        }
        categoriaRepository.deleteById(id);
    }
}
