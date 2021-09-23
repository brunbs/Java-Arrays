import java.util.Arrays;

public class OrdenaArray {

    public static void main(String[] args) {

        int[] numbers = {6, 9, 1};
        Arrays.sort(numbers); //coloca os elementos em ordem

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println(Arrays.toString(numbers)); //outra forma de printar

        /* Outra forma de iterar printando os elementos
        for (int numero : numbers) {
            System.out.println(numero);
        }
        */
    }

}
