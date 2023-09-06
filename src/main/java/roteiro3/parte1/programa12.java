package roteiro3.parte1;

import java.util.Scanner;

public class programa12 {

/*
    public static double calcGrat(double sb) {
        
        return sb*5/100;
    }
    
   public static double calcImp(double sb) {
        
        return sb*7/100;
    }    
   */
  public static double calcPercentual(double sb, int perc) {
        
        return sb*perc/100;
    }       

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double salarioBase, grat, imp, salarioReceber;
        
        System.out.println("Digite o seu salario: ");
        salarioBase = entrada.nextDouble();
        
        grat = calcPercentual(salarioBase, 5);
        imp = calcPercentual(salarioBase, 7);
        
        salarioReceber = salarioBase + grat - imp;
        
        System.out.println("O salario a receber e de R$ " + salarioReceber);

        entrada.close();
    }
}
