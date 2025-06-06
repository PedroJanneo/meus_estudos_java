package estudos.java.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        int[] numeros2 ={1,2,3,4,5,6}; //array
        int[] numeros3 = new int[]{6,5,4,3,2,1}; //array

        String[] textos = new String[]{"texto1","texto2","texto3"};

        /*for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
            System.out.println(numeros3[i]);
        }*/


       for(int i : numeros3){ // for each | o I tem q ser do mesmo tipo da array(numero3)
            System.out.println(i);
        }


        for ( String i : textos){ // for each, o I tem q ser do mesmo tipo da array(textos)
            System.out.println(i);
        }









    }
}
