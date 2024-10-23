package lista_atividade_outubro24;
class Biblioteca {
    private String nome;
    private Livro livro;

    public Biblioteca(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public void exibirInfo() {
        System.out.println("Biblioteca: " + nome);
        System.out.println("Livro: " + livro.getTitulo() + " de " + livro.getAutor());
    }
}