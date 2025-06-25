package estudos.java.maratonajava.exercicios.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double somaSalarios;


    public void imprimirDados() {
        System.out.println("Meu nome é " + this.nome + " e tenho " + this.idade + " anos. E meu salario é de: ");
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        mediaSalarial();
    }

    public void mediaSalarial() {

        for (double num : salarios) {
            somaSalarios += num;
        }
        double mediaDoSalario = somaSalarios / salarios.length;
        System.out.println();
        System.out.println("Média de salario: " + mediaDoSalario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getSomaSalarios() {
        return somaSalarios;
    }
}


