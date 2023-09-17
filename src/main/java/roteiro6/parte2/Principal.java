package roteiro6.parte2;

public class Principal {

    public static void main(String[] args) {

        Tempo horaInicial = new Tempo (10, 00, 00);
        Tempo horaFinal = new Tempo (10, 50, 00);
        Ligacao lig01 = new Ligacao("71983003190", "71982155190", "Salvador", "Cruz das Almas", horaInicial);

        String duracao = lig01.duracaoChamada(horaInicial, horaFinal);

        System.out.println("Duração da chamada: " + duracao + " minutos");
    }
}
