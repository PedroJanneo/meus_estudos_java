package atividades.praticas.tarefa;

public class TarefaEstudo extends Tarefa {


    public TarefaEstudo(String prioridade, String descricao, String nome) {
        super(prioridade, descricao, nome);
    }

    @Override
    void executar() {
        System.out.println("Indo estudar " + nome + "...");
        System.out.println("Estudando");
    }
}
