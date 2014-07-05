package Main.publicacao;

import Main.BD.BD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;

public class ControlePublicacao extends BD {

    Statement stmt = getStmt();
     private LimitePublicacao objALimPublicacao = new LimitePublicacao();
    private Publicacao objAEntPublicacao;
    private String[] aDadosForm;
    private Vector vecAPublicacoes = new Vector();

    public ControlePublicacao() throws Exception {
        desserializaPublicacao();
    }

    public boolean cadPublicacao() {
        objAEntPublicacao = new Publicacao();
        cadastra();
        objAEntPublicacao.setCodigo(aDadosForm[0]);
        objAEntPublicacao.setTitulo(aDadosForm[1]);
        addVetor(objAEntPublicacao);
        return true;
    }

    private void cadastra() {
        aDadosForm = objALimPublicacao.montaForm();
    }

    private void salva() {
    }

    public void addVetor(Publicacao pPubl) {
        vecAPublicacoes.add(pPubl);
    }

    private void serializaEstudante() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("estudantes.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecAPublicacoes);
        objOS.flush();
        objOS.close();
    }

    private void desserializaPublicacao() throws Exception {
        File objFile = new File("estudantes.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("estudantes.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecAPublicacoes = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public Vector getListaPublicacoes() {
        return vecAPublicacoes;
    }

    public void finalize() throws Exception {
        serializaEstudante();
    }

    private String getPublicacao(Publicacao objPPublicacao) {
        return "Código: " + objPPublicacao.getCodigo()
                + " Titulo: " + objPPublicacao.getTitulo()
                + "\n";
    }

    public String getListaDePublicacoes() {
        String result = "";
        Publicacao objPublicacao = null;
        for (int intIdx = 0; intIdx < getListaPublicacoes().size(); intIdx++) {
            objPublicacao = (Publicacao) getListaPublicacoes().elementAt(intIdx);
            result += getPublicacao(objPublicacao);
        }
        if (result.equalsIgnoreCase("")) {
            return "Não existem publicacoes cadastradas.";
        } else {
            return result;
        }
    }

    public void cadastrarPublicacao(String codigo, String titulo, String autor, String editora, String nroPag, String categoria) {
        try {
            stmt.executeUpdate("insert into livro values(" + codigo + ",'" + titulo + "','" + autor + "','" + editora + "'," + "')");
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            switch (ex.getErrorCode()) {
                case 1062: //Violação chave primária
                    JOptionPane.showMessageDialog(null, "O livro já está cadastrado");
                    break;
                case 1216:
                case 1217:
                case 1451:
                case 1364:
                case 1064: //Campos em branco
                    JOptionPane.showMessageDialog(null, "Não é permitido deixar campos em branco");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro inesperado");
            }

        }
    }

   public String[] PreencherCombo() {
        ResultSet rs;
        String str[] = new String[7];
        int i = 0, flag;
        try{ 
            rs = stmt.executeQuery("SELECT categoria FROM livro;");
            while(rs.next()){
                flag = 0;
                if(str == null){
                    str[i] = rs.getString(1);
                }else {
                    for(int j = 0; j<i; j++){
                        if(str[j].equals(rs.getString(1))){
                            flag = 1;
                            --i;
                            break;
                        }
                    }
                    if(flag == 0){
                        str[i] = rs.getString(1);
                    }
                }
                i++;
            }
            return str;
        }catch(Exception e){
            e.printStackTrace();
            return str;
        }   
    }

    public String ConsultaPublicacao(String categoria) {
        String query;
        String result = "";
        ResultSet rs;

        try {
            query = new String("Select * from livro where categoria = '" + categoria + "';");
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                result += ("ISBN: " + rs.getObject(1).toString() + "\n"
                        + "Título: " + rs.getObject(2) + "\n"
                        + "Autor: " + rs.getObject(3) + "\n"
                        + "Editora: " + rs.getObject(4) + "\n"                        
                        );

            }
            return result;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados com essa categoria");
            return "";
        }


    }
}
