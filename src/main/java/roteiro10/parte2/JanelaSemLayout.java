package roteiro10.parte2;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JanelaSemLayout extends JFrame{
    
    private int largura = 600;
    private int altura = 600;
    private JButton amistoso;
    private JButton modoDirigente;
    private JButton modoJogador;
    private JButton ligaCopa;
    private JButton opcoes;
    private JButton saida;
    
    public JanelaSemLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Football League");
        
        this.setLayout(null);
        
        this.iniciarComponentes();
        
        this.setVisible(true);  
    }
    
    public void iniciarComponentes() {
        
        amistoso = new JButton("AMISTOSO");
        modoDirigente = new JButton("MODO DIRIGENTE");
        modoJogador = new JButton("MODO JOGADOR");
        ligaCopa = new JButton("LIGA/COPA");
        opcoes = new JButton("OPÇÕES");
        saida = new JButton("SAIR");
        
        amistoso.setBounds(20, 50, 160, 30);
        modoDirigente.setBounds(180, 50, 160, 30);
        modoJogador.setBounds(20, 90, 160, 30);
        ligaCopa.setBounds(180, 90, 160, 30);
        opcoes.setBounds(20, 130, 160, 30);
        saida.setBounds(180, 130, 160, 30);
        
        this.add(amistoso);
        this.add(modoDirigente);
        this.add(modoJogador);
        this.add(ligaCopa);
        this.add(opcoes);
        this.add(saida);
        
    }
    
    
}
