package estudos.java.maratonajava.javacore.Csobrecargametodos.test;

import estudos.java.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();

        anime.init("one piece","TV",1124);
        anime.init("One piece","TV",1124,"Acao e Aventura");
        anime.imprimi();
    }
}
