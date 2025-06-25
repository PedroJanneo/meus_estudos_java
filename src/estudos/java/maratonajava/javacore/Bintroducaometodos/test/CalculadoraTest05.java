package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calc1 = new Calculadora();

        int[] numeros ={1,2,3,4,5,6};
        calc1.somarNumerosNovos(numeros);
        calc1.somarNumerosvarags(1,2,3,4,5,6,7,8);
    }
}
