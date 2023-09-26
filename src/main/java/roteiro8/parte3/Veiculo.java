package roteiro8.parte3;

public abstract class Veiculo { // o abstract não pode ser instanciado, apenas herdado
    private String placa;
    private int anoFabricacao;
    protected double taxaPedagio = 6.0;
    
    public Veiculo(String placa, int anoFabricacao) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double calcPedagio() {
        return this.taxaPedagio;
    }

}
