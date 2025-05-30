package atividades.praticas.carro;

public class Civic implements Carro{
    @Override
    public void acelerar() {
        System.out.println("Acelenrando o Civic...");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Civic..");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Civic - Cor: Preto, Rodas: 4, Motor: 2.0 i-VTEC");
    }
}
