package Restaurante;

public class Pratos {

    private String nome;
    private Double valor;
    private Integer quantidade;

    public Pratos(String nome, Double valor, Integer quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getValor() {
        if (quantidade == 0) quantidade = 1;
        return valor*=quantidade;
    }


    @Override
    public String toString() {
        return "Pratos{" +
                "nome='" + nome + '\'' +
                ", valor=" + getValor() +
                ", quantidade=" + quantidade +
                '}';
    }
}
