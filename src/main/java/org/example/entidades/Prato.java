package org.example.entidades;

public class Prato {
    private String nome;
    private String descricao;
    private String tipo;
    private double valor;
    private int quantidade;
    private int idProduto;
    public Prato(String nome, String descricao, String tipo, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
        this.idProduto++; //refer
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorTotal() {
        if (quantidade == 0) quantidade = 1;
        return valor*=quantidade;
    }

    @Override
    public String toString() {
        return "Pratos{" +
                "nome='" + nome + '\'' +
                ", valor=" + getValor() +
                ", quantidade=" + quantidade +
                '}';
    }
}

