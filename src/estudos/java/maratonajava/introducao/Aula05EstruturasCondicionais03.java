package estudos.java.maratonajava.introducao;

/**
 * <b>operador ternario (só if e else): </b><br>
 * String resultado = condição ? CONDIÇÃO_VERDADEIRO : CONDIÇÃO_FALSA
 *  --> pode ser String, int, boolean, vai depender da condição do operador ternario;
 *  <br> <br>
 *  <b>operador termario ( if, else if e else):</b> <br>
 *  String categoria =  condição ? CONDIÇÃO_VERDADEIRO : segunda_condicao ? SEGUNDA_CONDICAO_VERDADEIRA : CONDIÇÃO_FALSA
 *  <B>*NÃO RECOMENDADO*</B>
 */
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 100;
        String mensagemdoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaodoar = "Ainda não possuo condições, mas eu vou ter!";
        String resultado = "";

        resultado = salary > 5000 ? mensagemdoar : mensagemNaodoar;
        System.out.println(resultado);
    }
}
