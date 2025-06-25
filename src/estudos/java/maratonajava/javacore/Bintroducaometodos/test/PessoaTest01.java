package estudos.java.maratonajava.javacore.Bintroducaometodos.test;

import estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

/**
 * alta coesão -> bom <br>
 * baixa acoplamento -> bom.
 */
public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


        pessoa.setNome("Peu");
        pessoa.setIdade(20);
//        pessoa.imprimir();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
