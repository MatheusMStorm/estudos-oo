package roteiro2.parte3;

import java.util.Scanner;

public class programa06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int nota = 0;
        while (nota != -1) {
            System.out.println("Informe sua nota: ");
            nota = entrada.nextInt();
            
            if (nota >= 7) {
              System.out.println("Aluno aprovado.");
            } else {
              System.out.println("Aluno reprovado.");
            }
        }

        entrada.close();
    }
}
