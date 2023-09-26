package roteiro8.parte2;

public class Principal {
    
    public static void main(String[] args) {

        // Veiculo v01 = new Veiculo("PKR0155", 2018);
        // Criar o veículo v01 acaba por ficar muito generalista nesse contexto

        VeiculoCarga v02 = new VeiculoCarga("OKS2199", 2015, 1000);
        VeiculoPasseio v03 = new VeiculoPasseio("NTG2112", 2010, 6);
        VeiculoPequeno v04 = new VeiculoPequeno("JPG9265", 2009, "Chevrolet Classic");

        // System.out.println(v01.getPlaca());
        //  System.out.println(v01.getAnoFabricacao());

        System.out.println(v02.getPlaca());
        System.out.println(v02.getAnoFabricacao());
        System.out.println(v02.getPesoMax());
        System.out.println("Pedágio v02: " + v02.calcPedagio());

        System.out.println(v03.getPlaca());
        System.out.println(v03.getAnoFabricacao());
        System.out.println(v03.getQtdeMaxPassageiros());
        System.out.println("Pedágio v03: " + v03.calcPedagio());

        System.out.println(v04.getPlaca());
        System.out.println(v04.getAnoFabricacao());
        System.out.println(v04.getModelo());
        System.out.println("Pedágio v04: " + v04.calcPedagio());
    }
}
