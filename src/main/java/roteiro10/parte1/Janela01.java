package roteiro10.parte1;

import javax.swing.JFrame;

public class Janela01 extends JFrame {
    
    private int altura = 600;
    private int largura = 500;
    
    public Janela01 () {  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setVisible(true);
    }
}
