package estudos.java.maratonajava.introducao;
/**
 * <b>Estruturas de repeticoes: <br></b>
 * FOR e WHiLE é mais usado.
 * <br>
 * Do - While dificil ( casos muitos especificos)
 */
public class Aula06EstruturasRepeticoes01 {
    public static void main(String[] args) {

        byte count = 0;

        while (count < 10){
            System.out.println("laço de repetição usando o while " + ++count);
        }


        count = 0;
        do {
            System.out.println("laço de repetição usando o do while");
            count++;
        } while (count < 10 );



        for ( byte i = 0; i < 10 ; i++){
            System.out.println("Laço de repetição usando o for " + i);
        }

    }

}
