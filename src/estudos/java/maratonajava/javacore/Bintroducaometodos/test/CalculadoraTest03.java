package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

       double result = calculadora.dividirNumeros(20,3);
        System.out.println(result);

        System.out.println("--------------------------");
        double result2 = calculadora.dividirNumeros02(10,5);
        System.out.println(result2);

        System.out.println("--------------------------");
        calculadora.dividirNumeros03(100,2);
    }
}
