package roteiro7.parte3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

        int cont = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos você quer cadastrar?"));
        int i = 0;

        while (i < cont){
            String nome = JOptionPane.showInputDialog("Nome: ");
            int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula: "));
            String curso = JOptionPane.showInputDialog("Curso: ");
            int anoIngresso = Integer.parseInt(JOptionPane.showInputDialog("Ano de ingresso: "));
            
            Aluno aluno = new Aluno(nome, matricula, curso, anoIngresso);
            
            boolean existeDisciplina = true;

            while (existeDisciplina) {
                String disciplina = JOptionPane.showInputDialog("Digite uma disciplina (caso não queira incluir outras disciplinas, digite 'N/A'): ");
                if (disciplina.equals("N/A")) {
                    existeDisciplina = false;
                } else {
                    aluno.adicionarDisciplinas(disciplina);
                }
            } 

            listaAlunos.add(aluno);

            i++;
        }

        i = 0;

        while (i < cont) {
            JOptionPane.showMessageDialog(null, 
                                "Nome: " + listaAlunos.get(i).getNome() + "\n" +
                                "Matrícula: " + listaAlunos.get(i).getMatricula() + "\n" +
                                "Curso: " + listaAlunos.get(i).getCurso() + "\n" +
                                "Ano de ingresso: " + listaAlunos.get(i).getAnoIngresso() + "\n" +
                                "Quantidade de disciplinas: " + listaAlunos.get(i).getListaDisciplinas().size()
                                );

            i++;
        }
    
    }
}
