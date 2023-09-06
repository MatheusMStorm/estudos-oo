package roteiro4.parte2;

public class Principal {
    
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Matheus Moura", 1272121774, "Engenharia de Computacao", 2021);

        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de ingresso: " + aluno01.anoIngresso);
    }
}
