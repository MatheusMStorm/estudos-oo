package roteiro6.parte1;

public class Principal {

    public static void main(String[] args) {

        Ligacao lig01 = new Ligacao("71983003190", "71982155190", "Salvador", "Cruz das Almas", "10:15:02");

        // Horário de término seria 10:20:35
        lig01.setHoraFim("10:20:35");

        // Nesse caso, não é possível fazer o cálculo da duração da chamada, pois se tratam de duas strings.
    }
    
}
