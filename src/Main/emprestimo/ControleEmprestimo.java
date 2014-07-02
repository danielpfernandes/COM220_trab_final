package Main.emprestimo;

import Main.BD.BD;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControleEmprestimo extends BD {

    Statement stmt = getStmt();

    public void cadastrarEmprestimo(String codigoAss, String codigoLivro, java.sql.Date dataEmp) {
        try {
            int ret = getQtdEmprestimos(codigoAss);
            System.out.println(ret);
            if(ret < 3 && ret > -1 ){
                
                stmt.executeUpdate("insert into emprestimo values(" + codigoAss + ",'" + codigoLivro + "','" + dataEmp + "', null, null)");
                JOptionPane.showMessageDialog(null, "Emprestimo Cadastrado!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário já tem 3 empréstimos!");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            switch (ex.getErrorCode()) {
                case 1062: //Violação chave primária
                    JOptionPane.showMessageDialog(null, "O livro não está disponível!");
                    break;
                case 1216:
                case 1217:
                case 1451:
                case 1452:
                    JOptionPane.showMessageDialog(null, "Cadastro inexistente!");
                    break;
                case 1364:
                case 1064: //Campos em branco
                    JOptionPane.showMessageDialog(null, "Não é permitido deixar campos em branco");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Erro inesperado");
            }

        }
    }
    
    public int getQtdEmprestimos(String cod){
        ResultSet rs;
        int qtdEmprestimos = 0;
        try {
            rs = stmt.executeQuery("select Data_Devolucao from emprestimo where Cod_Associado =" + cod.toString() + ";");
            while(rs.next()) {
                if(rs.getDate(1) == null){
                    qtdEmprestimos++;
                }
                if(qtdEmprestimos >= 3) break;            
            }
            System.out.println(qtdEmprestimos);
            return qtdEmprestimos;
        } catch (SQLException ex) {
            Logger.getLogger(ControleEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public void cadastrarDevolucao(String codigoLivro, java.sql.Date dataDev){
        double multa;
        long tempoMili;
        int diasAtraso;
        try {
            java.sql.Date dataRetirada = dataDev;
            ResultSet rs = stmt.executeQuery("select Data_Retirada from emprestimo where Cod_Livro = " + codigoLivro + " AND Data_Devolucao is NULL;");
            while(rs.next()) {
                dataRetirada = rs.getDate(1);
            } 
             /*Calcula o tempo de uma data a outra*/
            java.sql.Date dataDevolucao = dataDev;
            if(dataDevolucao != dataRetirada){
                tempoMili = dataDevolucao.getTime() - dataRetirada.getTime();
                diasAtraso = (int) ((tempoMili / 1000) / 3600) / 24;
                System.out.println(diasAtraso);

                if (diasAtraso > 10) {
                    diasAtraso -= 10;
                    multa = diasAtraso * 1;
                } else {
                    multa = 0;
                }
                               
                stmt.executeUpdate("UPDATE emprestimo SET Data_Devolucao = '" + dataDevolucao + "' WHERE Cod_Livro = " + codigoLivro + " AND Data_Devolucao is NULL;");
                stmt.executeUpdate("UPDATE emprestimo SET Valor_Multa = " + multa + " WHERE Cod_Livro = " + codigoLivro + " AND Data_Devolucao = '" + dataDevolucao + "';");
                JOptionPane.showMessageDialog(null, "Devolução Registrada!");
            }
        }catch(SQLException ex){
            System.out.println(ex.getErrorCode());
            JOptionPane.showMessageDialog(null, "Erro inesperado!");  
            
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
                result += ("Código: " + rs.getObject(1).toString() + "\n"
                        + "Título: " + rs.getObject(2) + "\n"
                        + "Autor: " + rs.getObject(3) + "\n"
                        + "Editora: " + rs.getObject(4) + "\n"
                        + "Número de páginas: " + rs.getObject(5).toString() + "\n"
                        + "Categoria: " + rs.getObject(6) + "\n\n");

            }
            return result;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não há livros cadastrados com essa categoria");
            return "";
        }


    }
}
