package POO_Exercicios_2.q7;

public class Produto {
    int quantidadeEstoque;
    float precoIndividual;

    Produto(int quantidadeEstoque, float precoIndividual) {
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoIndividual = precoIndividual;
    }

    public String getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public String getPrecoIndividual() {
        return this.precoIndividual;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setPrecoIndividual(float precoIndividual) {
        this.precoIndividual = precoIndividual;
    }
}
