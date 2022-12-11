package Restaurante;

public class Test {
    public static void main(String[] args) {
        Pratos Bacalhau = new Pratos("Bacalhau",80.45,1);
        Pratos Churrasco = new Pratos("Churrasco",100.00,3);
        Pratos Lasanha = new Pratos("Lasanha",50.90,1);

        Menu.getInstance().cadastrarPrato(Bacalhau);
        Menu.getInstance().cadastrarPrato(Churrasco);
        Menu.getInstance().cadastrarPrato(Lasanha);

        Menu.getInstance().listarPratos();
    }

}
