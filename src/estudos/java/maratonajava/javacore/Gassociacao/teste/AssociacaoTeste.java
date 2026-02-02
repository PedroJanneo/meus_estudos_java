package estudos.java.maratonajava.javacore.Gassociacao.teste;

import estudos.java.maratonajava.javacore.Gassociacao.domain.Aluno;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Local;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Professor;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("SP");
        Aluno aluno = new Aluno("Pedro",21);
        Aluno aluno2 = new Aluno("Zoro",21);
        Professor professor = new Professor("Barba branca", "Pirata");
        // Professor professor = new Professor(); // construtor vazio, usado para tratar erro
        //Aluno[] alunosParaSeminario = {aluno, aluno2};
        Aluno[] alunosParaSeminario = {};
        Seminario seminario = new Seminario("Os 'codadores'",alunosParaSeminario, local);
        //Seminario seminario = new Seminario("Os 'codadores'",alunosParaSeminario); // cosntrutor sem ´local' paraa testes de erro


        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);


        professor.imprimi();
    }
}
