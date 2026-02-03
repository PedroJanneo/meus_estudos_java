package estudos.java.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private int salary;

    public void imprimir(){ //'sobreEscrita' ( ele vai sobre escrever) o metodo 'imprimir' da classe Pessoa
        super.imprimir(); // este super faz com que execute o 'imprimir' da classe 'Pessoa' antes de executar a da classe 'funcionario'
        System.out.println("Salario " + this.salary);
}
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
