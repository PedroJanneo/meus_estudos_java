package estudos.java.maratonajava.exercicios.teste;

import estudos.java.maratonajava.exercicios.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.setNome("Peu");
        func.setIdade(20);
        func.setSalarios(new double[]{1200,987.32,2000});
        func.imprimirDados();


    }
}
