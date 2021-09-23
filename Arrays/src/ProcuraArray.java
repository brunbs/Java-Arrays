import java.util.Arrays;

public class ProcuraArray {

    /* Podemos procurar no array caso ele esteja ordenado
    ao encontrar, retorna o índice
    não encontrando, retorna número negativo uma posição a menos do que a posição que o elemento deveria estar na ordem
    Por exemplo, na linha 16 o 1 deveria ocupar o indice 0, então 0 - 1 = -1
    Exemplo 2: na linha 17 o numero 3 ocuparia a posição 1, então -1 -1 = -2
    Exemplo 3: na linha 18 o número 9 ocuparia a posição 4, então -4 -1 = -7  */

    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numeros, 2)); //retorna 0
        System.out.println(Arrays.binarySearch(numeros, 4)); //retorna 1
        System.out.println(Arrays.binarySearch(numeros, 1)); //retorna -1
        System.out.println(Arrays.binarySearch(numeros, 3)); //retorna -2
        System.out.println(Arrays.binarySearch(numeros, 9)); //retorna -5
    }




}
