package roteiro3.parte2;

import java.util.Scanner;

public class programa13 {
    
    public static void soma(double x, double y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
    
    public static void subtracao(double x, double y) {
        System.out.println(x + " - " + y + " = " + (x - y));
    }
    
    public static void multiplicacao(double x, double y) {
        System.out.println(x + " * " + y + " = " + (x * y));
    }
    
    public static void divisao(double x, double y) {
        System.out.println(x + " / " + y + " = " + (x / y));
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor 1: ");
        double valor1 = entrada.nextInt();
        System.out.println("Digite a operacao (+, -, * ou /): ");
        String op = entrada.next();
        System.out.println("Digite o valor 2: ");
        double valor2 = entrada.nextInt();
        
        switch(op) {
            case "+":
                soma(valor1, valor2);
                break;
            case "-":
                subtracao(valor1, valor2);
                break;
            case "*":
                multiplicacao(valor1, valor2);
                break;
            case "/":
                divisao(valor1, valor2);
                break;
            default:
                System.out.println("Invalido!");
        }

        entrada.close();
    }
}
