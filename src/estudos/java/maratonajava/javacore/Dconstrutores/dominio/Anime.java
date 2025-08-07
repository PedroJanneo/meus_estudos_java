package estudos.java.maratonajava.javacore.Dconstrutores.dominio;

/**
 * construtores não podem ter retornos ( retornos -> string, int, boolean...)<br><br>
 * Na linha 16 e 23, estou chamando um construtor, dentro do construtor, segue  2 regras: <br>
 *  - 1º ele (this()) so pode ser chamado assim dentro de um construtor<br>
 *  - 2º ele (this()) tem quer ser a 1º linha do construtor
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;


    public Anime(String nome, String tipo, int episodios, String genero){
        this(); // chamando um construtor, dentro de um construtor (ele só pode ser chamado dentro de um construtor)
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
     this(nome, tipo, episodios, genero);
     this.estudio = estudio;

    }

    public Anime(){
        System.out.println("Dentro do construtor sobrecarregado");
    }

    public void imprimi() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }




    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
