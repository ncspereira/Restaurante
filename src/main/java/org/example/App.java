package org.example;

import org.example.telas.TelaCliente;
import org.example.telas.TelaGestor;

import java.util.Scanner;

/**
 *  Projeto restaurante:
 * 	item no menu (cliente)
 * 	listar o menu (cliente)
 * 	cadastro de um garçon (Administrador)
 * 	pedir um item do menu (cliente)
 *
 * 	coisas a implementar:
 * 	cadastro e remoção de itens do menu
 * 	conta cliente
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao restaurante Los Pollos Hermanos.");
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Entrar como: \n (1) Gestor; \n (2) Cliente;\n (0) Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaGestor telaGestor = new TelaGestor();
                    telaGestor.funcoesGestor();
                    break;
                case 2:
                    TelaCliente telaCliente = new TelaCliente();
                    telaCliente.opcoesCliente();
                    break;
                case 0:
                    break;
            }

        } while (opcao > 0) ;

//            Prato Bacalhau = new Prato("Bacalhau",80.45,1);
//            Prato Churrasco = new Prato("Churrasco",100.00,3);
//            Prato Lasanha = new Prato("Lasanha",50.90,1);
//
//            Menu.getInstance().cadastrarPrato(Bacalhau);
//            Menu.getInstance().cadastrarPrato(Churrasco);
//            Menu.getInstance().cadastrarPrato(Lasanha);
//
//            Menu.getInstance().listarPratos();

        }
}
