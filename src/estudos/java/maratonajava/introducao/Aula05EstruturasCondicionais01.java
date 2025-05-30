package estudos.java.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {


        int age = 20;
        boolean isAutorizadoComprarBebida = age == 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Bebida liberada");
        } else if(!isAutorizadoComprarBebida){
            System.out.println("teste");
        } else {
            System.out.println("Não pode beber");
        }

    }
}
