public class aula02 {
    
    public static void main(String[] args) {
        
        int a;
        int b = 2;  /* Atribuindo valor a variavel 2 */

        a = 3;      /* Atribuindo valor a variavel 3 */

        int soma = a + b;   /* Atribuindo a variavel soma o valor de a + b */

        int subtracao = a - b;

        int multiplicaçao = a * b;

        float divisao = (float) a / b;      /* O resultado seria int mais agora ele vai virar float */

       System.out.println(soma);
       System.out.println(subtracao);
       System.out.println(multiplicaçao);
       System.out.println(divisao);     /* É uma variavel inteira o valor deu na divisao 1.5 no casos o 5 é ignorado, podemos mudar a variavel de int para float, o java entende que a divisao de um inteiro para um inteiro será inteiro tambem, podemos adotar 2 soluçoes e mudar o dado do a e do b para usar decimal podendo colocar float no a e no b, ou agente pode chamar a cast */
    }

}
