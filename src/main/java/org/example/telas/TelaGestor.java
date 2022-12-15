package org.example.telas;

import org.example.entidades.Equipe;
import org.example.entidades.Menu;

import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class TelaGestor {

    public static void funcoesGestor(Scanner scanner, Equipe equipe, Menu menu){

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:\n (1) Cadastrar Garçom; \n (2) Cadastrar Prato; \n (0) Voltar");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarGarçom.cadastrarGarcom(scanner,equipe);
                    break;
                case 2:
                    TelaCadastrarPrato.cadastrarPrato(scanner,menu);
                    break;
                case 0:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        } while(opcao!=0);
    }

}
