package org.example.telas;

import org.example.entidades.Menu;

import java.util.Scanner;

public class TelaCliente {

    public void opcoesCliente(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo! Escolha uma das opções: \n (1) Listar Menu completo; \n (2) Verificar Prato do Menu; \n (3) Realizar pedido; \n (4) Pedir a conta; \n (0) Sair.");
        int opcao = scanner.nextInt();
        Menu menu = new Menu();
        do {
            switch (opcao) {
                case 1:
                    TelaExibirMenu telaExibirMenu = new TelaExibirMenu();
                    TelaExibirMenu.exibirMenu(menu);
                case 2:
                    TelaVerificarMenu telaVerificarMenu = new TelaVerificarMenu();
                    System.out.println("Informe o nome do Prato que deseja:");
                    TelaVerificarMenu.verificarItemCardapio(scanner.next());
                case 3:
                case 4:
                case 0:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }while(opcao > 0);

    }

//    public void listarCardapio(){
//
//    }
//
//    public void verificarItemCardapio(){
//
//    }
//
//    public void verificarItemCardapio(){
//
//    }
//
//    public void verificarItemCardapio(){
//
//    }


}
