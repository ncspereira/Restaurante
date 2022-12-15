package org.example.entidades;

import java.util.UUID;

public class Garcom {

    //Listar o Menu para o cliente
    //Permitir pedir um prato pelo Menu
    private final String nome;
    private String classificacao;
    //private String idGarcom;

    public Garcom(String nome) {
        this.nome = nome;
        this.classificacao = "PERÍODO DE EXPERIÊNCIA";
    }

    public String getNome() {
        return this.nome;
    }

    public String getClassificacao(){
        return this.classificacao;
    }

    public void efetivaGarcom(){
        this.classificacao = "EFETIVO";
    }
}

