package POO_Exercicios_3.q3.q1;

public class Main {
    public static void main(String[] args) {

        Contato telefone = new Contato("21 912 345 678", "fixo", "ramal");
        Agenda pessoa = new Agenda("Fulano", "UFF", telefone);

        // pessoa.setNome("Fulnao");
        // pessoa.setTelefone("21 912 345 678");

        imprimir(pessoa);
    }

    static void imprimir(Agenda pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Numero: " + pessoa.getTelefone());
    }
}
