package org.example.entidades;

import java.util.ArrayList;

public class Conta {

    private Garcom garcom;
    private ArrayList<Pedido> pedidos;

    public Conta(){
        pedidos = new ArrayList<>();
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void addPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public double valorConta(){
        double valor=0;
        for(Pedido pedido:pedidos){
            valor += pedido.getValor()*pedido.getQuantidade();
        }
        return valor;
    }
}

