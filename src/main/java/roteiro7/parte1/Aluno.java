package roteiro7.parte1;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private int anoIngresso;
    private int qtdeDisciplinas;
    private String situacao;
    
    public Aluno(String nome, int matricula, String curso, int anoIngresso, int qtdeDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.qtdeDisciplinas = qtdeDisciplinas;
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

    public int getQtdeDisciplinas() {
        return qtdeDisciplinas;
    }

    public void setQtdeDisciplinas(int qtdeDisciplinas) {
        this.qtdeDisciplinas = qtdeDisciplinas;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    
    
}
