import java.util.Arrays;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        // ###### DECLARANDO UM ARRAY MULTIDIMENSIONAL ######
        int[][] vars1;
        int vars2[][];

        String [][] retangulo = new String[3][2];

        retangulo[0][1] = "set";


        int[][] tamanhosDiferentes = {{1,4}, {3}, {9,8,7}}; //array de 3 elementos. O primeiro elemento tem dois dentro dele (tamanho 2), o segundo tem um (tamanho 1) e o terceiro tem três (tamanho 3)

        //outra forma de declarar um array assimétrico:

        int [][] teste = new int[4][];
        teste[0] = new int[5];
        teste[1] = new int[3];

        teste[0][1] = 10;
        System.out.println(teste[0][1]);

        System.out.println("##################################");

        //########## USANDO UM ARRAY MULTIDIMENSIONAL ##########

        // Iterando:
        // modo1:
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(twoD[i][j] + " ");
                System.out.println();
            }
        }

        System.out.println("--------------------");

        //modo2:
        for (int[] inner : twoD) {
            for (int num : inner) {
                System.out.println(num + " ");
                System.out.println();
            }
        }



    }
}
