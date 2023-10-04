package roteiro10.parte2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// GridLayout - janelas em linhas e colunas

public class JanelaGridLayout extends JFrame{
    
    private JButton amistoso;
    private JButton modoDirigente;
    private JButton modoJogador;
    private JButton ligaCopa;
    private JButton opcoes;
    private JButton saida;
    
    public JanelaGridLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Football League");
        
        this.setLayout(new GridLayout(2, 3));
        
        this.iniciarComponentes();
        
        this.pack();
        this.setVisible(true);  
    }
    
    public void iniciarComponentes() {
        
        amistoso = new JButton("AMISTOSO");
        modoDirigente = new JButton("MODO DIRIGENTE");
        modoJogador = new JButton("MODO JOGADOR");
        ligaCopa = new JButton("LIGA/COPA");
        opcoes = new JButton("OPÇÕES");
        saida = new JButton("SAIR");
        
        this.add(amistoso);
        this.add(modoDirigente);
        this.add(modoJogador);
        this.add(ligaCopa);
        this.add(opcoes);
        this.add(saida);
        
    }
}
