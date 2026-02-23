package estudos.java.maratonajava.javacore.Hheranca.teste;

import estudos.java.maratonajava.javacore.Hheranca.dominio.Endereco;
import estudos.java.maratonajava.javacore.Hheranca.dominio.Funcionario;
import estudos.java.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {

    public static void main(String[] args) {

        Endereco end1 = new Endereco();
        //end1.setCep("1111");
       // end1.setRua("Rua das palmeiras");

        Pessoa pessoa = new Pessoa("Pedrao");
//        pessoa.setNome("Pedro");
        pessoa.setCpf("001");
        pessoa.setEndereco(end1);

        pessoa.imprimir();
        System.out.println("----------");
        Funcionario func = new Funcionario("Lufy");
        func.setSalary(1000);
        //func.setNome("Monkey D. Luffy");
        //func.setCpf("0000002");
        func.setEndereco(end1);


        func.imprimir();


    }
}
