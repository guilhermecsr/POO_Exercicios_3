package POO_Exercicios_2.q7;

public class Pedido {
    Cliente cliente;
    Produto[] itens;
    Pagamento pagamento;

    Pedido(String nome, String cpf) {
        this.cliente = new Cliente(nome, cpf);
        this.itens = new Produto[100];
        this.pagamento = new Pagamento();
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String getCliente() {
        return this.cliente;
    }

    public String getPagamento() {
        return this.cliente;
    }
}
