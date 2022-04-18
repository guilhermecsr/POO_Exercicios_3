package POO_Exercicios_2.q4;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Amarela");

        // pinta a casa
        // casa.setCor("Amarela");

        // cria as portas
        Porta porta_1 = new Porta(true);
        Porta porta_2 = new Porta(true);
        Porta porta_3 = new Porta();

        // abre algumas portas
        // porta_1.setAberta(true);
        // porta_2.setAberta(true);

        // adiciona as portas à casa
        casa.addPorta(porta_1);
        casa.addPorta(porta_2);
        casa.addPorta(porta_3);

        imprimir(casa);
    }

    static void imprimir(Casa casa) {
        System.out.println("A casa " + casa.getCor());
        casa.quantasPortasEstaoAbertas();
    }

}
