package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        Produto martelo = new Produto(
                1L,
                "Martelo",
                1.5,
                "Martelo de aco",
                50.0
        );

        Produto furadeira = new Produto(
                2L,
                "Furadeira",
                3.0,
                "Furadeira eletrica",
                200.0
        );

        Produto chaveFenda = new Produto(
                3L,
                "Chave de Fenda",
                0.5,
                "Chave de fenda profissional",
                25.0
        );

        produtos.add(martelo);
        produtos.add(furadeira);
        produtos.add(chaveFenda);

        Estoque estoqueMartelo = new Estoque(
                1L,
                martelo,
                20,
                10,
                50
        );

        Estoque estoqueFuradeira = new Estoque(
                2L,
                furadeira,
                5,
                10,
                50
        );

        Estoque estoqueChaveFenda = new Estoque(
                3L,
                chaveFenda,
                30,
                10,
                50
        );

        Cliente cliente = new Cliente(
                "12345678900",
                new Date(),
                "Joao da Silva",
                "Rua Principal"
        );

        Funcionario funcionario = new Funcionario(
                "Carlos",
                "Vendedor",
                "98765432100"
        );

        Venda venda = new Venda(
                1L,
                cliente,
                funcionario
        );

        int opcao = -1;

        while (opcao != 0) {

            System.out.println();
            System.out.println("==============================================");
            System.out.println("       SISTEMA DE CONTROLE DE VENDAS");
            System.out.println("              FERRAGISTA");
            System.out.println("==============================================");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Abrir nova venda");
            System.out.println("3 - Adicionar item a venda");
            System.out.println("4 - Exibir resumo da venda");
            System.out.println("5 - Consultar estoque");
            System.out.println("6 - Dar baixa no estoque");
            System.out.println("0 - Sair");
            System.out.println("==============================================");
            System.out.print("Escolha uma opcao: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println();
                    System.out.println("========== PRODUTOS ==========");

                    for (Produto produto : produtos) {
                        System.out.println(
                                "ID: " + produto.getId()
                                + " | Nome: " + produto.getNome()
                                + " | Preco: R$ " + produto.getPreco()
                        );
                    }

                    break;

                case 2:
                    System.out.println();
                    System.out.println("========== NOVA VENDA ==========");
                    System.out.println("Cliente: " + cliente.getNome());
                    System.out.println("CPF: " + cliente.getCPF());
                    System.out.println("Funcionario: " + funcionario.getNome());
                    System.out.println("Cargo: " + funcionario.getCargo());
                    System.out.println("Venda aberta com sucesso.");

                    break;

                case 3:
                    System.out.println();
                    System.out.println("========== ADICIONAR ITEM ==========");

                    System.out.println("1 - Martelo");
                    System.out.println("2 - Furadeira");
                    System.out.println("3 - Chave de Fenda");
                    System.out.print("Escolha o produto: ");

                    int produtoEscolhido = scanner.nextInt();

                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();

                    Produto produtoSelecionado = null;

                    if (produtoEscolhido == 1) {
                        produtoSelecionado = martelo;
                    } else if (produtoEscolhido == 2) {
                        produtoSelecionado = furadeira;
                    } else if (produtoEscolhido == 3) {
                        produtoSelecionado = chaveFenda;
                    } else {
                        System.out.println("Produto invalido.");
                        break;
                    }

                    Estoque estoqueSelecionado = null;

                    if (produtoSelecionado == martelo) {
                        estoqueSelecionado = estoqueMartelo;
                    } else if (produtoSelecionado == furadeira) {
                        estoqueSelecionado = estoqueFuradeira;
                    } else {
                        estoqueSelecionado = estoqueChaveFenda;
                    }

                    if (quantidade <= 0) {
                        System.out.println("Quantidade invalida.");
                        break;
                    }

                    if (quantidade > estoqueSelecionado.getQuantidadeAtual()) {
                        System.out.println("Estoque insuficiente.");
                        break;
                    }

                    ItemVenda item = new ItemVenda(
                            produtoSelecionado,
                            quantidade,
                            produtoSelecionado.getPreco(),
                            0.0
                    );

                    venda.adicionarItem(item);

                    System.out.println("Item adicionado com sucesso.");
                    System.out.println("Produto: " + produtoSelecionado.getNome());
                    System.out.println("Quantidade: " + quantidade);
                    System.out.println("Subtotal: R$ " + item.calcularSubtotal());

                    break;

                case 4:
                    System.out.println();
                    System.out.println("========== RESUMO DA VENDA ==========");

                    if (venda.getItens().isEmpty()) {
                        System.out.println("Nenhum item foi adicionado.");
                        break;
                    }

                    System.out.println("Cliente: " + cliente.getNome());
                    System.out.println("Funcionario: " + funcionario.getNome());
                    System.out.println();

                    for (ItemVenda itemVenda : venda.getItens()) {
                        System.out.println(
                                "Produto: " + itemVenda.getProduto().getNome()
                        );
                        System.out.println(
                                "Quantidade: " + itemVenda.getQuantidade()
                        );
                        System.out.println(
                                "Subtotal: R$ " + itemVenda.calcularSubtotal()
                        );
                        System.out.println();
                    }

                    System.out.println(
                            "TOTAL DA VENDA: R$ " + venda.calcularValorTotal()
                    );

                    break;

                case 5:
                    System.out.println();
                    System.out.println("========== ESTOQUE ==========");

                    System.out.println(
                            estoqueMartelo.getProduto().getNome()
                            + " | Quantidade: "
                            + estoqueMartelo.getQuantidadeAtual()
                            + " | Minimo: 10"
                    );

                    System.out.println(
                            estoqueFuradeira.getProduto().getNome()
                            + " | Quantidade: "
                            + estoqueFuradeira.getQuantidadeAtual()
                            + " | Minimo: 10"
                    );

                    System.out.println(
                            estoqueChaveFenda.getProduto().getNome()
                            + " | Quantidade: "
                            + estoqueChaveFenda.getQuantidadeAtual()
                            + " | Minimo: 10"
                    );

                    System.out.println();

                    if (estoqueMartelo.isAbaixoDoMinimo()) {
                        System.out.println("Martelo: ABAIXO DO MINIMO");
                    }

                    if (estoqueFuradeira.isAbaixoDoMinimo()) {
                        System.out.println("Furadeira: ABAIXO DO MINIMO");
                    }

                    if (estoqueChaveFenda.isAbaixoDoMinimo()) {
                        System.out.println("Chave de Fenda: ABAIXO DO MINIMO");
                    }

                    break;

                case 6:
                    System.out.println();
                    System.out.println("========== BAIXA NO ESTOQUE ==========");

                    System.out.println("1 - Martelo");
                    System.out.println("2 - Furadeira");
                    System.out.println("3 - Chave de Fenda");
                    System.out.print("Escolha o produto: ");

                    int produtoBaixa = scanner.nextInt();

                    System.out.print("Digite a quantidade: ");
                    int quantidadeBaixa = scanner.nextInt();

                    try {

                        if (produtoBaixa == 1) {
                            estoqueMartelo.darBaixa(quantidadeBaixa);
                            System.out.println("Baixa realizada no Martelo.");
                        } else if (produtoBaixa == 2) {
                            estoqueFuradeira.darBaixa(quantidadeBaixa);
                            System.out.println("Baixa realizada na Furadeira.");
                        } else if (produtoBaixa == 3) {
                            estoqueChaveFenda.darBaixa(quantidadeBaixa);
                            System.out.println("Baixa realizada na Chave de Fenda.");
                        } else {
                            System.out.println("Produto invalido.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }

                    break;

                case 0:
                    System.out.println();
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println();
                    System.out.println("Opcao invalida.");
                    break;
            }
        }

        scanner.close();
    }
}