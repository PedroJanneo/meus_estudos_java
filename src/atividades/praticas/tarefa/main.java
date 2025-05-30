package tarefa;

public class main {
    public static void main(String[] args) {


        Tarefa tarefa1 = new TarefaEstudo("Alta","Polimorfismo","Java");
        Tarefa tarefa2 = null;


        try {
            tarefa1.mostrarInfo();
            tarefa1.executar();
            tarefa2.executar();
        } catch (NullPointerException exception) {
            System.out.println("Tarefa inexistente");
            
        }
    }
}
