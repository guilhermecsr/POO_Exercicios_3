package POO_Exercicios_2.q7;

public class Cartao {
    private String bandeira;
    private String numero;
    private String vencimento;
    private int cvv;

    Cartao(String bandeira, String numero, String vencimento, int cvv) {
        this.bandeira = bandeira;
        this.numero = numero;
        this.vencimento = vencimento;
        this.cvv = cvv;
    }

    public String getBandeira() {
        return this.bandeira;
    }

    public String getNumero() {
        return this.numero;
    }

    public String getVencimento() {
        return this.vencimento;
    }

    public int getCvv() {
        return this.cvv;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
