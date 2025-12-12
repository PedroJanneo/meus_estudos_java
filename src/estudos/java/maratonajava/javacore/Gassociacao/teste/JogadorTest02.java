package estudos.java.maratonajava.javacore.Gassociacao.teste;

import estudos.java.maratonajava.javacore.Gassociacao.domain.Jogador;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Time;



public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Brsil");
        jogador1.setTime(time);

        jogador1.imprimir();


    }
}
