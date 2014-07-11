package Biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlEmprestimo {
    
    
    public Date datadoemprestimo;
    public int associadoqueemprestou;
    private EntEmprestimo emprestimo;
    private Vector vecEmprestimos = new Vector();
    private final String arquivo = "emprestimo.dat";
    
    private ControlPublicacao ctrPubli;
    private ControlAssociado ctrAsso;
    
    
    public ControlEmprestimo() throws Exception {
        ctrPubli = new ControlPublicacao();
        ctrAsso = new ControlAssociado();
        desserializaEmprestimo();
    }
    
    public boolean CadastrarEmprestimo(int numexemplar, int ISBN, Date dataemprestimo, int codassociado){
        emprestimo = new EntEmprestimo(numexemplar, ISBN, dataemprestimo, codassociado);
        addVetor(emprestimo);
        return true;        
    }
    
    public void addVetor(EntEmprestimo pexem) {
        vecEmprestimos.add(pexem);
        try {
            serializaEmprestimo();
        } catch (Exception ex) {
            Logger.getLogger(ControlEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void serializaEmprestimo() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("emprestimos.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecEmprestimos);
        objOS.flush();
        objOS.close();
    }

    private void desserializaEmprestimo() throws Exception {
        File objFile = new File("emprestimos.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("emprestimos.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecEmprestimos = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public Vector getListaEmprestimo() {
        return vecEmprestimos;
    }

    public void finalize() throws Exception {
        serializaEmprestimo();
    }
    //*************************************************************************/
    ///LISTAGEM
    
    private String getEmprestimo(EntEmprestimo objPEmprestimo) {
        return "Número exemplar: " + objPEmprestimo.getNumexemplar()
                + "  ISBN: " + objPEmprestimo.getISBN()
                + "  Data do empréstimo: " + objPEmprestimo.getDataemprestimo()
                + "  Codigo do associado: " + objPEmprestimo.getCodassociado()
                + "\n";
    }

    //Método para obtenção das lista de empréstimos
    public String ListaEmprestimos() {
        String result = "";
        EntEmprestimo objEmprestimo = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmprestimo = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            result += getEmprestimo(objEmprestimo);
        }
        if (result.equalsIgnoreCase("")) {
            return "Não existem emprestimos cadastrados.";
        } else {
            return result;
        }
    }
    
    public void DeletarEmprestimo(int numero, int ISBN){
    
        EntEmprestimo objEmp = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmp = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            if (objEmp.getISBN() == ISBN && objEmp.getNumexemplar() == numero) {
                
                vecEmprestimos.remove(objEmp);
                //estou alterado o status do exemplar
                //Serializando para sobreescrever no arquivo
                try {
                    serializaEmprestimo();
                } catch (Exception ex) {
                    Logger.getLogger(ControlExemplar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
    }
    public String[] ListaExemEmprestados() {
        String result[] = new String[vecEmprestimos.size()];
        EntEmprestimo objEmprestimo = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmprestimo = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            result[intIdx] = "Exemplar - número: " + objEmprestimo.getNumexemplar() + " ISBN: " + objEmprestimo.getISBN();
        }
        return result;
    }

    public void getInfo(int numero, int ISBN){
        
        EntEmprestimo objEmprestimo = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmprestimo = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            if (objEmprestimo.getNumexemplar() == numero && objEmprestimo.getISBN() == ISBN) {
                datadoemprestimo = objEmprestimo.getDataemprestimo();
                associadoqueemprestou = objEmprestimo.getCodassociado();
            }
        }
    }
    
    
    public float calculaMulta(int numero, int ISBN){
        getInfo(numero, ISBN);
        Date dataatual = new Date();  
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");  
        formatador.format( dataatual );
        int diasdediferença;
        int tempoparaemprestimo = ctrAsso.tempoparaemprestimo(associadoqueemprestou);
        diasdediferença = (int) ((dataatual.getTime() - datadoemprestimo.getTime()) / 86400000L);
        
        int total = diasdediferença-tempoparaemprestimo;
        if(total>0){
            return (float) (total*1.00);
        }
        return (float)(0*1.00);
    }
    
    
    public String getEmprestimo(int associado) {
        EntEmprestimo objEmprestimo = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmprestimo = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            if (objEmprestimo.getCodassociado() == associado) {
                return getEmprestimo(objEmprestimo);
            }
        }
        return "Não foi encontrada nenhuma emprestimo com o associado " + associado+".";
    }
    
}
