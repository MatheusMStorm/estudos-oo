package roteiro3.parte1;

import java.util.Scanner;

public class programa10 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salarioBase, grat, imp, salarioReceber;
        
        System.out.println("Digite o seu salario: ");
        salarioBase = entrada.nextDouble();
        
        grat = salarioBase * 5/100;
        imp = salarioBase * 7/100;
        salarioReceber = salarioBase + grat - imp;
        
        System.out.println("O salario a receber e de R$ " + salarioReceber);

        entrada.close();
    }
}
