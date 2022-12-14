package org.example.telas;

import java.util.Scanner;

public class TelaGestor {

    public void funcoesGestor(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção:\n (1) Cadastrar Garçom; \n (2) Cadastrar Prato; \n (0) Voltar");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    TelaCadastrarGarçom telaCadastrarGarçom = new TelaCadastrarGarçom();
                    telaCadastrarGarçom.cadastrarGarcom();
                case 2:
                    TelaCadastrarPrato telaCadastrarPrato = new TelaCadastrarPrato();
                    telaCadastrarPrato.cadastrarPrato();
                    opcao = 0;
                case 0:
                    break; // não está funcionando
                default:
                    throw new IllegalStateException("Unexpected value: " + opcao);
            }
        } while(opcao>0);
    }

    public void CadastrarGarcom(){
        System.out.println();

    }

}
