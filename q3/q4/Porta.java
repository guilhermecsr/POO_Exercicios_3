package POO_Exercicios_2.q4;

public class Porta {
    private boolean aberta;

    Porta(boolean aberta) {
        this.aberta = aberta;
    }

    Porta() {
        this.aberta = false;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public boolean getAberta() {
        return this.aberta;
    }

    public void estaAberta() {
        if (aberta == true) {
            System.out.println("Está aberta! \n");
        } else {
            System.out.println("Está fechada! \n");
        }
    }

}
