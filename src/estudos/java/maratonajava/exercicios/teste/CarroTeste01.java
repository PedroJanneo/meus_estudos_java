package estudos.java.maratonajava.exercicios.teste;

import estudos.java.maratonajava.exercicios.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();


        carro1.name = "Civic";
        carro1.model = "Preto";
        carro1.year = 2014;

        carro2.name = "Kwid";
        carro2.model = "Branco";
        carro2.year = 2021;

        System.out.println("Tenho dois carros: ");
        System.out.println("Carro 1: " + carro1.name + " " + carro1.model + " " + carro1.year);
        System.out.println("Carro 2: " + carro2.name + " " + carro2.model + " " + carro2.year);

    }




}
