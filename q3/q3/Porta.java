package POO_Exercicios_2.q3;

public class Porta {
    private boolean aberta;
    private String cor;
    private float largura;

    Porta(boolean aberta, String cor, float largura) {
        this.aberta = aberta;
        this.cor = cor;
        this.largura = largura;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public boolean getAberta() {
        return this.aberta;
    }

    public String getCor() {
        return this.cor;
    }

    public float getLargura() {
        return this.largura;
    }

    public void estaAberta() {
        if (aberta == true) {
            System.out.println("Está aberta! \n");
        } else {
            System.out.println("Está fechada! \n");
        }
    }
}
