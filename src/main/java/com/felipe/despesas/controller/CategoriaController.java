package com.felipe.despesas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.felipe.despesas.repository.CategoriaRepository;
import com.felipe.despesas.model.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    
    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria criarCategoria(@RequestBody Categoria categoria) {
        Optional<Categoria> existente = categoriaRepository.findByNome(categoria.getNome());
        if (existente.isPresent()) {
        throw new IllegalArgumentException("Já existe uma categoria com esse nome");
        }
        return categoriaRepository.save(categoria);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public Categoria atualizarCategoria(@RequestBody Categoria categoria) {
        if (categoria.getId() == null || !categoriaRepository.existsById(categoria.getId())) {
            throw new IllegalArgumentException("Categoria não encontrada");
        }
        Optional<Categoria> existente = categoriaRepository.findByNome(categoria.getNome());
        if (existente.isPresent() && !existente.get().getId().equals(categoria.getId())) {
        throw new IllegalArgumentException("Já existe uma categoria com esse nome");
        }

        return categoriaRepository.save(categoria);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluirCategoria(@PathVariable Long id) {
        if (!categoriaRepository.existsById(id)) {
            throw new IllegalArgumentException("Categoria não encontrada");
        }
        categoriaRepository.deleteById(id);
    }
}
