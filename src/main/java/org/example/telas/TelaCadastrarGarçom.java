package org.example.telas;

import org.example.entidades.Equipe;
import org.example.entidades.Garcom;

import java.util.Scanner;

public class TelaCadastrarGarçom {
    public static void cadastrarGarcom(Scanner scanner, Equipe equipe){
        boolean proximo = false;
        scanner.nextLine();
        System.out.println("Cadastro de novo colaborador");
        do{
            System.out.println("\tNome d@ garçom:");
            equipe.adicionaEquipe(new Garcom(scanner.nextLine()));
            System.out.println("\t\tCadastro realizado com sucesso");

            System.out.println("Deseja cadastrar outro garçom? (S) Sim; (N)Não");
            proximo = scanner.next().equalsIgnoreCase("s");
            scanner.nextLine();
        } while(proximo);

    }
}
