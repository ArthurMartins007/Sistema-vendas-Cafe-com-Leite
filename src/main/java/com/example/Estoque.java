package com.example;
public class Estoque {
    private Long id;
    private Produto produto;
    private Integer quantidadeAtual;
    private Integer estoqueMinimo;
    private Integer estoqueMaximo;

    public Estoque(Long id, Produto produto, Integer quantidadeAtual, Integer estoqueMinimo, Integer estoqueMaximo) {
        this.id = id;
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public boolean isAbaixoDoMinimo() {
        return quantidadeAtual < estoqueMinimo;
    }

    public void darBaixa(Integer quantidade) {
        if (quantidade > quantidadeAtual) {
            throw new IllegalArgumentException("Estoque insuficiente para baixa.");
        }
        this.quantidadeAtual -= quantidade;
    }

    public Integer getQuantidadeAtual() { return quantidadeAtual; }
    public Produto getProduto() { return produto; }
}
