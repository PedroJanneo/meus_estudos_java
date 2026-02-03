package estudos.java.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public void imprimir(){
        if (this.nome == null){
            System.out.println("Sem registro de nome ");
        } else {
            System.out.println("Nome: " + this.nome);
        }
        if (this.cpf == null) {
            System.out.println("Cadastro sem CPF ");
        } else{
            System.out.println("CPF: " + this.cpf);
        }
        if(endereco.getCep() == null && endereco.getRua() == null ) return;;
        System.out.println("Endereco: " + endereco.getCep() + " " + endereco.getRua());


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
