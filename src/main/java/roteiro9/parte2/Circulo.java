package roteiro9.parte2;

public class Circulo implements FormaGeometrica {
    
    private double raio;
    
    public Circulo (double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public String getNomeFigura() {
        return "Círculo";
    }
    
    @Override
    public double getArea() {
       return 3.14*raio*raio; 
    }
    
    @Override
    public double getPerimetro() {
        return 2*3.14*raio;
    }
}
