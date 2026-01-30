package estudos.java.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    System.out.println("Exercicio");
    System.out.println("Digite uma pergunta, e eu vou responder com sim ou não");

    String pergunta = sc.nextLine();

    if (pergunta.charAt(0) == ' ') {
        System.out.println("SIM");
    } else {
        System.out.println("NÃO");
    }








    }
}
