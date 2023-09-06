package roteiro2.parte3;

import java.util.Scanner;

public class programa04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int cont = 0;
        while (cont < 5) {
            System.out.println("Informe a nota: ");
            int nota = entrada.nextInt();
            
            if (nota >= 7) {
              System.out.println("Aluno aprovado.");
            } else {
              System.out.println("Aluno reprovado.");
            }
            
            cont++;                  
            }
            
        entrada.close();    
        }
        
        
    }

