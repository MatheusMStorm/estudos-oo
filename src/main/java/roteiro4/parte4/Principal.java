package roteiro4.parte4;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno aluno01 = new Aluno();

        System.out.println("Digite seu nome: ");
        String aluno = entrada.next();
        aluno01.setNome(aluno);

        System.out.println("Digite sua matricula: ");
        int matricula = entrada.nextInt();
        aluno01.setMatricula(matricula);

        System.out.println("Digite seu curso: ");
        String curso = entrada.next();
        aluno01.setCurso(curso);

        System.out.println("Digite seu ano de ingresso: ");
        int anoIngresso = entrada.nextInt();
        aluno01.setAnoIngresso(anoIngresso);

        System.out.println("Digite sua quantidade de disciplinas: ");
        int qtdeDisciplinas = entrada.nextInt();
        aluno01.setQtdeDisciplinas(qtdeDisciplinas);

        if (aluno01.getQtdeDisciplinas() == 0) {
            aluno01.setSituacao("Nao Matriculado");
        } else {
            aluno01.setSituacao("Matriculado");
        }

        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matricula: " + aluno01.getMatricula());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de ingresso:" + aluno01.getAnoIngresso());
        System.out.println("Quantidade de disciplinas: " + aluno01.getQtdeDisciplinas());
        System.out.println("Situacao: " + aluno01.getSituacao());
        
        entrada.close();
    }
}
