package estudos.java.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {


        byte day = 3;

        switch (day){
            default:
                System.out.println("Dia invalido");
                break;
            case 1:
                System.out.println("Domingo - Dia não útil");
                break;
            case 2:
                System.out.println("Segunda - Dia Util");
                break;
            case 3:
                System.out.println("Terça - Dia Util");
                break;
            case 4:
                System.out.println("Quarta - Dia Util");
                break;
            case 5:
                System.out.println("Quinta - Dia Util");
                break;
            case 6:
                System.out.println("Sexta - Dia util");
                break;
            case 7:
                System.out.println("Sabado - Dia não util");
                break;

        }


        switch (day){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia da semana");
                break;

            default:
                System.out.println("Dia invalido");

        }
    }
}
