package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

public class TelaExibirMenu {

    public static void exibirMenu(Menu menu){

//        if(int i = 0; i <=cardapio.getItemCardapio().size(); i++){ //array
//            ItemCardapio itemCardapio = cardapio.getItemCardapio().get(i);
//            System.out.printf("%d - %s R$ %n%.2f \n",itemCardapio.getIdProduto(),itemCardapio.getNome(), itemCardapio.getValor());
//            System.out.printf("%s",itemCardapio.getDescricao());
//        }

        for(Prato prato: menu.getPrato()){
            System.out.printf("%d - %s R$ %n%.2f \n",prato.getIdProduto(),prato.getNome(), prato.getValor());
            System.out.printf("%s",prato.getDescricao());
        };
    }

}
