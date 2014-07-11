package Biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlEmprestimo {
    
    private EntEmprestimo emprestimo;
    private Vector vecEmprestimos = new Vector();
    private final String arquivo = "emprestimo.dat";
    
    private ControlPublicacao ctrPubli;
    
    
    public ControlEmprestimo() throws Exception {
        ctrPubli = new ControlPublicacao();
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
    
    public String[] ListaExemEmprestados() {
        String result[] = new String[vecEmprestimos.size()];
        EntEmprestimo objEmprestimo = null;
        for (int intIdx = 0; intIdx < vecEmprestimos.size(); intIdx++) {
            objEmprestimo = (EntEmprestimo) vecEmprestimos.elementAt(intIdx);
            result[intIdx] = "Exemplar - Código:" + objEmprestimo.getNumexemplar() + " ISBN: " + objEmprestimo.getISBN();
        }
        return result;
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
