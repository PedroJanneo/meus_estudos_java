package atividades.praticas.tarefa;

public class Main {
    public static void main(String[] args) {


       // Tarefa tarefa1 = new Tarefa("Alta","Polimorfismo","Java");
        Tarefa tarefa2 = null;


        try {
            //tarefa1.mostrarInfo();
            //tarefa1.executar();
            tarefa2.executar();
        } catch (NullPointerException exception) {
            System.out.println("Tarefa inexistente");
            
        }
    }
}
