package estudos.java.maratonajava.javacore.Isobreescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override // anotação de sobcrescrita
    public String toString() { // inves de imprimir a alocação de memoria, vai imprimir oq estiver nesta 'funcao'
        return "Melhor anime do mundo " + nome + '\'';
    }
}
