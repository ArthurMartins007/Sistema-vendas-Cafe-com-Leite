package com.example;

public class Produto {
    private Long id;
    private String nome;
    private Double peso;
    private String descricao;
    private Double preco;

    public Produto(Long id, String nome, Double peso, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
}

