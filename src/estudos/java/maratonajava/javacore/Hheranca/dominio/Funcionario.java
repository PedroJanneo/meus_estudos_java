package estudos.java.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private int salary;

    public Funcionario(String nome) { //criando um  construtor, ele vai receber o construtor da  classe Pessoa
        super(nome);
    }



    public void imprimir() { //'sobreEscrita' ( ele vai sobre escrever) o metodo 'imprimir' da classe Pessoa
        super.imprimir(); // este super faz com que execute o 'imprimir' da classe 'Pessoa' antes de executar a da classe 'funcionario'
        System.out.println("Salario " + this.salary);
    }

    public void recebi() {
        System.out.println("Eu " + this.nome + " confirmo que recebi o salario de R$: " + this.salary);
        // Só é possivel usar o this.nome, pois o nome la na classe pessoa, está como modificador de acesso protected
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
