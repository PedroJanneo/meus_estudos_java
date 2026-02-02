package estudos.java.maratonajava.javacore.Gassociacao.teste;

import estudos.java.maratonajava.javacore.Gassociacao.domain.Aluno;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Local;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Professor;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Taboao");
        Aluno aluno = new Aluno("Pedro",21);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Os 'codadores'",alunosParaSeminario,local);


        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);


        professor.imprimi();
    }
}
