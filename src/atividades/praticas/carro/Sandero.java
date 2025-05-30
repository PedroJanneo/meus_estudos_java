package atividades.praticas.carro;

public class Sandero implements Carro {


    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro Sandero");
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro Sandero");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Sandero - Cor: Vermelho, Rodas: 4, Motor: 1.0 SCe");
    }


}
