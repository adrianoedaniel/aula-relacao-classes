package lista_atividade_outubro24;
public class MainBrinquedo {
    public static void main(String[] args) {
        Carro carro = new Carro("Vermelho","esportivo", 120, "Ferrari");
        Moto moto = new Moto("Preta", "Estrada",180, "Harley-Davidson");
        Navio navio = new Navio("Branco", "Grande porte",30, "Titanic");

        carro.mover();
        moto.mover();
        navio.mover();
    }
}
