package lista_atividade_outubro24;
public class Carro extends Brinquedo {

    public Carro(String cor, String tipo,int velocidade, String nome) {
        super(cor, tipo, velocidade, nome);
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está correndo nas estradas a " + getVelocidade() + " km/h.");
    }
}
