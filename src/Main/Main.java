package Main;

import Main.emprestimo.LimiteEmprestimo;
import Main.exemplar.*;
import Main.publicacao.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main extends JFrame implements ActionListener{
    JButton bIns, bCons, bEmpres;
    JLabel rotulo;
    
    LimitePublicacaoInsere lmtLivroIns = new LimitePublicacaoInsere();
    LimitePublicacaoConsulta lmtLivroCons = new LimitePublicacaoConsulta();
    LimiteEmprestimo lmtEmprestimo = new LimiteEmprestimo();
    
    public Main(){ 
        super("Sistema de Controle de Biblioteca");
        geraMenu();
    }
    
    public void inicializaComp(){
        rotulo = new JLabel("Qual ação deseja executar?");
        
        bIns = new JButton("Inserir Publicação");
        bIns.addActionListener(this);
        
        bCons = new JButton("Consultar Acervo");
        bCons.addActionListener(this);
        
        bEmpres = new JButton("Empréstimos");
        bEmpres.addActionListener(this);
        setLocation(400,250);
	setResizable(false);
	setDefaultLookAndFeelDecorated(true);
    }
    
    public void geraMenu(){
        inicializaComp();
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));
        
        JPanel panelRotulo = new JPanel(new FlowLayout(FlowLayout.CENTER, 10,  10));
        panelRotulo.add(rotulo);
        
        contentPane.add(panelRotulo, BorderLayout.PAGE_START);
        contentPane.add(bIns, BorderLayout.WEST); 
        contentPane.add(bCons, BorderLayout.CENTER);
        contentPane.add(bEmpres, BorderLayout.EAST);
        
        
        pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bIns){
            lmtLivroIns.geraInterfaceCadastrarPublicacao();
        } else if(e.getSource() == bCons){
            lmtLivroCons.geraInterfaceConsultaAcervo();
        } else {
            lmtEmprestimo.geraInterface();
        }
    }
    
    public static void main(String args[]){
        Main princ = new Main();
    }
    
    
}
