package roteiro8.parte2;

public class VeiculoPasseio extends Veiculo {
    private int qtdeMaxPassageiros;

    public VeiculoPasseio(String placa, int anoFabricacao, int qtdeMaxPassageiros) {
        super(placa, anoFabricacao);
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public int getQtdeMaxPassageiros() {
        return qtdeMaxPassageiros;
    }

    public void setQtdeMaxPassageiros(int qtdeMaxPassageiros) {
        this.qtdeMaxPassageiros = qtdeMaxPassageiros;
    }

    public double calcPedagio() {
        super.taxaPedagio = 5.0;
        return super.taxaPedagio * this.qtdeMaxPassageiros;
    }
}
