package org.example.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static final String D_S_R_$_2_F_N = "[%d] - %s R$ %.2f%n";
    private ArrayList<Prato> menu;

    public Menu() {
        menu = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato){ //validar se a quantidade está nula
        menu.add(prato);
    }

    public ArrayList<Prato> getMenu() {
        return menu;
    }

    public void imprimirMenuEntradas(){
        System.out.println("- Entradas disponíveis");
        for(Prato prato : menu) {
            if (prato.getTipo().equals(TipoPrato.ENTRADA)) {
                System.out.printf(D_S_R_$_2_F_N, prato.getIdProduto(), prato.getNome(), prato.getValor());
            }
        }
    }
    public void imprimirMenuPrincipal(){
        System.out.println("- Pratos principais disponíveis");
        for(Prato prato : menu) {
            if (prato.getTipo().equals(TipoPrato.PRINCIPAL)) {
                System.out.printf(D_S_R_$_2_F_N, prato.getIdProduto(), prato.getNome(), prato.getValor());
            }
        }
    }
    public void imprimirMenuBebidas(){
        System.out.println("- Bebidas disponíveis");
        for(Prato prato : menu) {
            if (prato.getTipo().equals(TipoPrato.BEBIDA)) {
                System.out.printf(D_S_R_$_2_F_N, prato.getIdProduto(), prato.getNome(), prato.getValor());
            }
        }

    }
    public void imprimirMenuSobremesa(){
        System.out.println("- Sobremesas disponíveis");
        for(Prato prato : menu) {
            if (prato.getTipo().equals(TipoPrato.SOBREMESA)) {
                System.out.printf(D_S_R_$_2_F_N, prato.getIdProduto(), prato.getNome(), prato.getValor());
            }
        }
    }

    public void menuCompleto(){
        System.out.println(":: CARDÁPIO ::");
        imprimirMenuEntradas();
        imprimirMenuPrincipal();
        imprimirMenuSobremesa();
        imprimirMenuBebidas();
        System.out.println();
    }
    public Pedido retornaPedido(Scanner scanner){
        System.out.println("Digite o código do prato desejado");
        Prato pratoEscolhido = pesquisaIdPrato(scanner.nextInt());
        Pedido novoPedido = new Pedido(pratoEscolhido.getNome(),pratoEscolhido.getTipo(),pratoEscolhido.getValor(),
                pratoEscolhido.getIdProduto());
        System.out.println("Digite a quantidade do prato escolhido:");
        novoPedido.setQuantidade(scanner.nextInt());
        return novoPedido;
    }
    public Prato pesquisaIdPrato(int idPrato){
        for(Prato prato:menu){
            if(prato.getIdProduto()==idPrato){
                return prato;
            }
        }
        return null;
    }
}
