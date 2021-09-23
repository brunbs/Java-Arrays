import java.util.Arrays;

public class ComparandoArray {

    public static void main(String[] args) {

    /*       compare():
        primeiroArray < segundoArray => retorno negativo
        primeiroArray > segundoArray => retorno positivo
        Arrays de mesmo tamanho = retorna 0
    */

        System.out.println(Arrays.compare(new int[] {1}, new int[] {2})); //retorna -1
        System.out.println(Arrays.compare(new int[] {2, 3, 5}, new int[] {2, 3, 4})); //retorna 1 pois o primeiro elemento diferente é maior no primeiro array
        /* ::::Regras:::
         1 - se os dois arrays tem o mesmo tamanho e os mesmos valores nos mesmos locais, retorna zero
         2 - se todos os elementos são iguais mas o segundo array tem elementos extras no final, retorna negativo
         3 - se todos os elementos são o mesmo mas o primeiro array tem elementos extras no final, retorna positivo
         4 - se o primeiro elemento diferente é menor no primeiro array, retorna número negativo
         5 - se o primeiro elemento diferentes é maior no primeiro array, retorna número positivo
         6 - para comparação de arrays, ambas devem ser do mesmo tipo!
        */

        System.out.println("###############################################");

    /* mismatch():
    se os arrays são iguais, retorna -1
    Se os arrays são diferentes, ele retorna o primeiro índice em que eles se diferenciam
    */

        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1})); //retorna -1 pois são iguais
        System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"})); //retorna 0 pois se diferem no índice 0
        System.out.println(Arrays.mismatch(new int[] {1,2}, new int[] {1})); //retorna 1 pois nesse índice ocorre a diferença

        System.out.println("###############################################");


    /* equals():
        retorno booleano: true se os arrays são iguais, false se são diferentes
    */
        System.out.println(Arrays.equals(new int[] {1}, new int[] {1}));
        System.out.println(Arrays.equals(new int[] {1}, new int[] {2}));

    }
}
