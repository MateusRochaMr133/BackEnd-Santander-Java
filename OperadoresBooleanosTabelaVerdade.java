public class OperadoresBooleanosTabelaVerdade {

    public static void main(String[] args) {

        /* boolean resultado = false;  */     /* Atribuindo a variavel resultado boolean que vai receber true ou false */
        /* System.out.println(resultado); */     /* Neste caso irá retornar false porque foi atribuido a variavel resultado false */
        /* sout = Ira preencher automaticamente o comando system.out.println(); */

        /* boolean fimDeSemana = true;    */  /* Recomendavel que seja escrito fimDeSemana e não fimdesemana, não é recomendavel iniciar com numeros e nem com caracteres especiais */

        boolean fimDeSemana = false;
        
        boolean fazendoSol = true;

        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia); /* O resultado será falso pois uma das variaveis é false e de acordo com a tabela verdade do operador && se um dos valores for false vai retornar false */

        /* Tabela Verdade */
        /* Operador && (AND) */
        /* True && True = true */
        /* True && False = false */
        /* False && True = false */
        /* False && false = false */


        /* Operador || (OR) */
        /* Tabela Verdade */
        /* True || true = true */
        /* True || False = true*/
        /* False || True = true*/
        /* False || False = false*/      
        
        System.out.println(vamosAPraia);

        /* Operador Ternario */
        /* Nos temos 3 termos, o 1 = fimDeSemana que será avaliado;
         * o  2 Termo "É fim de Semana se for true ira retornar este texto;
         * o 3 Termo "Não é fim de semana se for false irá retornar este texto"
         */
        String mensagem = fimDeSemana ? "É fim de Semana" : "Não é fim de semana";      /* Atribuindo valor a uma condiçao com o operador ternario, se for false vai mostrar o 2 texto, se for true irá mostar o 1 texto ? */
        System.out.println(mensagem);
    }

}
