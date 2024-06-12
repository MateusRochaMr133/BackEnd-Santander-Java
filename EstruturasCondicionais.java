public class EstruturasCondicionais {

    public static void main(String[] args) {
        
        /* int nota = 70; */
         
        /* Nota maior ou igual 70, então aprovado */
        /* if (nota >= 70) {
            System.out.println("Aluno Aprovado");
        }
        else {
            System.out.println("Aluno não Aprovado");
        } */

        
        /* int nota = 50; */
        /* int nota = -1; */
        int nota = 100;
        String graduacao;

        /* A 80 B 70 C 60 D 0 */
        if (nota >= 80) {
            /* System.err.println("Nota A"); */
            graduacao = "A";
        }
        else if (nota <80 && nota >= 70) {
            /* System.out.println("Nota B"); */
            graduacao = "B";
        }
        else if (nota <70 && nota >=60) {
            /* System.out.println("Nota C"); */
            graduacao = "C";
        }
        else if (nota <60 && nota >=0) {
            /* System.out.println("Nota E"); */
            graduacao = "D";
        }
        else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado!");    
                break;
            case "C":    
            case "D":
                System.out.println("Aluno Reprovado!");
                break;
            default:
                System.out.println("Graduaçao Invalida");
        }

    }
    
}
