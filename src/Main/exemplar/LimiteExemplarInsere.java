package Main.exemplar;

import Main.publicacao.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LimiteExemplarInsere extends JFrame implements ActionListener{
    JTextField txtCod, txtTitulo, txtAutor, txtEditora, txtNroPag;
    JComboBox combCategoria;
    
    JButton bSalvar, bCancelar, bVoltar;
    
    JLabel lCod, lAutor, lEditora, lNroPag, lTitulo, lCategoria, lRotulo;
    
    ControleExemplar ctrLivro = new ControleExemplar();
    String cat = "";
    
    public void InicializaCompReg(){
        txtCod = new JTextField(20);
        txtAutor = new JTextField(20);
        txtTitulo = new JTextField(20);
        txtEditora = new JTextField(20);
        txtNroPag = new JTextField(20);

        combCategoria = new JComboBox();
        combCategoria.addItem("");
        combCategoria.addItem("Romance");
        combCategoria.addItem("Drama");
        combCategoria.addItem("Ficção");
        combCategoria.addItem("Poesia");
        combCategoria.addItem("Infantil");
        combCategoria.addItem("Periódico");
        combCategoria.addItem("Didático");
        combCategoria.addActionListener(this);

        lCod = new JLabel("Código: ");
        lAutor = new JLabel("Autor: ");
        lTitulo = new JLabel("Título: ");
        lCategoria = new JLabel("Categoria: ");
        lNroPag = new JLabel("Número de páginas: ");
        lEditora = new JLabel("Editora: ");
        lRotulo = new JLabel("Cadastro de Publicações: ");

        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(this);
        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bVoltar = new JButton("Voltar");
        bVoltar.addActionListener(this);
        
    }
    
    public void geraInterfaceCadastrarPublicacao() {
        InicializaCompReg();
        
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout(5,5));

        JPanel panelEntrada = new JPanel(new GridLayout(6,2));
        panelEntrada.add(lCod);
        panelEntrada.add(txtCod);
        panelEntrada.add(lTitulo);
        panelEntrada.add(txtTitulo);
        panelEntrada.add(lAutor);
        panelEntrada.add(txtAutor);
        panelEntrada.add(lEditora);
        panelEntrada.add(txtEditora);
        panelEntrada.add(lNroPag);
        panelEntrada.add(txtNroPag);
        panelEntrada.add(lCategoria);
        panelEntrada.add(combCategoria);

        JPanel panelBotao = new JPanel();
        panelBotao.setLayout(new GridLayout(1,3));
        panelBotao.add(bVoltar);
        panelBotao.add(bCancelar);
        panelBotao.add(bSalvar);
        
        contentPane.add(lRotulo, BorderLayout.PAGE_START);
        contentPane.add(panelEntrada, BorderLayout.CENTER);
        contentPane.add(panelBotao, BorderLayout.PAGE_END);
        
        this.setSize(500, 300);
        setTitle("Inserir publicação");
        setLocation(400,250);
	setResizable(false);
        setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        /*Actions listeners da tela de cadastrar publicacção*/
        if (e.getSource() == combCategoria) {
            combCategoria.setSelectedIndex(combCategoria.getSelectedIndex());
            cat = combCategoria.getSelectedItem().toString();

        } else {
            if (e.getSource() == bSalvar) {

                ctrLivro.cadastrarPublicacao(txtCod.getText(), txtTitulo.getText(),
                        txtAutor.getText(), txtEditora.getText(), txtNroPag.getText(),
                        combCategoria.getSelectedItem().toString());
                txtAutor.setText("");
                txtCod.setText("");
                txtTitulo.setText("");
                txtNroPag.setText("");
                txtEditora.setText("");
            } else {
                if (e.getSource() == bCancelar) {
                    txtAutor.setText("");
                    txtCod.setText("");
                    txtTitulo.setText("");
                    txtNroPag.setText("");
                    txtEditora.setText("");
                    combCategoria.setSelectedIndex(0);
                } else {
                    if (e.getSource() == bVoltar) {
                        this.dispose();
                    }
                }
            }
        }
    }
    
}
