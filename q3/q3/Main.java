package POO_Exercicios_2.q3;

public class Main {
    public static void main(String[] args) {
        Porta porta = new Porta(true, "Mogno", (float) 60.0);
        // porta.cor = "Mogno";
        // porta.aberta = true;
        // porta.largura = (float) 60.0;
        imprimir(porta);

        Porta porta1 = new Porta(false, "Cerejeira", (float) 70.0);
        // porta.cor = "Cerejeira";
        // porta.aberta = false;
        // porta.largura = (float) 70.0;
        imprimir(porta1);

        Porta porta2 = new Porta(true, "Branca", (float) 80.0);
        // porta.cor = "Branca";
        // porta.aberta = true;
        // porta.largura = (float) 80.0;
        imprimir(porta2);
    }

    static void imprimir(Porta porta) {
        System.out.println("A porta de cor: " + porta.getCor() + " e de " + porta.getLargura() + "cm");
        porta.estaAberta();
    }
}
