package estudos.java.maratonajava.introducao;

public class Aula06EstruturasRepeticoes05 {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue; // faz o oposto do break, mesmo que a condição for atendida, ele continua
            }
            System.out.println("parcela " + parcela);
        }
    }
}
