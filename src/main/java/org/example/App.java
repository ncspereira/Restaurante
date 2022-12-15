package org.example;

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
 *
 * 	coisas a implementar:
 * 	cadastro e remoção de itens do menu
 * 	conta cliente
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao restaurante Los Pollos Hermanos.");

        Menu menu =new Menu();
        Equipe equipe = new Equipe();

        //Cliente cliente = new Cliente();

        int opcao = 0;

        do {
            System.out.println("Entrar como:\n\t(1) Gestor;\n\t(2) Cliente;\n\t(0) Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaGestor.funcoesGestor(scanner,equipe,menu);
                    break;
                case 2:
                    TelaCliente.opcoesCliente(scanner,menu);
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
