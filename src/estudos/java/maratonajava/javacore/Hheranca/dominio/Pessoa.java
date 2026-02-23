package estudos.java.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome; // mudando as variaveis para 'protected' pois assim, sua classe filha ( Funcionario) podera usar as variaveis livremente em sua propria classe
    protected String cpf;           // lembrando q por estar como protected, todos na mesma 'pasta' (pacote) tem acesso livremente a ela.
    protected Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }



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
