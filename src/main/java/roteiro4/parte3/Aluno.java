package roteiro4.parte3;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String curso;
    private int anoIngresso;

    Aluno(String pNome, int pMatricula, String pCurso, int pAnoIngresso) {
        nome = pNome;
        matricula = pMatricula;
        curso = pCurso;
        anoIngresso = pAnoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    
}
