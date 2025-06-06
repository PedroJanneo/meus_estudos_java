package estudos.java.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {


        double salarioAnual = 25000;
        double primeiroImporsto = 9.70 / 100;
        double segundoImposto = 37.35 / 100;
        double terceiroImposto = 49.50 / 100;
        double imposto = 0;

        if (salarioAnual <= 34712) {
            imposto = salarioAnual * primeiroImporsto;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = salarioAnual * segundoImposto;
        } else {
            imposto = salarioAnual * terceiroImposto;
        }

        System.out.println("seu imposto é de: " + imposto);
    }
}
