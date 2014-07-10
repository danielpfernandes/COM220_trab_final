
import java.io.Serializable;


public class EntPublicacao implements Serializable{
    private int ISBN;
    private String titulo;
    private String autor;
    private String editora;

    public EntPublicacao(int ISBN, String titulo, String autor, String editora) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    

    
    public EntPublicacao() {
    }
    
    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    
    
    
    
}
