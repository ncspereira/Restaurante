package org.example.telas;

import org.example.entidades.Equipe;
import org.example.entidades.Menu;
import org.example.starter.CadastroDadosPadrao;

import java.util.Scanner;

public class TelaGestor {
    private static int CONTROLE = 0;
    public static void funcoesGestor(Scanner scanner, Equipe equipe, Menu menu){

        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:\n\t[1] Cadastrar Garçom\n\t[2] Promover Garçom\n\t[3] Cadastrar Prato\n\t[946] Carregar base padrão \n\n\t[0] Voltar");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarGarcom.cadastrarGarcom(scanner,equipe);
                    break;
                case 2:
                    TelaCadastrarGarcom.promoverGarcom(scanner,equipe);
                    break;
                case 3:
                    TelaCadastrarPrato.cadastrarPrato(scanner,menu);
                    break;
                case 946:
                    if(CONTROLE==0){
                        CadastroDadosPadrao.cadastrar(menu,equipe);
                        CONTROLE++;
                    }else{
                        System.out.println("\n-- Base já carregada --\n");
                    }
                    break;
                case 0:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        } while(opcao!=0);
    }

}
