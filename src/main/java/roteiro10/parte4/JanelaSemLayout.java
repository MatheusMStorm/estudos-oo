package roteiro10.parte4;

import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class JanelaSemLayout extends JFrame implements ActionListener{
    
    private int largura = 500;
    private int altura = 500;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(largura, altura);
        this.setTitle("Football League");
        
        this.setLayout(null);
        
        this.iniciarComponentes();
        
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("AMISTOSO");
        btn02 = new JButton("MODO DIRIGENTE");
        btn03 = new JButton("MODO JOGADOR");
        btn04 = new JButton("LIGA/COPA");
        btn05 = new JButton("OPÇÕES");
        btn06 = new JButton("SAIR");
        
        btn01.setBounds(20, 50, 160, 30);
        btn02.setBounds(180, 50, 160, 30);
        btn03.setBounds(20, 90, 160, 30);
        btn04.setBounds(180, 90, 160, 30);
        btn05.setBounds(20, 130, 160, 30);
        btn06.setBounds(180, 130, 160, 30);
        
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);

        btn01.addActionListener(this);
        btn02.addActionListener(this);
        btn03.addActionListener(this);
        btn04.addActionListener(this);
        btn05.addActionListener(this);
        btn06.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        JButton b = (JButton)o;
        String nome = b.getText();

        System.out.println("O clique do mouse foi acionado por " + nome + " da classe " + o.getClass());
        // Foi extraído o texto do botão e o nome da classe do objeto o

        System.out.println("Clicado.");
    }

}
