package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;
import org.example.entidades.TipoPrato;

import java.util.Scanner;

public class TelaCadastrarPrato {

        private static int ID_SEQUENCIAL_PRATO=9;

    public static void cadastrarPrato(Scanner scanner,Menu menu){
            boolean proximo;
            scanner.nextLine();
            System.out.println("Cadastro de novo prato:");
            do {
                    System.out.println("Nome do novo produto:");
                    String nome = scanner.nextLine();
                    System.out.println("Tipo do novo produto: entradas, prato principal, bebida ou sobremesa.");
                    TipoPrato tipoPrato = TipoPrato.fromOpcao(scanner.nextInt());
                    System.out.println("Valor do novo produto:");
                    double valor = scanner.nextDouble();
                    menu.adicionarPrato(new Prato(nome,tipoPrato,valor,ID_SEQUENCIAL_PRATO));
                    System.out.println("\tCadastro realizado com sucesso\n");
                    ID_SEQUENCIAL_PRATO++;
                    System.out.println("Deseja cadastrar outro prato? (S) Sim; (N)Não");
                    proximo = scanner.next().equalsIgnoreCase("s");
                    scanner.nextLine();
            }while(proximo);
    }

}
