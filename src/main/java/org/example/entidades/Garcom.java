package org.example.entidades;


public class Garcom {

    private final String nome;
    private String classificacao;
    private int idGarcom;

    public Garcom(String nome,int idGarcom) {
        this.nome = nome;
        this.classificacao = "PERÍODO DE EXPERIÊNCIA";
        this.idGarcom = idGarcom;
    }

    public String getNome() {
        return this.nome;
    }

    public String getClassificacao(){
        return this.classificacao;
    }

    public int getIdGarcom() {
        return idGarcom;
    }

    public void efetivaGarcom(){
        this.classificacao = "EFETIVO";
    }

    public double valorGorjeta(){
        if(this.classificacao.equals("EFETIVO")){
            return 0.10;
        }
        return 0.05;
    }
}

