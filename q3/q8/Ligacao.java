package POO_Exercicios_2.q8;

public class Ligacao {
    private float custoBateria;
    private int duracao;

    Ligacao(int duracao) {
        this.custoBateria = calculaPulso();
        this.duracao = duracao;
    }

    public float getCustoBateria() {
        return custoBateria;
    }

    public float getDuracao() {
        return duracao;
    }

    public int calculaPulso() {
        return duracao / 5;
    }
}
