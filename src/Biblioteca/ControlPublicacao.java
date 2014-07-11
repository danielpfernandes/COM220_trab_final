package Biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControlPublicacao {
    private EntPublicacao publicacao;
    private Vector vecPublicacaos = new Vector();
   
    private final String arquivo = "publicacao.dat";
    
    
    
    public ControlPublicacao() throws Exception {
        desserializaPublicacao();
    }
    
    public boolean CadastrarPublicacao(int ISBN, String titulo, String autor, String editora){
        publicacao = new EntPublicacao(ISBN, titulo, autor, editora);
        addVetor(publicacao);
        return true;        
    }
    
    public void addVetor(EntPublicacao ppubli) {
        vecPublicacaos.add(ppubli);
        try {
            serializaPublicacao();
        } catch (Exception ex) {
            Logger.getLogger(ControlPublicacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void serializaPublicacao() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("publicacaos.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecPublicacaos);
        objOS.flush();
        objOS.close();
    }

    private void desserializaPublicacao() throws Exception {
        File objFile = new File("publicacaos.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("publicacaos.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecPublicacaos = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public Vector getListaPublicacao() {
        return vecPublicacaos;
    }

    public void finalize() throws Exception {
        serializaPublicacao();
    }
    
//------------------------------------------------------------//
    //LISTAGEM
    //------------------------------------------------------------//
    
    private String getPublicacao(EntPublicacao objPPublicacao) {

        
        return "\nISBN: " + objPPublicacao.getISBN()
                + "  \nTitulo: " + objPPublicacao.getTitulo()
                + "  \nAutor: " + objPPublicacao.getAutor()
                + "  \nEditora: " + objPPublicacao.getEditora()
                + "\n";
    }

    public String ListaPublicacaos() {
        String result = "";
        EntPublicacao objPublicacao = null;
        for (int intIdx = 0; intIdx < vecPublicacaos.size(); intIdx++) {
            objPublicacao = (EntPublicacao) vecPublicacaos.elementAt(intIdx);
            result += getPublicacao(objPublicacao);
        }
        if (result.equalsIgnoreCase("")) {
            return "Não existem publicacaos cadastrados.";
        } else {
            return result;
        }
    }
    public String[] ListaISBNPublicacaos() {
        String vecISBNPub[] = new String[vecPublicacaos.size()];
        EntPublicacao objPublicacao = null;
        for (int intIdx = 0; intIdx < vecPublicacaos.size(); intIdx++) {
            objPublicacao = (EntPublicacao) vecPublicacaos.elementAt(intIdx);
            vecISBNPub[intIdx] = ""+objPublicacao.getISBN() +" - "+objPublicacao.getTitulo();
        }
        return vecISBNPub;
    }


    public String getPublicacao(int pISBN) {
        EntPublicacao objPublicacao = null;
        for (int intIdx = 0; intIdx < vecPublicacaos.size(); intIdx++) {
            objPublicacao = (EntPublicacao) vecPublicacaos.elementAt(intIdx);
            if (objPublicacao.getISBN() == pISBN) {
                return getPublicacao(objPublicacao);
            }
        }
        return "Não foi encontrada nenhuma publicacao com o isbn " + pISBN + ".";
    }
    
}

