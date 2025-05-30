package atividades.praticas.carro;

public class Mobi implements Carro{


    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro Mobi");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro Mobi");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Mobi - Cor: Branco, Rodas: 4, Motor: 1.0 Fire");

    }
}
