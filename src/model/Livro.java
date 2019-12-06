package model;

public class Livro {

    public int getEmprestadoPara() {
        return emprestadoPara;
    }

    public void setEmprestadoPara(int emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }

    public Livro(int emprestadoPara) {
        this.emprestadoPara = emprestadoPara;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Livro(String autor) {
        this.autor = autor;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Livro(String area, String ano, String titulo, String situacao, int id) {
        this.area = area;
        this.ano = ano;
        this.titulo = titulo;
        this.situacao = situacao;
        this.idLivro = id;
    }

    public Livro() {
    }
    
    private String area;
    private String ano;
    private String titulo;
    private String situacao;
    private int idLivro;
    private String autor;
    private int emprestadoPara;
    
}
