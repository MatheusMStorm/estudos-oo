package roteiro7.parte3;

import java.util.ArrayList;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private int anoIngresso;
    private String situacao;
    private ArrayList<String> listaDisciplinas;
    
    public Aluno(String nome, int matricula, String curso, int anoIngresso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.listaDisciplinas = new ArrayList<>();
    }
    
    public void adicionarDisciplinas(String disciplina) {
        this.listaDisciplinas.add(disciplina);
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public ArrayList<String> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(ArrayList<String> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }
    
}
