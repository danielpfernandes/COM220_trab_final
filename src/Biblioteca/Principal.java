/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import static java.lang.String.format;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ControlAssociado ctrAsso;
    ControlPublicacao ctrPubli;
    ControlExemplar ctrExem;
    ControlEmprestimo ctrEmpres;
    
    EntAssociado OBJAssociado;
    EntPublicacao OBJPublicacao;
    EntExemplar OBJExemplar;
    EntEmprestimo OBJEmprestimo;

    /**
     * Creates new form NewJFrame
     */
    public Principal() {
        try {
            ctrAsso = new ControlAssociado();
            ctrPubli = new ControlPublicacao();
            ctrExem = new ControlExemplar();
            ctrEmpres = new ControlEmprestimo();
        } catch (Exception ex) {
            System.out.println("Não deu certo o controladores: " + ex);
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelAssociado = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelSatus = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox();
        jButtonAssocSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelPublicacao = new javax.swing.JPanel();
        btnCadPublicacao = new javax.swing.JButton();
        btnConsPublicacao = new javax.swing.JButton();
        btnCadExemplar = new javax.swing.JButton();
        cardPublicacao = new javax.swing.JPanel();
        cardCadPublicacao = new javax.swing.JPanel();
        lblEditora = new javax.swing.JLabel();
        jTextFieldEditora = new javax.swing.JTextField();
        lblISBN = new javax.swing.JLabel();
        jTextFieldISBN = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabelAutor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        btnCadPubl = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cardConsPublicacao = new javax.swing.JPanel();
        jLabelTitleConsPub = new javax.swing.JLabel();
        btnConsultaPubl = new javax.swing.JButton();
        jComboBoxISBNConsultar = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cardConsPublResultado = new javax.swing.JPanel();
        jLabelExemplaresEmprestadoseNaoEmprestados = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cardCadExemplar = new javax.swing.JPanel();
        jLabellISBN1 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        jLabelAutor1 = new javax.swing.JLabel();
        jTextFieldPrecoExemplar = new javax.swing.JTextField();
        CadExemplarYSalvar = new javax.swing.JButton();
        jComboBoxISBNExemplar = new javax.swing.JComboBox();
        jLabelNumeroExemplar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelEmprestimo = new javax.swing.JPanel();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        cardEmprestimo = new javax.swing.JPanel();
        cardCadEmprestimo = new javax.swing.JPanel();
        jLabellEditora2 = new javax.swing.JLabel();
        lblISBN2 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        jLabelAutor2 = new javax.swing.JLabel();
        btnCadEmprestimo = new javax.swing.JButton();
        jComboBoxISBNEmprestimo = new javax.swing.JComboBox();
        jComboBoxNumeroExEmprestimo = new javax.swing.JComboBox();
        jComboBoxAssociadoEmprestimo = new javax.swing.JComboBox();
        jFormattedDataEmprestimo = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        cardCadDevolucao = new javax.swing.JPanel();
        jLabelTitDevolucao = new javax.swing.JLabel();
        btnConsultaDevol = new javax.swing.JButton();
        jComboBoxNumeroExDevolucao = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        cardCadDevResultado = new javax.swing.JPanel();
        jLabelResDevExemplar = new javax.swing.JLabel();
        jLabelDataEmprestimo = new javax.swing.JLabel();
        jLabelDataDevolucao = new javax.swing.JLabel();
        jLabelDiasAtraso = new javax.swing.JLabel();
        jLabelMulta = new javax.swing.JLabel();
        jButtonConfirmDevolucao = new javax.swing.JButton();
        jLabelResDevExemplarNumero = new javax.swing.JLabel();
        jLabelDtEmprestimo = new javax.swing.JLabel();
        jLabelDtDevolucao = new javax.swing.JLabel();
        jLabelTotalAtraso = new javax.swing.JLabel();
        jLabelVlMulta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanelRelatorio = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelRelatorio = new javax.swing.JLabel();
        jButtonRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROLE DE BIBLIOTECA\n");

        jTabbedPanePrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelCodigo.setText("Código");

        jLabelNome.setText("Nome");

        jLabelEndereco.setText("Endereço");

        jLabelEmail.setText("E-mail");

        jLabelSatus.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grad (aluno de graduação)", "Posgrad (aluno de pós-graduação)", "Prof (professor)" }));
        jComboBoxStatus.setToolTipText("");
        jComboBoxStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStatusActionPerformed(evt);
            }
        });

        jButtonAssocSalvar.setText("Salvar");
        jButtonAssocSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssocSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Cadastro de associado");

        javax.swing.GroupLayout jPanelAssociadoLayout = new javax.swing.GroupLayout(jPanelAssociado);
        jPanelAssociado.setLayout(jPanelAssociadoLayout);
        jPanelAssociadoLayout.setHorizontalGroup(
            jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAssociadoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonAssocSalvar))
                            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addGap(36, 36, 36)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 211, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                .addComponent(labelCodigo)
                                .addGap(30, 30, 30)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                .addComponent(jLabelEndereco)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSatus)
                                    .addComponent(jLabelEmail))
                                .addGap(32, 32, 32)
                                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelAssociadoLayout.setVerticalGroup(
            jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addGap(18, 18, 18)
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSatus)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jButtonAssocSalvar)
                .addContainerGap())
        );

        jTabbedPanePrincipal.addTab("Associado", jPanelAssociado);

        btnCadPublicacao.setText("Cadastrar Publicação");
        btnCadPublicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPublicacaoActionPerformed(evt);
            }
        });

        btnConsPublicacao.setText("Consultar Publicação");
        btnConsPublicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsPublicacaoActionPerformed(evt);
            }
        });

        btnCadExemplar.setText("Cadastrar exemplares");
        btnCadExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadExemplarActionPerformed(evt);
            }
        });

        cardPublicacao.setLayout(new java.awt.CardLayout(2, 2));

        cardCadPublicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblEditora.setText("Editora");

        lblISBN.setText("ISBN");

        lblTitulo.setText("Título");

        jLabelAutor.setText("Autor");

        btnCadPubl.setText("Cadastrar");
        btnCadPubl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPublActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Cadastro de Publicação");

        javax.swing.GroupLayout cardCadPublicacaoLayout = new javax.swing.GroupLayout(cardCadPublicacao);
        cardCadPublicacao.setLayout(cardCadPublicacaoLayout);
        cardCadPublicacaoLayout.setHorizontalGroup(
            cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadPublicacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadPubl))
                    .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                .addComponent(lblISBN)
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(26, 26, 26)
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                    .addComponent(jLabelAutor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                    .addComponent(lblEditora)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 236, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardCadPublicacaoLayout.setVerticalGroup(
            cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor))
                .addGap(18, 18, 18)
                .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEditora)
                    .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btnCadPubl)
                .addContainerGap())
        );

        cardPublicacao.add(cardCadPublicacao, "FORM_PANEL");

        cardConsPublicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitleConsPub.setText("Escolha a publicação:");

        btnConsultaPubl.setText("Consultar");
        btnConsultaPubl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPublActionPerformed(evt);
            }
        });

        jComboBoxISBNConsultar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Consulta de Publicação");

        javax.swing.GroupLayout cardConsPublicacaoLayout = new javax.swing.GroupLayout(cardConsPublicacao);
        cardConsPublicacao.setLayout(cardConsPublicacaoLayout);
        cardConsPublicacaoLayout.setHorizontalGroup(
            cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardConsPublicacaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultaPubl))
                    .addComponent(jComboBoxISBNConsultar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardConsPublicacaoLayout.createSequentialGroup()
                        .addGroup(cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabelTitleConsPub))
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardConsPublicacaoLayout.setVerticalGroup(
            cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitleConsPub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxISBNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnConsultaPubl)
                .addContainerGap())
        );

        cardPublicacao.add(cardConsPublicacao, "SHOW_PANEL");

        cardConsPublResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelExemplaresEmprestadoseNaoEmprestados.setText("Não foi encontrado nenhum exemplar");
        jLabelExemplaresEmprestadoseNaoEmprestados.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Resultado da Consulta de Publicação");

        javax.swing.GroupLayout cardConsPublResultadoLayout = new javax.swing.GroupLayout(cardConsPublResultado);
        cardConsPublResultado.setLayout(cardConsPublResultadoLayout);
        cardConsPublResultadoLayout.setHorizontalGroup(
            cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsPublResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardConsPublResultadoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabelExemplaresEmprestadoseNaoEmprestados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardConsPublResultadoLayout.setVerticalGroup(
            cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardConsPublResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabelExemplaresEmprestadoseNaoEmprestados, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardPublicacao.add(cardConsPublResultado, "SHOW_PANEL");

        cardCadExemplar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabellISBN1.setText("ISBN");

        lblTitulo1.setText("Número");

        jLabelAutor1.setText("Preço");

        CadExemplarYSalvar.setText("Cadastrar");
        CadExemplarYSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadExemplarYSalvarActionPerformed(evt);
            }
        });

        jComboBoxISBNExemplar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxISBNExemplarActionPerformed(evt);
            }
        });

        jLabelNumeroExemplar.setText("Número da publicação");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Cadastro de Exemplar");

        javax.swing.GroupLayout cardCadExemplarLayout = new javax.swing.GroupLayout(cardCadExemplar);
        cardCadExemplar.setLayout(cardCadExemplarLayout);
        cardCadExemplarLayout.setHorizontalGroup(
            cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadExemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadExemplarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CadExemplarYSalvar))
                    .addGroup(cardCadExemplarLayout.createSequentialGroup()
                        .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabellISBN1)
                            .addGroup(cardCadExemplarLayout.createSequentialGroup()
                                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelAutor1))
                                .addGap(15, 15, 15)
                                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldPrecoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelNumeroExemplar)
                                    .addComponent(jComboBoxISBNExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 231, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardCadExemplarLayout.setVerticalGroup(
            cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadExemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellISBN1)
                    .addComponent(jComboBoxISBNExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroExemplar)
                    .addComponent(lblTitulo1))
                .addGap(18, 18, 18)
                .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor1)
                    .addComponent(jTextFieldPrecoExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(CadExemplarYSalvar)
                .addContainerGap())
        );

        cardPublicacao.add(cardCadExemplar, "FORM_PANEL");

        javax.swing.GroupLayout jPanelPublicacaoLayout = new javax.swing.GroupLayout(jPanelPublicacao);
        jPanelPublicacao.setLayout(jPanelPublicacaoLayout);
        jPanelPublicacaoLayout.setHorizontalGroup(
            jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                        .addComponent(btnCadPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPublicacaoLayout.setVerticalGroup(
            jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadPublicacao)
                    .addComponent(btnConsPublicacao)
                    .addComponent(btnCadExemplar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPanePrincipal.addTab("Publicações", jPanelPublicacao);

        btnEmprestimo.setText("Realizar empréstimo");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        btnDevolucao.setText("Realizar devolução");
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });

        cardEmprestimo.setLayout(new java.awt.CardLayout(2, 2));

        cardCadEmprestimo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabellEditora2.setText("Associado");

        lblISBN2.setText("ISBN");

        lblTitulo2.setText("Número");

        jLabelAutor2.setText("Data");

        btnCadEmprestimo.setText("Cadastrar");
        btnCadEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadEmprestimoActionPerformed(evt);
            }
        });

        jComboBoxISBNEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxISBNEmprestimoActionPerformed(evt);
            }
        });

        jComboBoxAssociadoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(ctrAsso.ListaCodeAssociado()));

        try {
            jFormattedDataEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Empréstimo de exemplar");

        javax.swing.GroupLayout cardCadEmprestimoLayout = new javax.swing.GroupLayout(cardCadEmprestimo);
        cardCadEmprestimo.setLayout(cardCadEmprestimoLayout);
        cardCadEmprestimoLayout.setHorizontalGroup(
            cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAutor2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabellEditora2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblISBN2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(27, 27, 27)
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBoxNumeroExEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxISBNEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAssociadoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadEmprestimoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadEmprestimo)
                .addContainerGap())
        );
        cardCadEmprestimoLayout.setVerticalGroup(
            cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblISBN2)
                    .addComponent(jComboBoxISBNEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo2)
                    .addComponent(jComboBoxNumeroExEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAutor2)
                    .addComponent(jFormattedDataEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabellEditora2)
                    .addComponent(jComboBoxAssociadoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnCadEmprestimo)
                .addContainerGap())
        );

        cardEmprestimo.add(cardCadEmprestimo, "FORM_PANEL");

        cardCadDevolucao.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitDevolucao.setText("Exemplar a ser devolvido:");

        btnConsultaDevol.setText("Consultar");
        btnConsultaDevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDevolActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Devolução de Exemplar");

        javax.swing.GroupLayout cardCadDevolucaoLayout = new javax.swing.GroupLayout(cardCadDevolucao);
        cardCadDevolucao.setLayout(cardCadDevolucaoLayout);
        cardCadDevolucaoLayout.setHorizontalGroup(
            cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadDevolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadDevolucaoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnConsultaDevol))
                    .addGroup(cardCadDevolucaoLayout.createSequentialGroup()
                        .addGroup(cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabelTitDevolucao))
                        .addGap(0, 289, Short.MAX_VALUE))
                    .addComponent(jComboBoxNumeroExDevolucao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardCadDevolucaoLayout.setVerticalGroup(
            cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadDevolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabelTitDevolucao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNumeroExDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnConsultaDevol)
                .addContainerGap())
        );

        cardEmprestimo.add(cardCadDevolucao, "SHOW_PANEL");

        cardCadDevResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelResDevExemplar.setText("Devolução do Exemplar nº: ");

        jLabelDataEmprestimo.setText("Data de empréstimo:");

        jLabelDataDevolucao.setText("Data de devolução:");

        jLabelDiasAtraso.setForeground(new java.awt.Color(204, 0, 0));
        jLabelDiasAtraso.setText("Dias de atraso:");

        jLabelMulta.setForeground(new java.awt.Color(204, 0, 0));
        jLabelMulta.setText("Multa:");

        jButtonConfirmDevolucao.setText("Confirmar devolução");
        jButtonConfirmDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmDevolucaoActionPerformed(evt);
            }
        });

        jLabelResDevExemplarNumero.setForeground(new java.awt.Color(0, 153, 0));
        jLabelResDevExemplarNumero.setText("1234");

        jLabelDtEmprestimo.setText("01/01/2000");

        jLabelDtDevolucao.setText("01/01/2000");

        jLabelTotalAtraso.setText("1 dias");

        jLabelVlMulta.setText("R$ 10,00");

        jLabel1.setText("Associado:");

        jLabel2.setText("Nome associado");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setText("Confirmação de Devolução");

        javax.swing.GroupLayout cardCadDevResultadoLayout = new javax.swing.GroupLayout(cardCadDevResultado);
        cardCadDevResultado.setLayout(cardCadDevResultadoLayout);
        cardCadDevResultadoLayout.setHorizontalGroup(
            cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadDevResultadoLayout.createSequentialGroup()
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConfirmDevolucao))
                    .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabelResDevExemplar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelResDevExemplarNumero))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabelDataEmprestimo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDtEmprestimo))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabelDataDevolucao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelDtDevolucao))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabelDiasAtraso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelTotalAtraso))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 266, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                .addComponent(jLabelMulta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelVlMulta)))))
                .addContainerGap())
        );
        cardCadDevResultadoLayout.setVerticalGroup(
            cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResDevExemplar)
                    .addComponent(jLabelResDevExemplarNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDtEmprestimo)
                    .addComponent(jLabelDataEmprestimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataDevolucao)
                    .addComponent(jLabelDtDevolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDiasAtraso)
                    .addComponent(jLabelTotalAtraso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMulta)
                    .addComponent(jLabelVlMulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jButtonConfirmDevolucao)
                .addContainerGap())
        );

        cardEmprestimo.add(cardCadDevResultado, "SHOW_PANEL");

        javax.swing.GroupLayout jPanelEmprestimoLayout = new javax.swing.GroupLayout(jPanelEmprestimo);
        jPanelEmprestimo.setLayout(jPanelEmprestimoLayout);
        jPanelEmprestimoLayout.setHorizontalGroup(
            jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cardEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelEmprestimoLayout.setVerticalGroup(
            jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmprestimo)
                    .addComponent(btnDevolucao))
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(cardEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPanePrincipal.addTab("Empréstimos", jPanelEmprestimo);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Associados em atraso");

        jLabelRelatorio.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButtonRelatorio.setText("Gerar Relatório");
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRelatorioLayout = new javax.swing.GroupLayout(jPanelRelatorio);
        jPanelRelatorio.setLayout(jPanelRelatorioLayout);
        jPanelRelatorioLayout.setHorizontalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRelatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                        .addGroup(jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jButtonRelatorio))
                        .addGap(0, 330, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRelatorioLayout.setVerticalGroup(
            jPanelRelatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRelatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPanePrincipal.addTab("Relatório", jPanelRelatorio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAssocSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssocSalvarActionPerformed
        //Salvando Associado
        OBJAssociado = new EntAssociado(Integer.parseInt(jTextFieldCodigo.getText()), jTextFieldNome.getText(), jTextFieldEndereco.getText(), (String) jComboBoxStatus.getSelectedItem(), jTextFieldEmail.getText());
        ctrAsso.CadastrarAssociado(OBJAssociado.getCodigo(), OBJAssociado.getNome(), OBJAssociado.getEndereco(), OBJAssociado.getStatus(), OBJAssociado.getEmail());
        //Listando para controle meu :)
        System.out.println(ctrAsso.ListaAssociados());
        //Limpando campos 
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldEndereco.setText("");
        jComboBoxStatus.setSelectedIndex(0);
        jTextFieldEmail.setText("");
        //Confirmação
        JOptionPane.showMessageDialog(null, "Associado cadastrado com sucesso!");
        //atualização
        jComboBoxAssociadoEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(ctrAsso.ListaCodeAssociado()));
        jComboBoxAssociadoEmprestimo.setToolTipText("");
        jComboBoxAssociadoEmprestimo.setSelectedIndex(0);
    }//GEN-LAST:event_jButtonAssocSalvarActionPerformed

    private void btnCadPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPublicacaoActionPerformed
        cardCadExemplar.setVisible(false);
        cardConsPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardCadPublicacao.setVisible(true);
        //cardPublicacao.setVisible(p1.isVisible());        
    }//GEN-LAST:event_btnCadPublicacaoActionPerformed

    private void btnConsPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsPublicacaoActionPerformed
        cardCadExemplar.setVisible(false);
        cardCadPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardConsPublicacao.setVisible(true);
    }//GEN-LAST:event_btnConsPublicacaoActionPerformed

    private void btnCadExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadExemplarActionPerformed
        cardConsPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardCadPublicacao.setVisible(false);
        cardCadExemplar.setVisible(true);
    }//GEN-LAST:event_btnCadExemplarActionPerformed

    private void btnConsultaPublActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaPublActionPerformed
        String isbn = (String) jComboBoxISBNConsultar.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));
        int isbnexem = Integer.parseInt(isbn);
        jLabelExemplaresEmprestadoseNaoEmprestados.setText(ctrExem.ListaExemplarsISBNEmprestadosENaoEmprestados(isbnexem));

        cardCadExemplar.setVisible(false);
        cardConsPublicacao.setVisible(false);        
        cardCadPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(true);
    }//GEN-LAST:event_btnConsultaPublActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        cardCadDevResultado.setVisible(false);
        cardCadDevolucao.setVisible(false);
        cardCadEmprestimo.setVisible(true);
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        jComboBoxNumeroExDevolucao.setModel(new javax.swing.DefaultComboBoxModel(ctrEmpres.ListaExemEmprestados()));
        cardCadDevResultado.setVisible(false);
        cardCadEmprestimo.setVisible(false);
        cardCadDevolucao.setVisible(true);
       
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnConsultaDevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaDevolActionPerformed
        //Vou devolver aqui
        String valoresanteriores = (String) jComboBoxNumeroExDevolucao.getSelectedItem();
        
        int point2 = valoresanteriores.indexOf("I");
        int point3 = valoresanteriores.indexOf("N:");
        point3 += 3;
        
        String sub1 = valoresanteriores.substring(19, point2-1), sub2 = valoresanteriores.substring(point3);
        
        
        int numeroexem = Integer.parseInt(sub1);
        int isbnexem = Integer.parseInt(sub2);
        
        ctrEmpres.getInfo(numeroexem, isbnexem);
        Date dataatual = new Date();  
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
        formatador.format( dataatual );
        
        float multa = ctrEmpres.calculaMulta(numeroexem, isbnexem);
        int dias = (int)(multa);
        jLabel2.setText(ctrAsso.nomedoassociadoqueemprestou(ctrEmpres.associadoqueemprestou));
        jLabelResDevExemplarNumero.setText(""+numeroexem);
        jLabelDtDevolucao.setText(""+formatador.format( dataatual ));
        jLabelDtEmprestimo.setText(""+formatador.format( ctrEmpres.datadoemprestimo));
        jLabelTotalAtraso.setText(""+dias);
        jLabelVlMulta.setText(""+multa);
        
        
        cardCadDevolucao.setVisible(false);
        cardCadEmprestimo.setVisible(false);
        cardCadDevResultado.setVisible(true);
    }//GEN-LAST:event_btnConsultaDevolActionPerformed

    private void jComboBoxISBNExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxISBNExemplarActionPerformed
        String isbn = (String) jComboBoxISBNExemplar.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));

        int isbnexem = Integer.parseInt(isbn);
        jLabelNumeroExemplar.setText(""+ctrExem.UltimoExemplars(isbnexem));
    }//GEN-LAST:event_jComboBoxISBNExemplarActionPerformed

    private void jComboBoxISBNEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxISBNEmprestimoActionPerformed
        String isbn = (String) jComboBoxISBNEmprestimo.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));

        int isbnexem = Integer.parseInt(isbn);
        jComboBoxNumeroExEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(ctrExem.ListaExemplaresporISBN(isbnexem)));
        jComboBoxNumeroExEmprestimo.setToolTipText("");
    }//GEN-LAST:event_jComboBoxISBNEmprestimoActionPerformed

    private void CadExemplarYSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadExemplarYSalvarActionPerformed
        //Salvando Exemplar
        String isbn = (String) jComboBoxISBNExemplar.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));

        int isbnexem = Integer.parseInt(isbn);
        OBJExemplar = new EntExemplar(Integer.parseInt(jLabelNumeroExemplar.getText()), isbnexem, Float.parseFloat(jTextFieldPrecoExemplar.getText()), false);
        ctrExem.CadastrarExemplar(OBJExemplar.getNumero(), OBJExemplar.getISBN(), OBJExemplar.getPreco(), false);
        //Listando para controle meu :)
        System.out.println(ctrExem.ListaExemplars());
        //Limpando campos 
        jComboBoxISBNExemplar.setSelectedIndex(0);
        jTextFieldPrecoExemplar.setText("");
        //Validação
        JOptionPane.showMessageDialog(null, "Exemplar cadastrado com sucesso!");
    }//GEN-LAST:event_CadExemplarYSalvarActionPerformed

    private void btnCadEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadEmprestimoActionPerformed
        //Salvando Emprestimo
        String isbn = (String) jComboBoxISBNEmprestimo.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));
        int isbnexem = Integer.parseInt(isbn);
        
        isbn = (String) jComboBoxAssociadoEmprestimo.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));
        
        int isAsso = Integer.parseInt(isbn);
        
        int Exemp = Integer.parseInt((String) jComboBoxNumeroExEmprestimo.getSelectedItem());
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        
        Date dateemprestimo = null;//new Date(jFormattedDataEmprestimo.getText());
        
        try {
            dateemprestimo = new java.sql.Date(format.parse(jFormattedDataEmprestimo.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        OBJEmprestimo = new EntEmprestimo(Exemp, isbnexem, dateemprestimo, isAsso);
        ctrEmpres.CadastrarEmprestimo(OBJEmprestimo.getNumexemplar(), OBJEmprestimo.getISBN(), OBJEmprestimo.getDataemprestimo(), OBJEmprestimo.getCodassociado());
        
        //Listando para controle meu :)
        System.out.println(ctrEmpres.ListaEmprestimos());
        //Limpando campos 
        jComboBoxISBNEmprestimo.setSelectedIndex(0);
        jComboBoxAssociadoEmprestimo.setSelectedIndex(0);
        jComboBoxNumeroExEmprestimo.setSelectedIndex(0);
        jFormattedDataEmprestimo.setText("");

        //alterar Exemplar
        ctrExem.AlterarExemplar(Exemp, isbnexem, true);
        System.out.println(ctrExem.ListaExemplars());
        //Validação
        JOptionPane.showMessageDialog(null, "Emprestimo realizado com sucesso!");
    }//GEN-LAST:event_btnCadEmprestimoActionPerformed

    private void btnCadPublActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadPublActionPerformed
        //Salvando Publicacao
        OBJPublicacao = new EntPublicacao(Integer.parseInt(jTextFieldISBN.getText()), jTextFieldTitulo.getText(), jTextFieldAutor.getText(), jTextFieldEditora.getText());
        ctrPubli.CadastrarPublicacao(OBJPublicacao.getISBN(), OBJPublicacao.getTitulo(), OBJPublicacao.getAutor(), OBJPublicacao.getEditora());
        //Listando para controle meu :)
        System.out.println(ctrPubli.ListaPublicacaos());
        //Limpando campos 
        jTextFieldISBN.setText("");
        jTextFieldTitulo.setText("");
        jTextFieldAutor.setText("");
        jTextFieldEditora.setText("");
        //Validação
        JOptionPane.showMessageDialog(null, "Publicação cadastrada com sucesso!");

        //Atualizar os Exemplares em potencial
        jComboBoxISBNConsultar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNConsultar.setToolTipText("");
        jComboBoxISBNExemplar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNExemplar.setToolTipText("");
        jComboBoxISBNEmprestimo.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNEmprestimo.setToolTipText("");
    }//GEN-LAST:event_btnCadPublActionPerformed

    private void jComboBoxStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxStatusActionPerformed

    private void jButtonConfirmDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmDevolucaoActionPerformed
       String valoresanteriores = (String) jComboBoxNumeroExDevolucao.getSelectedItem();
        
        int point2 = valoresanteriores.indexOf("I");
        int point3 = valoresanteriores.indexOf("N:");
        point3 += 3;
        
        String sub1 = valoresanteriores.substring(19, point2-1), sub2 = valoresanteriores.substring(point3);
        
        
        int numeroexem = Integer.parseInt(sub1);
        int isbnexem = Integer.parseInt(sub2);
        //alterar Exemplar
        ctrExem.AlterarExemplar(numeroexem, isbnexem, false);
        ctrEmpres.DeletarEmprestimo(numeroexem, isbnexem);
        System.out.println(ctrExem.ListaExemplars());
        //Validação
        JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!");
    }//GEN-LAST:event_jButtonConfirmDevolucaoActionPerformed

    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed
        String rel = "<html>"+ctrEmpres.RelatorioAssociadosAtrasado()+"</html>";
        jLabelRelatorio.setText(rel);
    }//GEN-LAST:event_jButtonRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadExemplarYSalvar;
    private javax.swing.JButton btnCadEmprestimo;
    private javax.swing.JButton btnCadExemplar;
    private javax.swing.JButton btnCadPubl;
    private javax.swing.JButton btnCadPublicacao;
    private javax.swing.JButton btnConsPublicacao;
    private javax.swing.JButton btnConsultaDevol;
    private javax.swing.JButton btnConsultaPubl;
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JPanel cardCadDevResultado;
    private javax.swing.JPanel cardCadDevolucao;
    private javax.swing.JPanel cardCadEmprestimo;
    private javax.swing.JPanel cardCadExemplar;
    private javax.swing.JPanel cardCadPublicacao;
    private javax.swing.JPanel cardConsPublResultado;
    private javax.swing.JPanel cardConsPublicacao;
    private javax.swing.JPanel cardEmprestimo;
    private javax.swing.JPanel cardPublicacao;
    private javax.swing.JButton jButtonAssocSalvar;
    private javax.swing.JButton jButtonConfirmDevolucao;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JComboBox jComboBoxAssociadoEmprestimo;
    private javax.swing.JComboBox jComboBoxISBNConsultar;
    private javax.swing.JComboBox jComboBoxISBNEmprestimo;
    private javax.swing.JComboBox jComboBoxISBNExemplar;
    private javax.swing.JComboBox jComboBoxNumeroExDevolucao;
    private javax.swing.JComboBox jComboBoxNumeroExEmprestimo;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JFormattedTextField jFormattedDataEmprestimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelAutor1;
    private javax.swing.JLabel jLabelAutor2;
    private javax.swing.JLabel jLabelDataDevolucao;
    private javax.swing.JLabel jLabelDataEmprestimo;
    private javax.swing.JLabel jLabelDiasAtraso;
    private javax.swing.JLabel jLabelDtDevolucao;
    private javax.swing.JLabel jLabelDtEmprestimo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelExemplaresEmprestadoseNaoEmprestados;
    private javax.swing.JLabel jLabelMulta;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumeroExemplar;
    private javax.swing.JLabel jLabelRelatorio;
    private javax.swing.JLabel jLabelResDevExemplar;
    private javax.swing.JLabel jLabelResDevExemplarNumero;
    private javax.swing.JLabel jLabelSatus;
    private javax.swing.JLabel jLabelTitDevolucao;
    private javax.swing.JLabel jLabelTitleConsPub;
    private javax.swing.JLabel jLabelTotalAtraso;
    private javax.swing.JLabel jLabelVlMulta;
    private javax.swing.JLabel jLabellEditora2;
    private javax.swing.JLabel jLabellISBN1;
    private javax.swing.JPanel jPanelAssociado;
    private javax.swing.JPanel jPanelEmprestimo;
    private javax.swing.JPanel jPanelPublicacao;
    private javax.swing.JPanel jPanelRelatorio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPrecoExemplar;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblISBN2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    // End of variables declaration//GEN-END:variables
}
