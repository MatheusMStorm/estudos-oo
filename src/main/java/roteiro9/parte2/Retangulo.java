package roteiro9.parte2;

public class Retangulo implements FormaGeometrica {
    
    private double altura;
    private double largura;
    
    public Retangulo (double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    @Override
    public String getNomeFigura() {
        return "Retângulo";
    }
    
    @Override
    public double getArea() {
       return largura*altura; 
    }
    
    @Override
    public double getPerimetro() {
        return (largura + altura)*2;
    }
    
}
