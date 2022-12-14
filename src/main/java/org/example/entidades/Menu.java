package org.example.entidades;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Prato> prato;

//    private static Menu instance;
//
//    public static Menu getInstance() {
//        return instance == null?instance = new Menu(): instance;
//    }
//    private Menu() {
//
//    }

    public Menu() {
        prato = new ArrayList<>();
    }

    public void verificaritem() {
    }

    public void adicionarPrato(Prato prato){ //validar se a quantidade está nula


        this.prato.add(prato);
    }

    public ArrayList<Prato> getPrato() {
        return prato;
    }

}
