package roteiro10.parte1;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Janela02 extends JFrame {
    
    private int altura = 400;
    private int largura = 400;
    private JButton btn01;
    private JButton btn02;
    
    public Janela02 () {  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Clica aí");
        this.setLayout(null);
        // sem o setLayout nulo, botões podem ocupar toda a tela ou se sobrepôr um ao outro
        
        btn01 = new JButton ("SIM");
        btn02 = new JButton ("NÃO");
        
        // dimensões
        btn01.setBounds(20, 50, 100, 40);
        btn02.setBounds(130, 50, 100, 40);
        
        this.add(btn01);
        this.add(btn02);
        
        this.setVisible(true);
    }
}
