package lista_atividade_outubro24;
public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("1234-5", 1500.00);
        Cliente cliente = new Cliente("João", conta);
        cliente.exibirInfo();
    }
}
