package POO_Exercicios_2.q8;

public class Bateria {
    private int capacidade;
    private int nivelCarga;

    Bateria(int nivelCarga) {
        this.capacidade = 100;
        this.nivelCarga = nivelCarga;
    }

    public int getNivelCarga() {
        return nivelCarga;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void consomeBateria(float consumo) {
        nivelCarga -= consumo;
    }
}
