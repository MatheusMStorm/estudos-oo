package roteiro2.parte5;

import java.util.Scanner;
import java.util.Random;

public class exercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Random random = new Random();
        int numero_secreto = random.nextInt(100) + 1;
        
        int numero_usuario = 0;
        while(numero_usuario != numero_secreto) {
            System.out.println("Digite um valor de 1 a 100: ");
            numero_usuario = entrada.nextInt();
            
            if(numero_usuario == numero_secreto) {
                System.out.println("Parabens! Voce acertou o valor!");
            } else if(numero_usuario > numero_secreto) {
                System.out.println("Mais baixo!");
            } else if(numero_usuario < numero_secreto) {
                System.out.println("Mais alto!");
            }
        }

        entrada.close();
    }
}
