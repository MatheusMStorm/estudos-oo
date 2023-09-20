package roteiro7.parte2;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        
        for (int i=0; i<4; i++) {
            String nome = JOptionPane.showInputDialog("Nome: ");
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula: "));
            String curso = JOptionPane.showInputDialog("Curso: ");
            int anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano de ingresso: "));
            int qtdeDisciplinas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de disciplinas: "));
            
            Aluno aluno = new Aluno(nome, matricula, curso, anoIngresso, qtdeDisciplinas);
            listaAlunos.add(aluno);
        }
       
        for (int j=0; j<4; j++) {
        JOptionPane.showMessageDialog(null, "Nome: " + listaAlunos.get(j).getNome());
        JOptionPane.showMessageDialog(null, "Matrícula: " + listaAlunos.get(j).getMatricula());
        JOptionPane.showMessageDialog(null, "Curso: " + listaAlunos.get(j).getCurso());
        JOptionPane.showMessageDialog(null, "Nome: " + listaAlunos.get(j).getAnoIngresso() + "\n");
        }
    
    }
}
