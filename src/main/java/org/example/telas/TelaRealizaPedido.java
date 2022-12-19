package org.example.telas;

import org.example.entidades.Conta;
import org.example.entidades.Equipe;
import org.example.entidades.Menu;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class TelaRealizaPedido {
    boolean continua;
    public static void realizarPedido(Scanner scanner, Equipe equipe, Menu menu, @NotNull Conta conta){

        if (conta.getGarcom()==null) {
           System.out.println("Informe o ID do garcom que está realizando o atendimento");
           equipe.listaEquipe(false);
           try {
               conta.setGarcom(equipe.procuraGarcom(scanner));
           } catch (Exception e) {
               System.out.println("Algo deu errado, tente novamente");
           }
       }
            menu.menuCompleto();
        try {
            conta.addPedido(menu.retornaPedido(scanner));
            System.out.println("Pedido adicionado");
       }catch(Exception e){
           System.out.println("Algo deu errado, tente novamente");
       }


    }
}
