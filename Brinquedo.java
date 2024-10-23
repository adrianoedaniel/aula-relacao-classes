package lista_atividade_outubro24;
public class Brinquedo {
    private String cor;
    private String tipo;
    private int velocidade;
    private String nome;

    // Construtor
    public Brinquedo(String cor, String tipo, int velocidade, String nome) {
        this.cor = cor;
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.nome = nome;
    }

    // Getters e Setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método mover (polimórfico, pode ser sobreposto)
    public void mover() {
        System.out.println(nome + " está se movendo a " + velocidade + " km/h.");
    }
}
