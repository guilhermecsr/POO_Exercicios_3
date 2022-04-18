package POO_Exercicios_2.q4;

public class Casa {
    private Porta[] portas;
    private String cor;

    Casa(String cor) {
        this.portas = new Porta[100];
        this.cor = cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public void addPorta(Porta porta) {
        for (int i = 0; i < portas.length; i++) {
            if (portas[i] == null) {
                portas[i] = porta;
                break;
            }
        }
    }

    public void quantasPortasEstaoAbertas() {
        int counter = 0;
        for (int i = 0; i < portas.length; i++)
            if (portas[i] != null && portas[i].getAberta()) {
                counter++;
            }
        System.out.println("Tem " + counter + " porta(s) aberta(s)!\n");
    }
}
