package com.example;

import java.util.Date;
import java.util.function.LongFunction;

public class Cliente {
    private Long id;
    private String CPF;
    private Date nascimento;
    private String nome;
    private String endereço;

    public Cliente(String CPF, Date nascimento, String nome, String endereço) {
        this.CPF = CPF;
        this.nascimento = nascimento;
        this.nome = nome;
        this.endereço = endereço;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
