package org.example.entidades;

public class Pedido extends Prato {

    private int quantidade;

    public Pedido(String nome, TipoPrato tipo, double valor, int idPrato) {
        super(nome, tipo, valor, idPrato);
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return this.quantidade;
    }
}
