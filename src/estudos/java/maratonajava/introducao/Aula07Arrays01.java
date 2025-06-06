package estudos.java.maratonajava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        // tipo referencias | array é objeto | array começa em 0
        int [] ages = new int[3];

        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 23;

try {
    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);
    System.out.println(ages[3]);
} catch (ArrayIndexOutOfBoundsException exepction) {
    System.out.println("Invalido");
}



    }
}
