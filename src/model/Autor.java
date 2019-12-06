package model;

public class Autor {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public Autor(String nome, String apelido, String pais, int idAutor) {
        this.nome = nome;
        this.apelido = apelido;
        this.pais = pais;
        this.idAutor = idAutor;
    }
    
    public Autor() {
    }
    
    private String nome;
    private String apelido;
    private String pais;
    private int idAutor;
}
