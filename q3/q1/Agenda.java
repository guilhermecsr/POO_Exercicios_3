package POO_Exercicios_3.q3.q1;

public class Agenda {
    private String nome;
    private String ondeConheceu;
    private Contato telefone;

    Agenda(String nome, String ondeConheceu, Contato telefone) {
        this.nome = nome;
        this.ondeConheceu = ondeConheceu;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOndeConheceu(String ondeConheceu) {
        this.ondeConheceu = ondeConheceu;
    }

    public void setTelefone(String telefone) {
        this.telefone.setCelular(telefone);
    }

    public String getNome() {
        return this.nome;
    }

    public String getOndeConheceu() {
        return this.ondeConheceu;
    }

    public String getTelefone() {
        return this.telefone.getCelular();
    }
}
