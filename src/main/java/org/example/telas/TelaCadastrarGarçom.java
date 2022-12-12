package org.example.telas;

import org.example.entidades.Garcom;

import java.util.Scanner;

public class TelaCadastrarGarçom {
    public void cadastrarGarcom(){
        Scanner scanner = new Scanner(System.in);
        boolean proximo = false;
        do{
        System.out.println("Nome Garçom:");
        Garcom garcom = new Garcom(scanner.next());

        System.out.println("Deseja cadastrar outro garçom? (S) Sim; (N)Não");
        proximo = scanner.next().equalsIgnoreCase("s");
        } while(proximo);
        TelaGestor telaGestor = new TelaGestor();
        telaGestor.funcoesGestor();
            //ver onde colocar esses garçons
    }
}
