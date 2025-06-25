package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();




        estudante01.nome = "Peu";
        estudante01.idade = 20;
        estudante01.genero = 'M';


        estudante02.nome = "Luiz";
        estudante02.idade = 20;
        estudante02.genero = 'M';

        estudante01.imprimir();
        estudante02.imprimir();
    }
}
