package roteiro7.parte1;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        Aluno[] listaAlunos = new Aluno[4];
        
        for (int i=0; i<4; i++) {
            String nome = JOptionPane.showInputDialog("Nome: ");
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula: "));
            String curso = JOptionPane.showInputDialog("Curso: ");
            int anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano de ingresso: "));
            int qtdeDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de disciplinas: "));
            
            Aluno aluno = new Aluno(nome, matricula, curso, anoIngresso, qtdeDisciplinas);
            listaAlunos[i] = aluno;
        }
       
        for (int j=0; j<4; j++) {
        System.out.println("Nome: " + listaAlunos[j].getNome());
        System.out.println("Matrícula: " + listaAlunos[j].getMatricula());
        System.out.println("Curso: " + listaAlunos[j].getCurso());
        System.out.println("Nome: " + listaAlunos[j].getAnoIngresso() + "\n");
        }
    
    }
}
