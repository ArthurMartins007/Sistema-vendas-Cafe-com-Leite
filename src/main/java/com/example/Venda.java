package com.example;

import com.example.Cliente;
import com.example.Funcionario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Long id;
    private LocalDateTime data;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<ItemVenda> itens = new ArrayList<>();

    public Venda(Long id, Cliente cliente, Funcionario funcionario) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = LocalDateTime.now();
    }

    public void adicionarItem(ItemVenda item) {
        this.itens.add(item);
    }

    public Double calcularValorTotal() {
        return itens.stream()
                .mapToDouble(ItemVenda::calcularSubtotal)
                .sum();
    }

    public List<ItemVenda> getItens() { return itens; }
}