package estudos.java.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {


        int age = 21;
        String categoria;

        if (age < 15) {
            categoria = "Infantil";
        } else if (age >= 15 && age < 18) {
            categoria = "InfatoJuvenil";

        } else {
            categoria = "Adulto";
        }

        System.out.println(categoria);
    }
}
