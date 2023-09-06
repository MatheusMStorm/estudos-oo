package roteiro2.parte4;

import java.util.Scanner;

public class programa09 {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
    
        int[] notas = new int[5];
        
        for(int cont = 0; cont < 5; cont++) {
            System.out.println("Informe sua nota: ");
            int nota = entrada.nextInt();
            
            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota valida.");
                notas[cont] = nota;
            } else {
                System.out.println("Nota invalida.");
            }
        }
        
        for(int cont2 = 0; cont2 < 5; cont2++) {
            System.out.println(notas[cont2]);
        }

        entrada.close();
    }
}
