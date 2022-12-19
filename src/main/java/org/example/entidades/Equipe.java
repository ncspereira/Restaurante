package org.example.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipe {
    private ArrayList<Garcom> equipe;

    public Equipe() {
        equipe = new ArrayList<>();
    }

    public void adicionaGarcom(Garcom garcom) {
        equipe.add(garcom);
    }

    public ArrayList<Garcom> getEquipe() {
        return equipe;
    }

    public void listaEquipe(boolean mostraExperiencia) {
        for (Garcom garcom : equipe) {
            if (mostraExperiencia) {
                System.out.printf("[%d] - %s - %s%n", garcom.getIdGarcom(), garcom.getNome(), garcom.getClassificacao());
            } else {
                System.out.printf("[%d] - %s%n", garcom.getIdGarcom(), garcom.getNome());
            }
        }
    }
    public Garcom procuraGarcom(Scanner scanner){
        System.out.println("Digite o ID do garcom: [0 para sair]");
        int idGarcom = scanner.nextInt();
        if(idGarcom==0){
            return null;
        }
            for (Garcom garcom : equipe) {
                if (garcom.getIdGarcom() == idGarcom) {
                    return garcom;}
            }
        System.out.println("ID Inválido");
        return null;
    }

}
