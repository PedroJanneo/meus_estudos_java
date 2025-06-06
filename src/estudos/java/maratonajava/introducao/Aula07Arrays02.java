package estudos.java.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {


        int[] idades = new int[3];
        char[] caracter = new char[1];
        String[] texto = new String[4];




        texto[0] = "Goku";
        texto[1] = "Vegeta";
        texto[2] = "Zoro";
        texto[3] = "Luffy";

        for ( int i = 0; i < texto.length; i++){
            System.out.println(texto[i]);
        }
    }
}
