package lista_atividade_outubro24;

public class MainLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Quixote", "Miguel de Cervantes");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", livro);
        biblioteca.exibirInfo();
    }
}
