





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