package Main.publicacao;

public class Publicacao {
    private String titulo, autor, editora, isbn;
    

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }


    /**
     * @return the isbn
     */
    public String getCodigo() {
        return isbn;
    }

    /**
     * @param codigo the isbn to set
     */
    public void setCodigo(String codigo) {
        this.isbn = codigo;
    }
}