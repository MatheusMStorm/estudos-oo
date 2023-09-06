package roteiro4.parte3;

public class Principal {
    
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Matheus Moura", 1272121774, "Engenharia de Computacao", 2021);

        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matricula: " + aluno01.getMatricula());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());

        /*
        aluno01.matricula = 1272121775;

        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de ingresso: " + aluno01.anoIngresso);
        */

        aluno01.setMatricula(1272121775);

        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matricula: " + aluno01.getMatricula());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso: " + aluno01.getAnoIngresso());
    }
}
