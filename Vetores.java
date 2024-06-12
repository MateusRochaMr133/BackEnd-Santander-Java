/* import java.util.Arrays; */

public class Vetores {
    
    public static void main(String[] args) {
        /* int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5; */

        /* Definindo um array a numeros que vai ter 5 posições, não podemos adicionar um 6 elemento a esse array,  podemos preencher 1 posição, nenhuma posição ou 5 posições*/
        /* int[] numeros = new int[5];  */
        /* [0] [1] [2] [3] [4] - 0 - Conta como a posição 1 do array*/

        /* numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5; */
       

        /* Para acessar os elementos do array usamos um laço numerico-for */
        /* Numeros.length - Esta indicando o comprimento do array */
       /*  for (int i=0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        } */


        /* String[] letras = new String[5]; */
        /* [0] [1] [2] [3] [4] - 0 - Conta como a posição 1 do array */

        /* letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "E";
        
        for (int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }  */

        /* Para Adicionar os valores dentro do array de forma resumida */
        /* String[] letras = { "A", "B" , "C" , "J" , "X"};

        for (int i=0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        System.out.println(Arrays.toString(letras)); */

        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            media += numeros[i];        /* media = media + numeros[i] */

        }

        System.out.println("Maior" + maior);
        System.out.println("Menor" + menor);
        System.out.println("Média" + media/numeros.length);

    }

}

/* Não podemos misturar tipos dentro do array, se declaramos um array do tipo int ou string não podemos misturar numeros e textos porque a linguagem java é fortemente tipada */
