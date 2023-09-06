package roteiro2.parte3;

import java.util.Scanner;

public class programa05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        for(int i=0; i<5; i++) {
            System.out.println("Informe a nota: ");
            int nota = entrada.nextInt();
            
            if (nota >= 7) {
              System.out.println("Aluno aprovado.");
            } else {
              System.out.println("Aluno reprovado.");
            }
        }
        
        entrada.close();
    }

}
