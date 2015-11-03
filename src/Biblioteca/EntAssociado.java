package Biblioteca;


import java.io.Serializable;

public class EntAssociado implements Serializable {

    private int codigo;
    private String nome;
    private String endereco;
    private String status;
    private String email;

    public EntAssociado(int codigo, String nome, String endereco, String status, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
        this.email = email;
    }
    public EntAssociado(){}
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getStatus() {
        return status;
    }

    public String getEmail() {
        return email;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
