package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

import static estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora.somarNumeros;

public class CalculadoraTest01 {
    public static void main(String[] args) {

       // Calculadora cal = new Calculadora();

        int reesult = somarNumeros(21,90);


        System.out.println(reesult);
        //cal.subtrairNumeros();
    }
}
