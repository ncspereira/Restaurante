package org.example.telas;

import org.example.entidades.Menu;
import org.example.entidades.Prato;

import java.util.Scanner;

public class TelaCadastrarPrato {

    public void cadastrarPrato(){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        boolean proximo = false;
        do{
            System.out.println("Informações novo Prato:");
            System.out.println("Nome do novo produto:");
            String nome = scanner.next();
            System.out.println("Descrição do novo produto:");
            String descricao = scanner.next();
            System.out.println("Tipo do novo produto: Prato principal, bebida ou sobremesa."); //depois fazer enum
            String tipo = scanner.next();
            System.out.println("Valor do novo produto:");

            //double valor = scanner.nextDouble(); //erro
            int valor = scanner.nextInt();

            Prato prato = new Prato(nome, descricao, tipo, valor);
            menu.adicionarPrato(prato);
            System.out.println("Deseja cadastrar outro Prato? (S) Sim; (N)Não");
            proximo = scanner.next().equalsIgnoreCase("s");
        } while(proximo);

        TelaGestor telaGestor = new TelaGestor();
        telaGestor.funcoesGestor();
    }

}
