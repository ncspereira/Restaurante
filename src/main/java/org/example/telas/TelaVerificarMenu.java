package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

import java.util.Scanner;

public class TelaVerificarMenu {

    public static boolean verificarItemCardapio(Scanner scanner, Menu menu){
        scanner.nextLine();
        System.out.println("Informe o nome do Prato que deseja:");
        String itemPesquisar = scanner.nextLine();
        for( Prato itemCardapio : menu.getMenu()){
            if(itemCardapio.getNome().equalsIgnoreCase(itemPesquisar)){
                return true;
            }
        }
        return false;
    }
}
