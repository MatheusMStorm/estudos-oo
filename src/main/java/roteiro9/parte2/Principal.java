package roteiro9.parte2;

public class Principal {
    
    public static void main(String[] args) {
        
        Quadrado q1 = new Quadrado(5);
        Retangulo r1 = new Retangulo(4, 8);
        Circulo c1 = new Circulo(6);
        
        System.out.println("---------------- TESTE 1 ----------------");
        System.out.println("Nome da figura: " + q1.getNomeFigura());
        System.out.println("Área da figura: " + q1.getArea());
        System.out.println("Perímetro da figura: " + q1.getPerimetro());
        
        
        System.out.println("---------------- TESTE 2 ----------------");
        System.out.println("Nome da figura: " + r1.getNomeFigura());
        System.out.println("Área da figura: " + r1.getArea());
        System.out.println("Perímetro da figura: " + r1.getPerimetro());
        
        System.out.println("---------------- TESTE 3 ----------------");
        System.out.println("Nome da figura: " + c1.getNomeFigura());
        System.out.println("Área da figura: " + c1.getArea());
        System.out.println("Perímetro da figura: " + c1.getPerimetro());
    }
}
