package Biblioteca;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlAssociado {
    private EntAssociado associado;
    private String[] aDadosForm;
    private Vector vecAssociados = new Vector();
    private final String arquivo = "associado.dat";
    
    
    public ControlAssociado() throws Exception {
        desserializaAssociado();
    }
    
    public boolean CadastrarAssociado(int Codigo, String Nome, String Endereco, String Status, String Email){
        associado = new EntAssociado(Codigo, Nome, Endereco, Status, Email);
        addVetor(associado);
        return true;        
    }
    
    public void addVetor(EntAssociado passo) {
        vecAssociados.add(passo);
        try {
            serializaAssociado();
        } catch (Exception ex) {
            Logger.getLogger(ControlAssociado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void serializaAssociado() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("associados.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecAssociados);
        objOS.flush();
        objOS.close();
    }

    private void desserializaAssociado() throws Exception {
        File objFile = new File("associados.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("associados.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecAssociados = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public Vector getListaAssociado() {
        return vecAssociados;
    }

    public void finalize() throws Exception {
        serializaAssociado();
    }
    //*************************************************************************/
    ///LISTAGEM
    private String getAssociado(EntAssociado objPAssociado) {
        return "Código: " + objPAssociado.getCodigo()
                + "  Nome: " + objPAssociado.getNome()
                + "  Endereco: " + objPAssociado.getEndereco()
                + "  Status: " + objPAssociado.getStatus()
                + "  E-mail: " + objPAssociado.getEmail()
                + "\n";
    }

    //Método para obtenção das lista de disciplinas
    public String ListaAssociados() {
        String result = "";
        EntAssociado objAssociado = null;
        for (int intIdx = 0; intIdx < vecAssociados.size(); intIdx++) {
            objAssociado = (EntAssociado) vecAssociados.elementAt(intIdx);
            result += getAssociado(objAssociado);
        }
        if (result.equalsIgnoreCase("")) {
            return "Não existem associados cadastrados.";
        } else {
            return result;
        }
    }
    public String[] ListaCodeAssociado() {
        String vecAsso[] = new String[vecAssociados.size()];
        EntAssociado objAssociado = null;
        for (int intIdx = 0; intIdx < vecAssociados.size(); intIdx++) {
            objAssociado = (EntAssociado) vecAssociados.elementAt(intIdx);
            vecAsso[intIdx] = ""+objAssociado.getCodigo() +" - "+objAssociado.getNome();
        }
        return vecAsso;
    }
    public String getAssociado(int pCodigo) {
        EntAssociado objAssociado = null;
        for (int intIdx = 0; intIdx < vecAssociados.size(); intIdx++) {
            objAssociado = (EntAssociado) vecAssociados.elementAt(intIdx);
            if (objAssociado.getCodigo() == pCodigo) {
                return getAssociado(objAssociado);
            }
        }
        return "Não foi encontrada nenhuma associado com o código " + pCodigo + ".";
    }
    
}
