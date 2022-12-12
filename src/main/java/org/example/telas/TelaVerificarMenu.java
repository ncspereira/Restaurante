package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

import java.util.ArrayList;

public class TelaVerificarMenu {

    private ArrayList<Prato> itemCardapio;

    public static void verificarItemCardapio(String nome){
        Menu menu = new Menu();
        for( Prato itemCardapio: menu.getPrato()){
            if(itemCardapio.getNome().equals(nome)){
                System.out.println("Disponível no cardápio.");
            } else {
                System.out.println("INdisponível no cardápio.");
            }
        }
    }
}
