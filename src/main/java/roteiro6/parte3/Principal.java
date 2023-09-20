package roteiro6.parte3;

public class Principal {

    public static void main(String[] args) {

        Tempo horaInicial = new Tempo (10, 00, 00);
        Tempo horaFinal = new Tempo (10, 50, 20);
        Ligacao lig01 = new Ligacao("71983003190", "71982155190", "Salvador", "Cruz das Almas", horaInicial);
        
        lig01.setHoraFim(horaFinal);
        
        String verificacao = lig01.verificarNumeros("9988877");
        System.out.println(verificacao);
        
        double valorPorMin = lig01.calcValor();
        double valorPorMin_v2 = lig01.calcValor_v2();
        
        System.out.println("O valor da ligação é de R$ " + valorPorMin);
        System.out.println("O valor da ligação é de R$ " + valorPorMin_v2);
    }
}