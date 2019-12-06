package model;

public class Aluno {

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public Aluno(String cpf, String nome, String codigo, String curso, int idAluno) {
        this.cpf = cpf;
        this.nome = nome;
        this.codigo = codigo;
        this.curso = curso;
        this.idAluno = idAluno;
    }

    public Aluno() {
    }
    
    private String cpf;
    private String nome;
    private String codigo;
    private String curso;
    private int idAluno;
    
}
