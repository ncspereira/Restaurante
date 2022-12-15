package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

import java.util.ArrayList;

public class TelaVerificarMenu {

    public static void verificarItemCardapio(String itemPesquisar, Menu menu){
        for( Prato itemCardapio : menu.getMenu()){
            if(itemCardapio.getNome().equalsIgnoreCase(itemPesquisar)){
                System.out.printf("%s\t- Disponível no cardápio.%n",itemPesquisar);
            } else {
                System.out.printf("%s\t- Está em falta.%n",itemPesquisar);
            }
        }
    }
}
