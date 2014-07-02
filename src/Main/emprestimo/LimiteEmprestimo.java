package Main.emprestimo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.util.Date;

public class LimiteEmprestimo extends JFrame implements ActionListener{
    JTabbedPane tabbedPane;
    JLabel lCodAssEmp, lCodLivroEmp, lDataRetirada, lCodLivroDev, lDataDevolucao;
    JTextField textCodAssEmp, textCodLivroEmp, textCodLivroDev, textDataDevolucao, textDataRetirada;
    JButton bSalvarEmp, bSalvarDev, bVoltar;
    
    ControleEmprestimo ctrEmprestimo = new ControleEmprestimo();
    
    public void InicializaComp(){
        textCodAssEmp = new JTextField();
        textCodLivroDev = new JTextField();
        textCodLivroEmp = new JTextField();
        textDataDevolucao = new JTextField();
        textDataRetirada = new JTextField();
      
        lCodAssEmp = new JLabel("Codigo do Associado: ");
        lCodLivroDev = new JLabel("Codigo do Livro: ");
        lCodLivroEmp = new JLabel("Codigo do Livro: ");
        lDataDevolucao = new JLabel("Data de Devolução: ");
        lDataRetirada = new JLabel("Data de Retirada: ");
        
        bSalvarDev = new JButton("Salvar");
        bSalvarDev.addActionListener(this);
        bSalvarEmp = new JButton("Salvar");
        bSalvarEmp.addActionListener(this);
        bVoltar = new JButton("Voltar");
        bVoltar.addActionListener(this);
        
        tabbedPane = new JTabbedPane();
        
    }
    
    public void geraInterface(){
        InicializaComp();
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));
        
        JPanel panelEmp = new JPanel(new GridLayout(4,2));
        panelEmp.add(lCodAssEmp);
        panelEmp.add(textCodAssEmp);
        panelEmp.add(lCodLivroEmp);
        panelEmp.add(textCodLivroEmp);
        panelEmp.add(lDataRetirada);
        panelEmp.add(textDataRetirada);
        panelEmp.add(bSalvarEmp);
        
        tabbedPane.addTab("Emprestimo de Livros", panelEmp);
        
        JPanel panelDev = new JPanel(new GridLayout(3,2));

        panelDev.add(lCodLivroDev);
        panelDev.add(textCodLivroDev);
        panelDev.add(lDataDevolucao);
        panelDev.add(textDataDevolucao);
        panelDev.add(bSalvarDev);

        
        tabbedPane.addTab("Devolução de Livros", panelDev);
        
        contentPane.add(bVoltar, BorderLayout.PAGE_START);
        contentPane.add(tabbedPane, BorderLayout.CENTER);
        
        this.setSize(400, 300);
        setLocation(400,250);
	setResizable(false);
        setTitle("Empréstimos e Devoluções");
        setVisible(true);
        
    }
    
    public void cadastrarEmp() {

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date d = new Date();
            d = formato.parse(textDataRetirada.getText());
            long data = d.getTime();
            java.sql.Date dt = new java.sql.Date(data);
            System.out.println(dt);
            ctrEmprestimo.cadastrarEmprestimo(textCodAssEmp.getText(), textCodLivroEmp.getText(), dt);
        } catch (Exception e) {
        }

    }
    
    public void cadastrarDev() {

        try {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date d = new Date();
            d = formato.parse(textDataDevolucao.getText());
            long data = d.getTime();
            java.sql.Date dt = new java.sql.Date(data);
            System.out.println(dt);
            ctrEmprestimo.cadastrarDevolucao(textCodLivroDev.getText(), dt);
        } catch (Exception e) {
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == bSalvarEmp){
            cadastrarEmp();
            textCodAssEmp.setText("");
            textCodLivroEmp.setText("");
            textDataRetirada.setText("");
        } else if (ae.getSource() == bSalvarDev){
            cadastrarDev();
            textCodLivroDev.setText("");
            textDataDevolucao.setText("");
        } else {
            this.dispose();
        }
    }
    
}
