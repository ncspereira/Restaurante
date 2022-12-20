package org.example.telas;

import org.example.entidades.Conta;
import org.example.entidades.Equipe;
import org.example.entidades.Menu;

import java.util.Scanner;

public class TelaCliente {

    public static void opcoesCliente(Scanner scanner, Equipe equipe, Menu menu, Conta conta) {
        int opcao;
/*        try {*/
            do {
                System.out.println("Bem vindo! Escolha uma das opções: \n [1] Listar Menu completo; \n [2] Pesquisar Prato do Menu; \n [3] Realizar pedido; \n [4] Pedir a conta; \n [0] Sair.");
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        menu.menuCompleto();
                        break;
                    case 2:
                        System.out.println(TelaVerificarMenu.verificarItemCardapio(scanner, menu) ? "Item disponível no " +
                                "cardápio!" : "Item atualmente indisponível");
                        break;
                    case 3:
                        TelaRealizaPedido.realizarPedido(scanner,equipe,menu,conta);
                        break;
                    case 4:
                        TelaFecharConta.fecharConta(scanner, conta);
                        break;
                    case 0:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + opcao);
                }
            } while (opcao != 0);

/*        } catch (Exception e) {
            System.out.println("Opção inválida");
        }*/

    }
}