package roteiro2.parte3;

import java.util.Scanner;

public class programa07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double nota = 0;
        double soma_notas = 0;
        int cont = 0;
        
        while (nota != -1) {
            System.out.println("Informe sua nota: ");
            nota = entrada.nextInt();
            
            if(nota != -1) {
                soma_notas = soma_notas + nota;
            }
            
            cont++;
        }
        
        cont = cont - 1;
        
        double media = soma_notas/cont;
        System.out.println("Media: " + media);

        entrada.close();
    }
}
