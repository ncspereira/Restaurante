package org.example.telas;

import org.example.entidades.Conta;
import org.example.entidades.Pedido;

import java.util.Scanner;

public class TelaFecharConta {

    public static void fecharConta(Scanner scanner, Conta conta){
        System.out.println("Demonstrativo de conta:");
        for(Pedido pedido:conta.getPedidos()){
            System.out.printf("%.1f x %s%n x R$ %.2f",pedido.getQuantidade(),pedido.getNome(),pedido.getValor());
        }
        double valorComanda = conta.valorConta();
        System.out.printf("\tValor da comanda: R$ %.2f%n",valorComanda);
        System.out.printf("Deseja incluir uma gorjeta p/ %s? [S]Sim [N]Não%n",conta.getGarcom().getNome());
        double gorjetaGarcom = valorComanda * conta.getGarcom().valorGorjeta();
        System.out.printf("Valor gorjeta: R$ %.2f%n",gorjetaGarcom);
        double totalConta = scanner.next().equalsIgnoreCase("S")? valorComanda+gorjetaGarcom :
                valorComanda;
        System.out.printf("Total a pagar: R$ %.2f%n",totalConta);
        System.out.println("pagamento via PIX, afinal, quem é que anda com dinheiro hoje em dia?");

        System.out.println("\n\n\nObrigado por escolher nosso restaurante, até a próxima!");
    }
}
