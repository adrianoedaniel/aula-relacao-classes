package lista_atividade_outubro24;
class Cliente {
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome, ContaBancaria conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome);
        System.out.println("Conta: " + conta.getNumero() + ", Saldo: " + conta.getSaldo());
    }
}