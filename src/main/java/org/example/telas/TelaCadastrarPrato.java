package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

import java.util.Scanner;

public class TelaCadastrarPrato {

    public static void cadastrarPrato(Scanner scanner,Menu menu){
            boolean proximo;
            scanner.nextLine();
            System.out.println("Cadastro de novo prato:");
            do {
                    System.out.println("Nome do novo produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Descrição do novo produto:");
                    String descricao = scanner.nextLine();
                    System.out.println("Tipo do novo produto: Prato principal, bebida ou sobremesa."); //depois fazer enum
                    String tipo = scanner.nextLine();
                    System.out.println("Valor do novo produto:");
                    double valor = scanner.nextDouble();

                    menu.adicionarPrato(new Prato(nome, descricao, tipo, valor));
                    System.out.println("\tCadastro realizado com sucesso\n");
                    System.out.println("Deseja cadastrar outro prato? (S) Sim; (N)Não");
                    proximo = scanner.next().equalsIgnoreCase("s");
                    scanner.nextLine();
            }while(proximo);
    }

}
