package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {


        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante imprimir = new ImprimeEstudante();



        estudante01.nome = "Peu";
        estudante01.idade = 20;
        estudante01.genero = 'M';


        estudante02.nome = "Luiz";
        estudante02.idade = 20;
        estudante02.genero = 'M';

        imprimir.imprimir(estudante01);
        imprimir.imprimir(estudante02);

    }
}
