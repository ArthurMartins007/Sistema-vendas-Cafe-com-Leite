package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n==============================================");
            System.out.println("  SISTEMA DE CONTROLE DE VENDAS - FERRAGISTA  ");
            System.out.println("==============================================");
            System.out.println("1 - Listar / Consultar Produtos");
            System.out.println("2 - Abrir Nova Venda");
            System.out.println("3 - Adicionar Item à Venda");
            System.out.println("4 - Exibir Resumo e Total da Venda");
            System.out.println("5 - Consultar Situação do Estoque");
            System.out.println("0 - Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n[OPÇÃO 1] Listagem de produtos selecionada.");
                    // o mock vem aqui cris
                    break;

                case 2:
                    System.out.println("\n[OPÇÃO 2] Abertura de nova venda selecionada.");
                    // o mock vem aqui cris
                    break;

                case 3:
                    System.out.println("\n[OPÇÃO 3] Inclusão de item na venda selecionada.");
                    // o mock vem aqui cris
                    break;

                case 4:
                    System.out.println("\n[OPÇÃO 4] Exibição de resumo e total selecionada.");
                    // o mock vem aqui cris
                    break;

                case 5:
                    System.out.println("\n[OPÇÃO 5] Consulta de estoque selecionada.");
                    // o mock vem aqui cris
                    break;

                case 0:
                    System.out.println("\nEncerrando o sistema... Até logo!");
                    break;

                default:
                    System.out.println("\n[OPÇÃO INVÁLIDA] Escolha uma opção de 0 a 5.");
                    break;
            }
        }

        scanner.close();
    }
}