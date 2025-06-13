package estudos.java.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {


        int[][] days = new int[4][4];

        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 1;
        days[1][1] = 2;
        days[1][2] = 3;

        days[2][0] = 1;
        days[2][1] = 2;
        days[2][2] = 3;

        days[3][0] = 1;
        days[3][1] = 2;
        days[3][2] = 3;

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }

        }

        System.out.println("------------------");
        for (int[] arrauBase : days) {
            for (int num : arrauBase) {
                System.out.println(num);
            }

        }


        String[][] nomes = new String[3][3];

        nomes[0][0] = "Pedro";
        nomes[0][1] = "Peu";
        nomes[0][2] = "Janneo";

        nomes[1][0] = "sla";
        nomes[1][1] = "sla1";
        nomes[1][2] = "sla2";

        nomes[2][0] = "teste";
        nomes[2][1] = "tete1";
        nomes[2][2] = "teste1";

        for (String[] arrayBase : nomes) {
            for (String escolhidos : arrayBase) {
                System.out.println(escolhidos);
            }
        }

    }
}
