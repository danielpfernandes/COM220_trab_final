package Biblioteca;


import java.io.Serializable;

public class EntExemplar implements Serializable{
    private int numero;
    private int ISBN;
    private float preco;
    private boolean emprestado;

    public EntExemplar(int numero, int ISBN, float preco, boolean emprestado) {
        this.numero = numero;
        this.ISBN = ISBN;
        this.preco = preco;
        this.emprestado = emprestado;
    }
    
    public EntExemplar() {
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    
    
    public int getNumero() {
        return numero;
    }

    public int getISBN() {
        return ISBN;
    }

    public float getPreco() {
        return preco;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    
}
