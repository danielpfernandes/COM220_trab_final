package Biblioteca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControlExemplar {

    private EntExemplar exemplar;
    private Vector vecExemplars = new Vector();
    private final String arquivo = "exemplar.dat";

    private ControlPublicacao ctrPubli;

    public ControlExemplar() throws Exception {
        ctrPubli = new ControlPublicacao();
        desserializaExemplar();
    }

    public boolean CadastrarExemplar(int numero, int ISBN, float preco, boolean emprestado) {
        exemplar = new EntExemplar(numero, ISBN, preco, emprestado);
        addVetor(exemplar);
        return true;
    }

    public void addVetor(EntExemplar pexem) {
        vecExemplars.add(pexem);
        try {
            serializaExemplar();
        } catch (Exception ex) {
            Logger.getLogger(ControlExemplar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void serializaExemplar() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("exemplars.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(vecExemplars);
        objOS.flush();
        objOS.close();
    }

    private void desserializaExemplar() throws Exception {
        File objFile = new File("exemplars.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("exemplars.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            vecExemplars = (Vector) objIS.readObject();
            objIS.close();
        }
    }

    public Vector getListaExemplar() {
        return vecExemplars;
    }

    public void finalize() throws Exception {
        serializaExemplar();
    }
    //*************************************************************************/
    ///LISTAGEM

    private String getExemplar(EntExemplar objPExemplar) {
        return "Número: " + objPExemplar.getNumero()
                + "  ISBN: " + objPExemplar.getISBN()
                + "  Preço: " + objPExemplar.getPreco()
                + "  Emprestado: " + objPExemplar.isEmprestado()
                + "\n";
    }

    //Método para obtenção das lista de disciplinas
    public String ListaExemplars() {
        String result = "";
        EntExemplar objExemplar = null;
        for (int intIdx = 0; intIdx < vecExemplars.size(); intIdx++) {
            objExemplar = (EntExemplar) vecExemplars.elementAt(intIdx);
            result += getExemplar(objExemplar);
        }
        if (result.equalsIgnoreCase("")) {
            return "Não existem exemplars cadastrados.";
        } else {
            return result;
        }
    }

    public int UltimoExemplars(int ISBN) {
        EntExemplar objExemplar = null;
        int cont = 1;
        for (int intIdx = 0; intIdx < vecExemplars.size(); intIdx++) {
            objExemplar = (EntExemplar) vecExemplars.elementAt(intIdx);
            if (objExemplar.getISBN() == ISBN) {
                cont++;
            }
        }
        return cont;
    }

    public String ListaExemplarsISBNEmprestadosENaoEmprestados(int ISBN) {
        EntExemplar objExemplar = null;
        String emprestados = "<html>"+ctrPubli.getPublicacao(ISBN)+"<br>";

        String sim = "", nao = "";
        for (int intIdx = 0; intIdx < vecExemplars.size(); intIdx++) {
            objExemplar = (EntExemplar) vecExemplars.elementAt(intIdx);
            if (objExemplar.getISBN() == ISBN) {
                if (objExemplar.isEmprestado()) {
                    sim += "<br>Número: " + objExemplar.getNumero() + " - Preço: " + objExemplar.getPreco();
                } else {
                    nao += "<br>Número: " + objExemplar.getNumero() + " - Preço: " + objExemplar.getPreco();
                }
            }
        }
        if(sim.equals("") && nao.equals("")){
             emprestados += "<br>Essa publicação não possui exemplares cadastrados!<br>";
        }
        else if (sim.equals("")){
            emprestados += "\n<br><br>DISPONÍVEIS: \n" + nao;
        } else if (nao.equals("")){
            emprestados += "\n<br><br>EMPRESTADOS: \n" + sim;
        }else{
            emprestados += "\n<br><br>DISPONÍVEIS: \n" + nao +  "\n<br><br>EMPRESTADOS: \n" + sim;
        }

        return emprestados+"</html>";
    }

    public String getExemplar(int pISBN, int pNumero) {
        EntExemplar objExemplar = null;
        for (int intIdx = 0; intIdx < vecExemplars.size(); intIdx++) {
            objExemplar = (EntExemplar) vecExemplars.elementAt(intIdx);
            if (objExemplar.getISBN() == pISBN && objExemplar.getNumero() == pNumero) {
                return getExemplar(objExemplar);
            }
        }
        return "Não foi encontrada nenhuma exemplar com o ISBN " + pISBN + " e numero" + pNumero + ".";
    }

}
