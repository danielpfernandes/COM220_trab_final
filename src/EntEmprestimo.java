
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Logger;

public class EntEmprestimo  implements Serializable{
    private int numexemplar;
    private int ISBN;
    private Date dataemprestimo;
    private int codassociado;

    public EntEmprestimo(int numexemplar, int ISBN, Date dataemprestimo, int codassociado) {
        this.numexemplar = numexemplar;
        this.ISBN = ISBN;
        this.dataemprestimo = dataemprestimo;
        this.codassociado = codassociado;
    }

    public int getNumexemplar() {
        return numexemplar;
    }

    public int getISBN() {
        return ISBN;
    }

    public Date getDataemprestimo() {
        return dataemprestimo;
    }

    public int getCodassociado() {
        return codassociado;
    }

    public void setNumexemplar(int numexemplar) {
        this.numexemplar = numexemplar;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setDataemprestimo(Date dataemprestimo) {
        this.dataemprestimo = dataemprestimo;
    }

    public void setCodassociado(int codassociado) {
        this.codassociado = codassociado;
    }
    
    
}
