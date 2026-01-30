





### Getter e Setters
São usados quando os atributos (variaveis) são PRIVADOS, em prol da segiurabça da informação
Get -> pegar
Set -> Setar


#### Sobrecarga de metodos

Sobrecarga de metodo é quando existe um mesmo metodo (ou varios) com o mesmo nome, o que diferencia é a quantidade/tipo dos parâmetros

 - modificador de acesso e retorno não importam.

Para evitar escritas dublicadas, podemos  fazer o seguinte:


```bash
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

```

Veja que iniciamos  o 2º init com o metodo init, ou seja,  antes dele executar o init com o genero, ele vai na anterior e executa aqueles metodos (variaveis) antes do init com o genero. ISto faz com uqe poupamos escritas, escrevemos menos.



## Metodos com static

#### Caso 1
````declarative
public class Calculadora {


    public int somarNumeros(int a, int b){
        System.out.println("Iniciando a função da soma: ");
        return a + b;
    }
}

    public class CalculadoraTest01 {
        public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        int reesult = cal.somarNumeros(21, 90);
    }
}
````

#### Caso 2
````declarative
public class Calculadora {


    public static int somarNumeros(int a, int b){
        System.out.println("Iniciando a função da soma: ");
        return a + b;
    }
}

    public class CalculadoraTest01 {
        public static void main(String[] args) {

        int reesult = somarNumeros(21, 90);
    }
}
````

* A diferença entre ambos casos, é que no caso 1, instanciamos um objeto ( neste caso, calculadora) para usarmos a função somarNumeros. Já no caso 2, o metodo ´SomarNumeros´ virou static, quando precisamos da sua função, basta chama-la direto
- Lembrar de importar o metodo static, pois ele vai recebe o static (import static estudos.java.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora.somarNumeros;)

  
       