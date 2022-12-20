package org.example.telas;

import org.example.entidades.Equipe;
import org.example.entidades.Garcom;

import java.util.ArrayList;
import java.util.Scanner;

public class TelaCadastrarGarcom {
    private static int ID_SEQUENCIAL_GARCOM = 5;

    public static void cadastrarGarcom(Scanner scanner, Equipe equipe) {
        boolean proximo = false;
        scanner.nextLine();
        System.out.println("Cadastro de novo colaborador");
        do {
            System.out.println("\tNome d@ garçom:");
            equipe.adicionaGarcom(new Garcom(scanner.nextLine(), ID_SEQUENCIAL_GARCOM));
            System.out.println("\t\tCadastro realizado com sucesso");
            ID_SEQUENCIAL_GARCOM++;

            System.out.println("Deseja cadastrar outro garçom? (S) Sim; (N)Não");
            proximo = scanner.next().equalsIgnoreCase("s");
            scanner.nextLine();
        } while (proximo);

    }

    public static void promoverGarcom(Scanner scanner, Equipe equipe) {
        System.out.println("Escolha qual garcom será promovido:");
        equipe.listaEquipe(true);
        try {
            equipe.procuraGarcom(scanner).efetivaGarcom();
            System.out.println("Promoção realizada com sucesso");;
        } catch (Exception NullPointerException) {
            System.out.println("Operação cancelada pelo usuário");
        }
    }
}


