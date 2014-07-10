import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    ControlAssociado ctrAsso;
    ControlPublicacao ctrPubli;
    ControlExemplar ctrExem;

    EntAssociado OBJAssociado;
    EntPublicacao OBJPublicacao;
    EntExemplar OBJExemplar;

    public Principal() {
        try {
            ctrAsso = new ControlAssociado();
            ctrPubli = new ControlPublicacao();
            ctrExem = new ControlExemplar();
        } catch (Exception ex) {

            System.out.println("Não deu certo o controladores: " + ex);
        }

        initComponents();
    }

    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
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
        jComboBoxISBNConsultar = new javax.swing.JComboBox();
        jButtonAssocSalvar = new javax.swing.JButton();
        jPanelPublicacao = new javax.swing.JPanel();
        btnCadPublicacao = new javax.swing.JButton();
        btnConsPublicacao = new javax.swing.JButton();
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
        cardConsPublicacao = new javax.swing.JPanel();
        jLabelTitleConsPub = new javax.swing.JLabel();
        jLabelExemplaresEmprestadoseNaoEmprestados = new javax.swing.JLabel();
        fieldConsultaPubl = new javax.swing.JTextField();
        btnConsultaPubl = new javax.swing.JButton();
        cardConsPublResultado = new javax.swing.JPanel();
        lblTituloResultado = new javax.swing.JLabel();
        jLabelEmprestados = new javax.swing.JLabel();
        jLabelNaoEmprestados = new javax.swing.JLabel();
        jScrollPaneEmprestados = new javax.swing.JScrollPane();
        jListEmprestados = new javax.swing.JList();
        jScrollPaneNaoEmprestados = new javax.swing.JScrollPane();
        jListNaoEmprestados = new javax.swing.JList();
        cardCadExemplar = new javax.swing.JPanel();
        jLabelNumExemplar = new javax.swing.JLabel();
        jTextFieldNumExemplar = new javax.swing.JTextField();
        jLabellISBNExemplar = new javax.swing.JLabel();
        jComboBoxISBNExemplar = new javax.swing.JComboBox();
        lblPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelAutor1 = new javax.swing.JLabel();
        jTextFieldAutor1 = new javax.swing.JTextField();
        btnCadExemplarYSalvar = new javax.swing.JButton();
        btnCadExemplar = new javax.swing.JButton();
        jPanelEmprestimo = new javax.swing.JPanel();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        cardEmprestimo = new javax.swing.JPanel();
        cardCadEmprestimo = new javax.swing.JPanel();
        jLabellEditora2 = new javax.swing.JLabel();
        jTextFieldEdit2 = new javax.swing.JTextField();
        lblISBN2 = new javax.swing.JLabel();
        jTextFieldISBN2 = new javax.swing.JTextField();
        lblTitulo2 = new javax.swing.JLabel();
        jTextFieldTit2 = new javax.swing.JTextField();
        jLabelAutor2 = new javax.swing.JLabel();
        jTextFieldAutor2 = new javax.swing.JTextField();
        btnCadPubl2 = new javax.swing.JButton();
        cardCadDevolucao = new javax.swing.JPanel();
        jLabelTitDevolucao = new javax.swing.JLabel();
        fieldConsultaDevol = new javax.swing.JTextField();
        btnConsultaDevol = new javax.swing.JButton();
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
        btnRelatorio = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROLE DE BIBLIOTECA\n");
        jTabbedPanePrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labelCodigo.setText("Código");
        jLabelNome.setText("Nome");
        jLabelEndereco.setText("Endereço");
        jLabelEmail.setText("email");
        jLabelSatus.setText("Status");
        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Grad", "Posgrad", "Prof"}));
        jComboBoxStatus.setToolTipText("");
        jButtonAssocSalvar.setText("Salvar");
        jButtonAssocSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssocSalvarActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanelAssociadoLayout = new javax.swing.GroupLayout(jPanelAssociado);
        jPanelAssociado.setLayout(jPanelAssociadoLayout);
        jPanelAssociadoLayout.setHorizontalGroup(
                jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                        .addComponent(jLabelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                        .addComponent(labelCodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabelSatus)
                                                .addComponent(jLabelEmail))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                                                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonAssocSalvar)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAssociadoLayout.setVerticalGroup(
                jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelAssociadoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelCodigo)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNome)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelEndereco)
                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelEmail)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAssociadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelSatus)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonAssocSalvar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        cardPublicacao.setLayout(new java.awt.CardLayout(2, 2));
        cardCadPublicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblEditora.setText("Editora");
        lblISBN.setText("ISBN");
        lblTitulo.setText("Título");
        jLabelAutor.setText("Autor");
        btnCadPubl.setText("Cadastrar");
        btnCadPubl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadPubActionPerformed(evt);
            }

        });
        javax.swing.GroupLayout cardCadPublicacaoLayout = new javax.swing.GroupLayout(cardCadPublicacao);
        cardCadPublicacao.setLayout(cardCadPublicacaoLayout);
        cardCadPublicacaoLayout.setHorizontalGroup(
                cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                        .addComponent(jLabelAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                        .addComponent(lblTitulo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                        .addComponent(lblISBN)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                                        .addComponent(lblEditora)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadPublicacaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadPubl)
                        .addContainerGap())
        );
        cardCadPublicacaoLayout.setVerticalGroup(
                cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadPublicacaoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblISBN)
                                .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTitulo)
                                .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelAutor)
                                .addComponent(jTextFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblEditora)
                                .addComponent(jTextFieldEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadPubl)
                        .addContainerGap(50, Short.MAX_VALUE))
        );
        cardPublicacao.add(cardCadPublicacao, "FORM_PANEL");
        cardConsPublicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTitleConsPub.setText("Escolha a publicação:");
        btnConsultaPubl.setText("Consultar");
        jComboBoxISBNConsultar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNConsultar.setToolTipText("");

        btnConsultaPubl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaPublActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout cardConsPublicacaoLayout = new javax.swing.GroupLayout(cardConsPublicacao);
        cardConsPublicacao.setLayout(cardConsPublicacaoLayout);
        cardConsPublicacaoLayout.setHorizontalGroup(
                cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardConsPublicacaoLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addGroup(cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelTitleConsPub, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBoxISBNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnConsultaPubl)))
                        .addGap(21, 21, 21))
        );
        cardConsPublicacaoLayout.setVerticalGroup(
                cardConsPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardConsPublicacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitleConsPub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxISBNConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultaPubl)
                        .addContainerGap(127, Short.MAX_VALUE))
        );
        cardPublicacao.add(cardConsPublicacao, "SHOW_PANEL");
        cardConsPublResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTituloResultado.setText("Resultado da Pesquisa:");
        jLabelExemplaresEmprestadoseNaoEmprestados.setText("Não foi encontrado nenhum exemplar!");
        javax.swing.GroupLayout cardConsPublResultadoLayout = new javax.swing.GroupLayout(cardConsPublResultado);
        cardConsPublResultado.setLayout(cardConsPublResultadoLayout);
        cardConsPublResultadoLayout.setHorizontalGroup(
                cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardConsPublResultadoLayout.createSequentialGroup()
                        .addGroup(cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTituloResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)                   
                                .addComponent(jLabelExemplaresEmprestadoseNaoEmprestados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
        );
        cardConsPublResultadoLayout.setVerticalGroup(
                cardConsPublResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardConsPublResultadoLayout.createSequentialGroup()
                        .addContainerGap(5, Short.MAX_VALUE)
                        .addComponent(lblTituloResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelExemplaresEmprestadoseNaoEmprestados)
                        .addGap(3, 3, 3)
                        .addContainerGap())
        );
        cardPublicacao.add(cardConsPublResultado, "SHOW_PANEL");
        cardCadExemplar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelNumExemplar.setText("Número");
        jLabellISBNExemplar.setText("ISBN");
        jComboBoxISBNExemplar.setModel(new javax.swing.DefaultComboBoxModel(ctrPubli.ListaISBNPublicacaos()));
        jComboBoxISBNExemplar.setToolTipText("");
        lblPreco.setText("Preco");
        btnCadExemplarYSalvar.setText("Cadastrar");
        btnCadExemplarYSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadExemplarYSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardCadExemplarLayout = new javax.swing.GroupLayout(cardCadExemplar);
        cardCadExemplar.setLayout(cardCadExemplarLayout);
        cardCadExemplarLayout.setHorizontalGroup(
                cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadExemplarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCadExemplarYSalvar)
                                .addGroup(cardCadExemplarLayout.createSequentialGroup()
                                        .addComponent(jLabellISBNExemplar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxISBNExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadExemplarLayout.createSequentialGroup()
                                        .addComponent(lblPreco)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadExemplarLayout.createSequentialGroup()
                                        .addComponent(jLabelNumExemplar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldNumExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(19, Short.MAX_VALUE))
        );
        cardCadExemplarLayout.setVerticalGroup(
                cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadExemplarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabellISBNExemplar)
                                .addComponent(jComboBoxISBNExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNumExemplar)
                                .addComponent(jTextFieldNumExemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadExemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPreco)
                                .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadExemplarYSalvar)
                        .addContainerGap(50, Short.MAX_VALUE))
        );
        cardPublicacao.add(cardCadExemplar, "FORM_PANEL");
        btnCadExemplar.setText("Cadastrar exemplares");
        btnCadExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadExemplarActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanelPublicacaoLayout = new javax.swing.GroupLayout(jPanelPublicacao);
        jPanelPublicacao.setLayout(jPanelPublicacaoLayout);
        jPanelPublicacaoLayout.setHorizontalGroup(
                jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                        .addGroup(jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(cardPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnCadPublicacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnCadExemplar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                                .addComponent(btnConsPublicacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPublicacaoLayout.setVerticalGroup(
                jPanelPublicacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPublicacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadPublicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsPublicacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadExemplar)
                        .addGap(20, 20, 20)
                        .addComponent(cardPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
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
        jLabellEditora2.setText("Editora");
        lblISBN2.setText("ISBN");
        lblTitulo2.setText("Título");
        jLabelAutor2.setText("Autor");
        btnCadPubl2.setText("Cadastrar");
        javax.swing.GroupLayout cardCadEmprestimoLayout = new javax.swing.GroupLayout(cardCadEmprestimo);
        cardCadEmprestimo.setLayout(cardCadEmprestimoLayout);
        cardCadEmprestimoLayout.setHorizontalGroup(
                cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                                        .addComponent(jLabelAutor2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                                        .addComponent(lblTitulo2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTit2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                                        .addComponent(lblISBN2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldISBN2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                                        .addComponent(jLabellEditora2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadEmprestimoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadPubl2)
                        .addContainerGap())
        );
        cardCadEmprestimoLayout.setVerticalGroup(
                cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadEmprestimoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblISBN2)
                                .addComponent(jTextFieldISBN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTitulo2)
                                .addComponent(jTextFieldTit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelAutor2)
                                .addComponent(jTextFieldAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabellEditora2)
                                .addComponent(jTextFieldEdit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadPubl2)
                        .addContainerGap(50, Short.MAX_VALUE))
        );
        cardEmprestimo.add(cardCadEmprestimo, "FORM_PANEL");
        cardCadDevolucao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelTitDevolucao.setText("Insira o nº do exemplar devolvido:");
        btnConsultaDevol.setText("Consultar");
        btnConsultaDevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaDevolActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout cardCadDevolucaoLayout = new javax.swing.GroupLayout(cardCadDevolucao);
        cardCadDevolucao.setLayout(cardCadDevolucaoLayout);
        cardCadDevolucaoLayout.setHorizontalGroup(
                cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadDevolucaoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTitDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardCadDevolucaoLayout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addComponent(fieldConsultaDevol, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultaDevol)
                        .addGap(43, 43, 43))
        );
        cardCadDevolucaoLayout.setVerticalGroup(
                cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadDevolucaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTitDevolucao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadDevolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldConsultaDevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnConsultaDevol))
                        .addContainerGap(158, Short.MAX_VALUE))
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
        jLabelResDevExemplarNumero.setForeground(new java.awt.Color(0, 153, 0));
        jLabelResDevExemplarNumero.setText("1234");
        jLabelDtEmprestimo.setText("01/01/2000");
        jLabelDtDevolucao.setText("01/01/2000");
        jLabelTotalAtraso.setText("1 dias");
        jLabelVlMulta.setText("R$ 10,00");
        javax.swing.GroupLayout cardCadDevResultadoLayout = new javax.swing.GroupLayout(cardCadDevResultado);
        cardCadDevResultado.setLayout(cardCadDevResultadoLayout);
        cardCadDevResultadoLayout.setHorizontalGroup(
                cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButtonConfirmDevolucao))
                                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                                                .addComponent(jLabelDataEmprestimo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelDtEmprestimo))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                                .addComponent(jLabelResDevExemplar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelResDevExemplarNumero)))
                                .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                                                .addComponent(jLabelMulta)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelVlMulta))
                                        .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                                                .addComponent(jLabelDiasAtraso)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabelTotalAtraso))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cardCadDevResultadoLayout.createSequentialGroup()
                                                .addComponent(jLabelDataDevolucao)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelDtDevolucao))))
                        .addContainerGap(41, Short.MAX_VALUE))
        );
        cardCadDevResultadoLayout.setVerticalGroup(
                cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardCadDevResultadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelResDevExemplar)
                                .addComponent(jLabelResDevExemplarNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDataEmprestimo)
                                .addComponent(jLabelDtEmprestimo))
                        .addGap(4, 4, 4)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDataDevolucao)
                                .addComponent(jLabelDtDevolucao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelDiasAtraso)
                                .addComponent(jLabelTotalAtraso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardCadDevResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelMulta)
                                .addComponent(jLabelVlMulta))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConfirmDevolucao)
                        .addContainerGap(48, Short.MAX_VALUE))
        );
        cardEmprestimo.add(cardCadDevResultado, "SHOW_PANEL");
        javax.swing.GroupLayout jPanelEmprestimoLayout = new javax.swing.GroupLayout(jPanelEmprestimo);
        jPanelEmprestimo.setLayout(jPanelEmprestimoLayout);
        jPanelEmprestimoLayout.setHorizontalGroup(
                jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDevolucao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(151, Short.MAX_VALUE))
                .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(cardEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE)))
        );
        jPanelEmprestimoLayout.setVerticalGroup(
                jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEmprestimo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDevolucao)
                        .addContainerGap(296, Short.MAX_VALUE))
                .addGroup(jPanelEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelEmprestimoLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(cardEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(70, Short.MAX_VALUE)))
        );
        jTabbedPanePrincipal.addTab("Empréstimos", jPanelEmprestimo);
        btnRelatorio.setText("Relatório");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRelatorio)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRelatorio)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>

    //-----------------------------------------------------------------------//
    //CADASTROS
    //-----------------------------------------------------------------------//
    private void jButtonAssocSalvarActionPerformed(java.awt.event.ActionEvent evt) {
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
        //Validação
        JOptionPane.showMessageDialog(null, "Associado cadastrado com sucesso!");
    }

    private void btnCadPubActionPerformed(ActionEvent evt) {
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
        
    
    }

    private void CadExemplarYSalvarActionPerformed(ActionEvent evt) {
        //Salvando Exemplar
        String isbn = (String) jComboBoxISBNExemplar.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));

        int isbnexem = Integer.parseInt(isbn);
        OBJExemplar = new EntExemplar(Integer.parseInt(jTextFieldNumExemplar.getText()), isbnexem, Float.parseFloat(jTextFieldPreco.getText()), false);
        ctrExem.CadastrarExemplar(OBJExemplar.getNumero(), OBJExemplar.getISBN(), OBJExemplar.getPreco(), false);
        //Listando para controle meu :)
        System.out.println(ctrExem.ListaExemplars());
        //Limpando campos 
        jTextFieldNumExemplar.setText("");
        jComboBoxISBNExemplar.setSelectedIndex(0);
        jTextFieldPreco.setText("");
        //Validação
        JOptionPane.showMessageDialog(null, "Exemplar cadastrado com sucesso!");
    }

    //-----------------------------------------------------------------------//
    //CONTROLADOR DE LAYOUT
    //-----------------------------------------------------------------------//
    private void btnCadPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {
        //Layout
        cardCadExemplar.setVisible(false);
        cardConsPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardCadPublicacao.setVisible(true);

        
    }

    private void btnConsPublicacaoActionPerformed(java.awt.event.ActionEvent evt) {
        //Layout
        cardCadExemplar.setVisible(false);
        cardCadPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardConsPublicacao.setVisible(true);
    }

    private void btnCadExemplarActionPerformed(java.awt.event.ActionEvent evt) {
        cardConsPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(false);
        cardCadPublicacao.setVisible(false);
        cardCadExemplar.setVisible(true);
    }

    private void btnConsultaPublActionPerformed(java.awt.event.ActionEvent evt) {
        
        String isbn = (String) jComboBoxISBNConsultar.getSelectedItem();
        isbn = isbn.substring(0, isbn.indexOf(" -"));
        int isbnexem = Integer.parseInt(isbn);
        jLabelExemplaresEmprestadoseNaoEmprestados.setText(ctrExem.ListaExemplarsISBNEmprestadosENaoEmprestados(isbnexem));
        
        
        cardCadExemplar.setVisible(false);
        cardConsPublicacao.setVisible(false);
        cardCadPublicacao.setVisible(false);
        cardConsPublResultado.setVisible(true);
    }

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {
        cardCadDevResultado.setVisible(false);
        cardCadDevolucao.setVisible(false);
        cardCadEmprestimo.setVisible(true);
    }

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {
        //Layout
        cardCadDevResultado.setVisible(false);
        cardCadEmprestimo.setVisible(false);
        cardCadDevolucao.setVisible(true);
    }

    private void btnConsultaDevolActionPerformed(java.awt.event.ActionEvent evt) {
        cardCadDevolucao.setVisible(false);
        cardCadEmprestimo.setVisible(false);
        cardCadDevResultado.setVisible(true);
    }

    //-----------------------------------------------------------------------//
    //MAIN
    //-----------------------------------------------------------------------//
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    //-----------------------------------------------------------------------//
    //COMPONENTE
    //-----------------------------------------------------------------------//
    private javax.swing.JButton btnCadExemplar;
    private javax.swing.JButton btnCadPubl;
    private javax.swing.JButton btnCadExemplarYSalvar;
    private javax.swing.JButton btnCadPubl2;
    private javax.swing.JButton btnCadPublicacao;
    private javax.swing.JButton btnConsPublicacao;
    private javax.swing.JButton btnConsultaDevol;
    private javax.swing.JButton btnConsultaPubl;
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JPanel cardCadDevResultado;
    private javax.swing.JPanel cardCadDevolucao;
    private javax.swing.JPanel cardCadEmprestimo;
    private javax.swing.JPanel cardCadExemplar;
    private javax.swing.JPanel cardCadPublicacao;
    private javax.swing.JPanel cardConsPublResultado;
    private javax.swing.JPanel cardConsPublicacao;
    private javax.swing.JPanel cardEmprestimo;
    private javax.swing.JPanel cardPublicacao;
    private javax.swing.JTextField fieldConsultaDevol;
    private javax.swing.JTextField fieldConsultaPubl;
    private javax.swing.JButton jButtonAssocSalvar;
    private javax.swing.JButton jButtonConfirmDevolucao;
    private javax.swing.JComboBox jComboBoxStatus;

    private javax.swing.JComboBox jComboBoxISBNConsultar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelAutor1;
    private javax.swing.JLabel jLabelAutor2;
    private javax.swing.JLabel jLabelDataDevolucao;
    private javax.swing.JLabel jLabelDataEmprestimo;
    private javax.swing.JLabel jLabelDiasAtraso;
    private javax.swing.JLabel jLabelDtDevolucao;
    private javax.swing.JLabel jLabelDtEmprestimo;
    private javax.swing.JLabel jLabelNumExemplar;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmprestados;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelMulta;
    private javax.swing.JLabel jLabelNaoEmprestados;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelResDevExemplar;
    private javax.swing.JLabel jLabelResDevExemplarNumero;
    private javax.swing.JLabel jLabelSatus;
    private javax.swing.JLabel jLabelTitDevolucao;
    private javax.swing.JLabel jLabelTitleConsPub;
    private javax.swing.JLabel jLabelExemplaresEmprestadoseNaoEmprestados;
    private javax.swing.JLabel jLabelTotalAtraso;
    private javax.swing.JLabel jLabelVlMulta;
    private javax.swing.JLabel jLabellEditora2;
    private javax.swing.JLabel jLabellISBNExemplar;
    private javax.swing.JList jListEmprestados;
    private javax.swing.JList jListNaoEmprestados;
    private javax.swing.JPanel jPanelAssociado;
    private javax.swing.JPanel jPanelEmprestimo;
    private javax.swing.JPanel jPanelPublicacao;
    private javax.swing.JScrollPane jScrollPaneEmprestados;
    private javax.swing.JScrollPane jScrollPaneNaoEmprestados;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldAutor1;
    private javax.swing.JTextField jTextFieldAutor2;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNumExemplar;
    private javax.swing.JTextField jTextFieldEdit2;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JComboBox jComboBoxISBNExemplar;
    private javax.swing.JTextField jTextFieldISBN2;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTit2;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblISBN2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTituloResultado;
}
