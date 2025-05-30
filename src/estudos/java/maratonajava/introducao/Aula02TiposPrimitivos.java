package estudos.java.maratonajava.introducao;

/**
 *  tipos primitivos: int, double, float, char, byte, long, boolean
 *  <br>
 *  booleans = sempre começam  com 'is' <br>
 *  o char traduz os numeros para a tabela <b>ASCII</b> OU se colocar '/VALORES_NUMERICO' usado a tabela <b>unicode</b>
 */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int ageUser = 10;
        double salary = 2000.00; // não precisa especificar
        float salaryTwo = 25000.0F;
        byte ageByte = 10;
        short  ageShort = 10;
        boolean requisition = true;
        boolean requisitionTwo = false;
        long numberLong = 1000000000000L;
        char chacracter = 1120;


        int fazendoUmcasting = (int) 10000000000000000L; // fazendo um casting (forçar a entrada do valor long no int)




        System.out.println(ageUser + " é sua idade");
        System.out.println(salary);
        System.out.println(salaryTwo);
        System.out.println(ageByte);
        System.out.println(ageShort);
        System.out.println(requisition);
        System.out.println(requisitionTwo);
        System.out.println(numberLong);
        System.out.println("teste:" + chacracter);
    }


}
