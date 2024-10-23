package lista_atividade_outubro24;

class Computador {
    private String modelo;
    private Processador processador;

    public Computador(String modelo, String marcaProcessador, double frequenciaProcessador) {
        this.modelo = modelo;
        this.processador = new Processador(marcaProcessador, frequenciaProcessador);
    }

    public void exibirInfo() {
        System.out.println("Computador: " + modelo);
        System.out.println("Processador: " + processador.getMarca() + " com " + processador.getFrequencia() + " GHz");
    }
}