package com.example;

public class ItemVenda {
    private Produto produto;
    private Integer quantidade;
    private Double precoUnitario;
    private Double desconto;

    public ItemVenda(Produto produto, Integer quantidade, Double precoUnitario, Double desconto) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
    }

    public Double calcularSubtotal() {
        double totalSemDesconto = precoUnitario * quantidade;
        return totalSemDesconto - desconto;
    }

    public Produto getProduto() { return produto; }
    public Integer getQuantidade() { return quantidade; }

}
