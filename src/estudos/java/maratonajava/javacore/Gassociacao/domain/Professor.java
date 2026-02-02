package estudos.java.maratonajava.javacore.Gassociacao.domain;

import javax.swing.*;
import java.sql.Struct;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprimi() {
        System.out.println("------Seminario: -------");
        if (this.nome == null && this.especialidade == null) {
            System.out.println("Professor: sem professor cadastrado no seminario ");
        } else {
            System.out.println("Nome: : " + this.nome);
            System.out.println("Especialidade: " + this.especialidade);
        }
        if (this.seminarios == null) return;
        System.out.print("Seminarios: ");

        for (Seminario seminarios : this.seminarios) {
            System.out.println(seminarios.getTitulo());
            int alunosSeminarios = 0;
            for (int i = 0; i < seminarios.getAlunos().length; i++) {
                alunosSeminarios++;
            }
            System.out.println("Quantidade de alunos neste seminario: " + alunosSeminarios);
            if (seminarios.getLocal() == null) {
                System.out.println("Local: Sem local definido ");
            } else {
                System.out.println("Local: " + seminarios.getLocal().getEndereco());
            }
            if (seminarios.getAlunos() == null || seminarios.getAlunos().length == 0) {
                System.out.println("----------------");
                System.out.println("---Alunos---");
                System.out.println("Nenhum aluno cadastrado ");
                ;
            } else {
                System.out.println("----------------");
                System.out.println("---Alunos---");


                for (Aluno aluno : seminarios.getAlunos()) {

                    System.out.println("Aluno " + aluno.getNome());
                    System.out.println("Idade " + aluno.getIdade());
                }
            }
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }



    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
