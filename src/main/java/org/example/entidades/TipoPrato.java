package org.example.entidades;

public enum TipoPrato {

    ENTRADA(1, "Entradas"),PRINCIPAL(2, "Prato Principal"),SOBREMESA(3,"Sobremesas"),
    BEBIDA(4, "Bebidas");

    private int opcao;
    private String label;

    private TipoPrato(int opcao, String label){
        this.opcao = opcao;
        this.label = label;
    }

    public int getOpcao() {
        return opcao;
    }

    public String getLabel() {
        return label;
    }

    public static TipoPrato fromOpcao(int opcao) {
        for (TipoPrato tipoPrato : TipoPrato.values()) {
            if (tipoPrato.opcao == opcao) {
                return tipoPrato;
            }
        }
            throw new RuntimeException("Opção inválida");

    }
}
