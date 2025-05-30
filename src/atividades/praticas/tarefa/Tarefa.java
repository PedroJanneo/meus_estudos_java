package tarefa;

public abstract class Tarefa {
    String nome;
    String descricao;
    String prioridade;

    public Tarefa(String prioridade, String descricao, String nome) {
        this.prioridade = prioridade;
        this.descricao = descricao;
        this.nome = nome;
    }

    abstract void executar();

    void mostrarInfo(){
        System.out.println("Terminar tarefa" + nome + ", reallizar " + descricao + " com prioridade " + prioridade);
    }

}
