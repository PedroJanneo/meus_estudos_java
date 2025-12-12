package estudos.java.maratonajava.javacore.Gassociacao.teste;

import estudos.java.maratonajava.javacore.Gassociacao.domain.Escola;
import estudos.java.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");

        Escola escola = new Escola("Escola1");
        Professor[] professores = {professor1,professor2};
        Escola escola2 = new Escola("Escola2", professores);

        escola.imprimir();
        System.out.println("-----------------");
        escola2.imprimir();
    }
}
