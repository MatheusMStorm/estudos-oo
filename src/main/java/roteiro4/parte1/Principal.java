package roteiro4.parte1;

public class Principal {
    
    public static void main(String[] args) {
        // Objeto 'aluno01'
        Aluno aluno01 = new Aluno();
        aluno01.nome = "Matheus Moura";
        aluno01.matricula = 1272121774;
        aluno01.curso = "Engenharia de Computacao";
        aluno01.anoIngresso = 2021;
        // Objeto 'aluno02'
        Aluno aluno02 = new Aluno();
        aluno02.nome = "Mauro Beting";
        aluno02.matricula = 1272111553;
        aluno02.curso = "Engenharia de Software";
        aluno02.anoIngresso = 2017;

        System.out.println("Nome: " + aluno01.nome);
        System.out.println("Matricula: " + aluno01.matricula);
        System.out.println("Curso: " + aluno01.curso);
        System.out.println("Ano de ingresso: " + aluno01.anoIngresso);

        System.out.println();

        System.out.println("Nome: " + aluno02.nome);
        System.out.println("Matricula: " + aluno02.matricula);
        System.out.println("Curso: " + aluno02.curso);
        System.out.println("Ano de ingresso: " + aluno02.anoIngresso);
    }
}
