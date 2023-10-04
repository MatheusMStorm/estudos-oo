package roteiro10.parte2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

// BorderLayout - Definição do posicionamento por área

public class JanelaBorderLayout extends JFrame {
    
    private JButton amistoso;
    private JButton modoDirigente;
    private JButton modoJogador;
    private JButton ligaCopa;
    private JButton opcoes;
    
    public JanelaBorderLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Football League");
        
        this.setLayout(new BorderLayout());
        
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
        
        this.add(amistoso, BorderLayout.PAGE_START);
        this.add(modoDirigente, BorderLayout.PAGE_END);
        this.add(modoJogador, BorderLayout.LINE_START);
        this.add(ligaCopa, BorderLayout.LINE_END);
        this.add(opcoes, BorderLayout.CENTER);
        
    }
}
