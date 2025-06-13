package estudos.java.maratonajava.javacore.Aintroducaoclasses.teste;

import estudos.java.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // Estudante -> arquivo Estudante na pasta dominio | estudante -> variavel | new Estudante() -> objeto
        estudante.age = 21;
        estudante.name = "Peu";
        estudante.gender = 'M';

        System.out.println(estudante.age);
        System.out.println(estudante.name);
        System.out.println(estudante.gender);
    }
}
