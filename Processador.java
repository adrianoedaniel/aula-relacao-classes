package lista_atividade_outubro24;
class Processador {
    private String marca;
    private double frequencia;

    public Processador(String marca, double frequencia) {
        this.marca = marca;
        this.frequencia = frequencia;
    }

    public String getMarca() {
        return marca;
    }

    public double getFrequencia() {
        return frequencia;
    }
}