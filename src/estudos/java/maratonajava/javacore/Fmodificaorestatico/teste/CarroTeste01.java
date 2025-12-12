package estudos.java.maratonajava.javacore.Fmodificaorestatico.teste;


import estudos.java.maratonajava.javacore.Fmodificaorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {

//        Carro c1 = new Carro("BMW",280);
//        Carro c2 = new Carro("Mercedes", 275);
//        Carro c3 = new Carro("Audi",290);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180; // alterando pra instancia inteira
        System.out.println(Carro.velocidadeLimite);
//        c1.imprimi();
//        c2.imprimi();
//        c3.imprimi();

    }
}
