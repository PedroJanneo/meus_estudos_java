package estudos.java.maratonajava.javacore.Bintroducaometodos.dominio;

/**
 * void -> sem retorno <br>
 * <tipo_da_funcao -> com retorno
 *<br>
 *  saida é diferente der retorno
 *
 *  saida -> imprimir console <br>
 *  retorno -> retornar algo.
 */
public class Calculadora {


    public static int somarNumeros(int a, int b){
        System.out.println("Iniciando a função da soma: ");
        return a + b;
    }

    public void subtrairNumeros(){
        System.out.println(18-9);
    }

    public void multiplicarNumeros(int num1,int num2){
        System.out.println(num1*num2);
    }

    public double dividirNumeros(double num1, double num2){
        return num1/num2;
    }

    public double dividirNumeros02(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        } else{
            return  0;
        }

    }

    public  void  dividirNumeros03(double num1, double num2 ){
        if(num2 == 0){
            System.out.println("Impossivel dividir por 0");
            return; //funciona igual o break do for/switch
        }
        System.out.println(num1/num2);
    }

    public void alterarDoisNumeros(int num1, int num2){
         num1 = 10;
         num2 = 100;

        System.out.println("Dentro da função ");
        System.out.println("n1 " +num1);
        System.out.println("n2 " +num2);
    }

    public void somarNumerosNovos(int[] numeros){
        System.out.println("------------");
        int soma = 0;
        for(int num : numeros){
             soma += num;

        }
        System.out.println(soma);

    }

    public void somarNumerosvarags(int ... numeros){ // o VARARGS serve pra RECEBER diversos argumentos, sem um limite e SEM criar a array antes
        System.out.println("------------");
        int soma = 0;
        for(int num : numeros){
            soma += num;

        }
        System.out.println(soma);
    }



    // Desafio 1:  criar uma calc que valida se um nmero é primo ou não
    // ewrornar true se for e false se nao for
    // Desaio 2: riar uma calc que recebe uma lista/array
    // retorme esta lista x2

}
