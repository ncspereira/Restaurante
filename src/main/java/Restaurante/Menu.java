package Restaurante;

import java.util.ArrayList;

public class Menu {

    private static ArrayList<Pratos> ListaDePratos = new ArrayList<Pratos>();

    private static Menu instance;

    public static Menu getInstance() {
        return instance == null?instance = new Menu(): instance;
    }
    private Menu() {

    }

    public void cadastrarPrato (Pratos pratos) {
        ListaDePratos.add(pratos);
    }

    public void listarPratos () {
        ListaDePratos.forEach(prato -> System.out.println(prato));
    }


}
