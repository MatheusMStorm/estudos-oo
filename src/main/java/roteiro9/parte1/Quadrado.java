package roteiro9.parte1;

public class Quadrado implements FormaGeometrica {
    
    private double lado;
    
    public Quadrado (double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }
    
    @Override
    public double getArea() {
       return lado*lado; 
    }
    
    @Override
    public double getPerimetro() {
        return lado*4;
    }
    // Essa técnica utiliza o polimorfismo, uma vez que sobrescreve métodos de outras classes/interfaces.
}
