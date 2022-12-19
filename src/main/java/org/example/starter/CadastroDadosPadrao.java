package org.example.starter;

import org.example.entidades.*;


public class CadastroDadosPadrao {
    private static Garcom andre = new Garcom("Andre Rojão",1);
    private static Garcom rosenilda = new Garcom("Rosenilda Corleone",2);
    private static Garcom riosvaldo = new Garcom("Riosvaldo Calça Curta",3);
    private static Garcom clementina = new Garcom("Clementina Feijão Seco",4);

    private static Garcom[] equipePadrao = {andre,rosenilda,riosvaldo,clementina};

    private static Prato batatinha = new Prato("Batata Frita", TipoPrato.ENTRADA,8.50,1);
    private static Prato aneisCebola = new Prato("Aneis de Cebola", TipoPrato.ENTRADA,7.50,2);
    private static Prato fileMostarda = new Prato("Filé ao Molho Mostarda", TipoPrato.PRINCIPAL,20.90,3);
    private static Prato paella = new Prato("Paella Premium", TipoPrato.PRINCIPAL,45.50,4);
    private static Prato pudim = new Prato("Pudim de Leite Condensado", TipoPrato.SOBREMESA,10.50,5);
    private static Prato tortaBolacha = new Prato("Torta de Bolacha", TipoPrato.SOBREMESA,7.50,6);
    private static Prato fruki = new Prato("Fruki Guaraná", TipoPrato.BEBIDA,5.50,7);
    private static Prato dryMartini = new Prato("Dry Martini", TipoPrato.BEBIDA,15.50,8);

    private static Prato[] pratosPadroes = {batatinha,aneisCebola,fileMostarda,paella,pudim,tortaBolacha,fruki,dryMartini};


    public static void cadastrar(Menu menu, Equipe equipe) {
        for(Garcom garcom :equipePadrao){
            equipe.adicionaGarcom(garcom);
        }
        for (Prato prato : pratosPadroes){
            menu.adicionarPrato(prato);
        }
    }

}
