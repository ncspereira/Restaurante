package org.example.entidades;

public class Prato {
    private String nome;
    private TipoPrato tipo;
    private double valor;
    private int idPrato;
    public Prato(String nome, TipoPrato tipo, double valor, int idPrato) {
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
        this.idPrato = idPrato;
    }

    public String getNome() {
        return nome;
    }

    public TipoPrato getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getIdProduto() {
        return idPrato;
    }

}

