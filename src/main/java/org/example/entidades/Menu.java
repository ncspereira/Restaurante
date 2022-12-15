package org.example.entidades;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Prato> menu;

//    private static Menu instance;
//
//    public static Menu getInstance() {
//        return instance == null?instance = new Menu(): instance;
//    }
//    private Menu() {
//
//    }
    public Menu() {
        menu = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato){ //validar se a quantidade está nula
        menu.add(prato);
    }

    public ArrayList<Prato> getMenu() {
        return menu;
    }

    public void imprimirMenu(){
        for(Prato p : menu){
            System.out.printf("[(%d) - %s R$ %.2f ]\n",p.getIdProduto(),p.getNome(), p.getValor());
            System.out.printf("Descrição:\t%s\n",p.getDescricao());
        };
    }

}
