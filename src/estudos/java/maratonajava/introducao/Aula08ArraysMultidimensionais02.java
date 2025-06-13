package estudos.java.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[2][];



        arrayInt[0] = new int[2]; //valor 0, pois nao foi definido
        arrayInt[1] = new int[]{1,2,3}; //valor 1,2,


        int[][] arrayInt2 = {{0,1},{3,4,5},{1,2,3,4,5,6}}; //atribuindo valores

        for(int[] arrayBase : arrayInt2){
            System.out.println("\n --------");
            for(int num : arrayBase){
                System.out.print(num + "");
            }
        }
    }
}
