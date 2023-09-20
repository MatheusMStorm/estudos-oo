package roteiro6.parte3;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public static int calcDuracaoMinutos(Tempo ini, Tempo fim){
        int minutosIni = ini.getHora()*60 + ini.getMinuto();
        int minutosFim = fim.getHora()*60 + fim.getMinuto();
        
        return minutosFim - minutosIni;
    }

    
     public static int calcDuracaoMinutos_v2(Tempo ini, Tempo fim){
        int segundosIni = ini.getHora()*3600 + ini.getMinuto()*60 + ini.getSegundo();
        int segundosFim = fim.getHora()*3600 + fim.getMinuto()*60 + fim.getSegundo();
        
        int diferencaSeg = segundosFim - segundosIni;
        
        if (diferencaSeg%60 > 0) {
            return diferencaSeg/60 + 1;
        } else {
            return diferencaSeg/60;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}