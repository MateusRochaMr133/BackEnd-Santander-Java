import java.time.LocalDate; /* Faz parte de outro pacote, estamos fazendo o import desta classe para esse codigo */
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class ManipulacaoStringsDatas {
    
    public static void main(String[] args) {
        
        /* Ola {nome}, Hoje é {Dia-da-semana}, Bom dia */
       /*  String nome = "Jesse";
        System.out.println(nome.toUpperCase()); */ /* toUpperCase = Letras maisculas e toLowerCase = letras minusculas */
       /*  System.out.println(nome.toLowerCase());
        System.out.println(nome.length());   */    /* Length - Comprimento que aquela string tem */

       /*  String nomeOutro = "jesse";
        System.out.println(nome.equalsIgnoreCase(nomeOutro)); */     /* Comparar strings se a diferença de maiusculas ou minusculas é igual neste caso use o equalsIgnoreCase */
        String nome = "Jesse";

        /* LocalDate - Variavel importada
         */
        LocalDate hoje = LocalDate.now();   /* Representa uma data com as informações locais */ 

        Locale brasil = new Locale("pt", "BR");

        /* System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));     *//* getDayOfWeek - Dia da Semana 
        getDisplayName - Metodo para obter o nome de exibição de um objeto, ele esta neste caso trazendo o formato do texto pro estilo do brasil*/
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() <12) {
            saudacao = "Bom dia";
        }
        else if ( agora.getHour() >=12 && agora.getHour() < 18) {
            saudacao = "Boa Tarde";
        }
        else if ( agora.getHour() >=18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        }
        else {
            saudacao = "Olá,";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());   /* PrintLine - Escreve uma abaixo da outra ja nesse, printf precisamos nessecariamente fazer a quebra de linha %n
        %s - Representa String
        %n - Quebra de linha*/
    }

}
