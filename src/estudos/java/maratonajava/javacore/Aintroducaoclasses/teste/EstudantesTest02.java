package estudos.java.maratonajava.javacore.Aintroducaoclasses.teste;

import estudos.java.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudantesTest02 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        System.out.println(estudante.name); // ome ja setado no Estudante.java

        estudante.name = "Zoro"; // dando um novo nome
        System.out.println(estudante.name);
    }
}
