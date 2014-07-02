package Main.exemplar;

import Main.publicacao.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LimiteExemplarConsulta extends JFrame implements ActionListener {
    JButton bCons, bVoltar2;
    JComboBox ConsCategoria;
    JTextArea dadosLivro;
    JLabel lCategoria;
    JScrollPane scroll;
    
    ControleExemplar ctrLivro = new ControleExemplar();
    
    public void InicializaCompCons(){  
        String str[] = new String[7];
        dadosLivro = new JTextArea();
        dadosLivro.setEditable(false);
        scroll = new JScrollPane(dadosLivro, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        ConsCategoria = new JComboBox();
        ConsCategoria.removeAllItems();
        str = ctrLivro.PreencherCombo();
        for(int i = 0; i < 7; i++ ){
            System.out.println(str[i]);
            if(str[i] != null)
                ConsCategoria.addItem(str[i]);
        }
        ConsCategoria.updateUI();
        bCons = new JButton("Consultar");
        bCons.addActionListener(this);
        bVoltar2 = new JButton("Voltar");
        bVoltar2.addActionListener(this);
        setTitle("Consultar acervo");
        setLocation(400,250);
	setResizable(false);

    }
    
    public void geraInterfaceConsultaAcervo() {
        InicializaCompCons();
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));

        JPanel panelCons = new JPanel();
        panelCons.setSize(10,30);
        panelCons.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        panelCons.add(new JLabel("Categoria: "));
        panelCons.add(ConsCategoria);
        panelCons.add(bCons);   
        bCons.addActionListener(this); 
        
        contentPane.add(panelCons, BorderLayout.PAGE_START);
        contentPane.add(scroll, BorderLayout.CENTER);
        contentPane.add(bVoltar2, BorderLayout.PAGE_END);
        
        
        this.setSize(500, 400);
        setLocation(400,250);
        setResizable(false);
        setVisible(true);

    }  
    
   
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bCons){
            ConsCategoria.setSelectedIndex(ConsCategoria.getSelectedIndex());
            String cat = (String) ConsCategoria.getSelectedItem();
            dadosLivro.setText(ctrLivro.ConsultaPublicacao(cat));
        } else if (e.getSource() == bVoltar2) {
            this.dispose();

        }
    }
}
