package org.example.entidades;

import java.util.ArrayList;

public class Equipe {
    private ArrayList<Garcom> equipe;

    public Equipe() {
        equipe = new ArrayList<>();
    }

    public void adicionaEquipe(Garcom garcom) {
        equipe.add(garcom);
    }
}
