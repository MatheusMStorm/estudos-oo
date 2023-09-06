package roteiro3.parte1;

import java.util.Scanner;

public class programa11 {
    
    public static double calcGrat(double salarioBase) {
        return salarioBase * 5/100;
    }
    
    public static double calcImp(double salarioBase) {
        return salarioBase * 7/100;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salarioBase, grat, imp, salarioReceber;
        
        System.out.println("Digite o seu salario: ");
        salarioBase = entrada.nextDouble();
        
        grat = calcGrat(salarioBase);
        imp = calcImp(salarioBase);
        salarioReceber = salarioBase + grat - imp;
        
        System.out.println("O salario a receber e de R$ " + salarioReceber);

        entrada.close();
    }
}
