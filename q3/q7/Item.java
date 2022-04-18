package POO_Exercicios_2.q7;

public class Item {
    Produto produto;
    int quantidade;

    Item(int quantidade) {
        this.produto = new Produto();
        this.quantidade = quantidade;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public String getProduto() {
        return this.produto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
