package com.felipe.despesas.model;

import jakarta.persistence.*;

@Entity
public class Categoria {
    private Long id;
    private String nome;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }
}
