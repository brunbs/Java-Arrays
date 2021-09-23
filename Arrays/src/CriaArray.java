import java.util.Arrays;

//PROBLEMA DO ARRAY: o tamanho não muda após a declaração, então já temos que saber inicialmente seu tamanho

public class CriaArray {
    public static void main(String[] args) {

        //Os arrays possuem tamanhos estáticos pré definidos. Começam em índice 0

        int[] numbers = new int[2]; //declarando um array de inteiros (numbers é uma referência para um objeto array) com 2 posições
        int[] numbers2 = new int[] {42, 55, 99}; //este array já possui três valores pré definidos
        int[] numbers3 = {42,55,99}; //outra forma de criar um array
        //observação: também pode ser criado com os colchetes após o nome da variável

        System.out.println(numbers2[0]); //printa a primeira posição
        System.out.println(numbers2[1]); //printa a segunda posição


        System.out.println("------------------------");

        for (int i = 0; i < numbers2.length; i++) { //este for itera o array printando cada elemento
            System.out.println(numbers2[i]);
        }

        //Podemos criar um array de referências que apontam para objetos!
        String[] artropodos = {"aracnideos", "crustaceos", "insetos"}; //cria um array de 3 posições que apontam para objetos do tipo String
        String[] alias = artropodos;

        System.out.println(artropodos.equals(alias)); //irá retornar true pois as duas apontam para o mesmo objeto, ou seja, possuem a mesma referência. Ele não está comparando o que está dentro do array e sim que são a mesma referência
        System.out.println(artropodos.toString()); //mostra que é um array, do tipo de referência lang.String e seu hash code
        //Podemos utilizar o método equals() pois um array é um objeto

        System.out.println(Arrays.toString(artropodos)); //invoca o método toString do objeto (método herdado da Classe Objeto



    }



}
