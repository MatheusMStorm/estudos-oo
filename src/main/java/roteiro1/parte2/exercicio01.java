package roteiro1.parte2;

public class exercicio01 {
    
    public static void main(String[] args) {
        
        double salario = 3500;
        int horas_extras = 20;
        
        double salario_hora = salario/40;
        double salario_total = salario + (salario_hora*horas_extras);
        
        System.out.println("Salário base: " + salario_total);
    }
    
}
