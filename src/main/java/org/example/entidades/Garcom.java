package org.example.entidades;

import java.util.UUID;

public class Garcom {

    //Listar o Menu para o cliente
    //Permitir pedir um prato pelo Menu
    private String nome;
    //private String idGarcom;

    public Garcom(String nome) {
        this.nome = nome;
        //idGarcom = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }
}
