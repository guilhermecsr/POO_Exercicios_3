package POO_Exercicios_2.q6;

public class Carta {
    private String naipe;
    private String valor;

    public Carta criaCarta(String valor, String naipe) {
        this.naipe = naipe;
        this.valor = valor;
        return this;
    }
}
