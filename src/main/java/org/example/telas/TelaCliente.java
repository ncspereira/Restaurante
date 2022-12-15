package org.example.telas;

import org.example.entidades.Menu;

import java.util.Scanner;

public class TelaCliente {

    public static void opcoesCliente(Scanner scanner,Menu menu){
        int opcao;
        do {
            System.out.println("Bem vindo! Escolha uma das opções: \n (1) Listar Menu completo; \n (2) Verificar Prato do Menu; \n (3) Realizar pedido; \n (4) Pedir a conta; \n (0) Sair.");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                        menu.imprimirMenu();
                        break;
                case 2:
                    System.out.println("Informe o nome do Prato que deseja:");
                    TelaVerificarMenu.verificarItemCardapio(scanner.nextLine(),menu);
                    break;
                case 0:
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        }while(opcao != 0);

    }

}
