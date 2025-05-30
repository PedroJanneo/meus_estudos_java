package atividades.praticas.carro;

public class Main {
    public static void main(String[] args) {

    Carro meucarro1 = new Sandero();
    Carro meucarro2 = new Civic();
    Carro meucarro3 = new Mobi();
    Carro teste = null;



    try{
        meucarro2.acelerar();
        meucarro1.acelerar();
        meucarro3.acelerar();


        meucarro2.mostrarInfo();
        meucarro1.mostrarInfo();
        meucarro3.mostrarInfo();

        meucarro2.frear();
        meucarro3.frear();
        meucarro1.frear();
        teste.frear();
    } catch (NullPointerException exception){
        System.out.println("Carro não existe");
    }


    }
}