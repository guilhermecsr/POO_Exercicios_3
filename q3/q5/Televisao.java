package POO_Exercicios_2.q5;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Televisao {
    private boolean ligada;
    private int volume;
    private int canal;
    private boolean silencioso;

    Televisao(boolean ligada, int volume, int canal, boolean silencioso) {
        this.ligada = ligada;
        this.volume = volume;
        this.canal = canal;
        this.silencioso = silencioso;
    }

    Televisao() {
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setSilencioso(boolean silencioso) {
        this.silencioso = silencioso;
    }

    public boolean getLigada() {
        return this.ligada;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getCanal() {
        return this.canal;
    }

    public boolean getSilencioso() {
        return this.silencioso;
    }

    public void ligar_desligar() {
        if (ligada) {
            ligada = false;
        } else {
            ligada = true;
        }
    }

    // usando o metodo da sobrecarga para mudarCanal
    public void mudarCanal(Integer ch) {
        if (ch <= 99 && ch >= 0) {
            canal = ch;
        } else {
            System.out.println("Este canal não existe!");
        }
    }

    public void mudarCanal(boolean plus, boolean minus) {
        int ch = canal;
        if (plus) {
            ch++;
        }
        if (minus) {
            ch--;
        }
        if (ch <= 99 && ch >= 0) {
            canal = ch;
        } else {
            System.out.println("Este canal não existe!");
        }
    }

    public void silenciar() {
        if (silencioso) {
            silencioso = false;
        } else {
            silencioso = true;
        }
    }

    public void mudarVolume(int vol) {
        if (vol >= 0 && vol <= 10) {
            volume = vol;
        } else {
            System.out.println("Este volume não é possível!");
        }
    }

    public void imprimeEstado() {
        System.out.println("\nImprime estado \n");

        if (ligada) {
            System.out.println("A televisão está ligada");
            if (silencioso) {
                System.out.println("A televisão está silenciada");
            } else {
                System.out.println("A televisão não está silenciada");
            }
            System.out.println("A televisão está no canal " + canal + " e no volume " + volume);
        } else {
            System.out.println("A televisão está desligada");
        }
    }
}
