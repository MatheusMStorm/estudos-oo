package roteiro3.parte2;

import java.util.Scanner;

public class programa14 {
    
    public static double soma(double x, double y) {
        return x + y;
    }
    
    public static double subtracao(double x, double y) {
        return x - y;
    }
    
    public static double multiplicacao(double x, double y) {
        return x * y;
    }
    
    public static double divisao(double x, double y) {
        return x / y;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        double valor1 = entrada.nextDouble();
        System.out.println("Digite a operacao (+, -, * ou /): ");
        String op = entrada.next();
        System.out.println("Digite o valor 2: ");
        double valor2 = entrada.nextDouble();
        
        switch(op) {
            case "+":
                System.out.println(soma(valor1, valor2));
                break;
            case "-":
                System.out.println(subtracao(valor1, valor2));
                break;
            case "*":
                System.out.println(multiplicacao(valor1, valor2));
                break;
            case "/":
                System.out.println(divisao(valor1, valor2));
                break;
        }

        entrada.close();
    }
}
