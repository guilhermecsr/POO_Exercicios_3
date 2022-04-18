package POO_Exercicios_2.q8;

public class Celular {
    Bateria bateria;
    Ligacao ligacao;
    Mensagem mensagem;

    Celular(int nivelCarga) {
        this.bateria = new Bateria(nivelCarga);
    }

    void fazerLigacao(int duracao) {
        Ligacao ligacao = new Ligacao(duracao);
        bateria.consomeBateria(ligacao.calculaPulso());
    }

    void mandarMensagem() {
        Mensagem mensagem = new Mensagem();
        bateria.consomeBateria(mensagem.getCustoBateria());
    }

    void verBateria() {
        System.out.println("O nivel atual de bateria é: " + bateria.getNivelCarga());
    }
}
