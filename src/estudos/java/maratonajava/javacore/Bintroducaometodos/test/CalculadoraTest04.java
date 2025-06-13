package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 66;
        int num2 = 99;

        System.out.println("Dentro da Calculador: ");
        calculadora.alterarDoisNumeros(num1,num2);
        System.out.println("Dentro do CalculadoraTest04 ");
        System.out.println(num1);
        System.out.println(num2);
    }





}
