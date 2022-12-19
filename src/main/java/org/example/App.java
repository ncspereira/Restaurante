package org.example;

import org.example.entidades.Conta;
import org.example.entidades.Equipe;
import org.example.entidades.Menu;
import org.example.telas.TelaCliente;
import org.example.telas.TelaGestor;

import java.util.Scanner;

/**
 *  Projeto restaurante:
 * 	item no menu (cliente)
 * 	listar o menu (cliente)
 * 	cadastro de um garçon (Administrador)
 * 	pedir um item do menu (cliente)
 * 	coisas a implementar:
 * 	cadastro e remoção de itens do menu
 * 	conta cliente
 */

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao restaurante MUCHO GUSTO.");

        Menu menu =new Menu();
        Equipe equipe = new Equipe();
        Conta conta = new Conta();

        int opcao = 0;

        do {
            System.out.println("Entrar como:\n\t[1] Gestor;\n\t[2] Cliente;\n\t[0] Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaGestor.funcoesGestor(scanner,equipe,menu);
                    break;
                case 2:
                    TelaCliente.opcoesCliente(scanner,equipe,menu,conta);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0) ;

        }
}
