package estudos.java.maratonajava.javacore.Aintroducaoclasses.teste;

import estudos.java.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTEste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Rayleight";
        professor.age = 50;
        professor.gender = 'M';

        System.out.println("Eu " + professor.name + " irei de treinar,sou " + professor.gender + " e tenho " + professor.age + " anos");
    }
}
