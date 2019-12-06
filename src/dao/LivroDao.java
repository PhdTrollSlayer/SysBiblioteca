package dao;

import java.util.ArrayList;
import java.util.Scanner;
import model.Livro;
import dao.AlunoDao;


public class LivroDao {
    
    private ArrayList<Livro> listaLivro = new ArrayList<Livro>();
    
    public Livro l =  new Livro();
    
    static AlunoDao aDao = new AlunoDao();
    
    public void defineLivros(){
        
        Livro lv = new Livro();
        lv.setIdLivro(this.GetNewId());
        lv.setTitulo("A vida no Acre");
        lv.setAutor("Carlos");
        
        lv.setAno("1999");
        lv.setArea("2");
        lv.setSituacao("Emprestado");
        lv.setEmprestadoPara(1);
        
        this.InsertLivro(lv);
        
    }
    
    public void defineLivros2(){
        
        Livro lv = new Livro();
        lv.setIdLivro(this.GetNewId());
        lv.setTitulo("PHP sem Gambiarra");
        lv.setAutor("William");
        
        lv.setAno("2016");
        lv.setArea("51");
        lv.setSituacao("Não emprestado");
        
        this.InsertLivro(lv);
        
    }
    public void defineLivros3(){
        
        Livro lv = new Livro();
        lv.setIdLivro(this.GetNewId());
        lv.setTitulo("O corredor do feijão");
        lv.setAutor("Matheus");
        
        lv.setAno("1978");
        lv.setArea("5");
        lv.setSituacao("Emprestado");
        lv.setEmprestadoPara(3);
        
        this.InsertLivro(lv);
        
    }
    public void defineLivros4(){
        
        Livro lv = new Livro();
        lv.setIdLivro(this.GetNewId());
        lv.setTitulo("A Arte do Facão");
        lv.setAutor("Danrlei");
        
        lv.setAno("2004");
        lv.setArea("67");
        lv.setSituacao("Não emprestado");
        
        this.InsertLivro(lv);
        
    }
    
    public void InsertLivro(Livro l){
        this.listaLivro.add(l);
    }
    
    public String toString(){
        String retorno = "";
        retorno += "****************************"
                + "Listagem de Livros "
                + "**************************** \n";
        
        for (Livro l : listaLivro){
            retorno += "\nId:" + l.getIdLivro() + "\nNome: " + l.getTitulo() + "\nAutor: " + l.getAutor()
                    + " Ano: " + l.getAno() + " Situação: " + l.getSituacao() + "\n";
        }
        return retorno;
    }
    
    public void livreLivro(String emp){
        Livro p = new Livro();
        for (Livro l : listaLivro){
            if (l.getSituacao() != null && l.getSituacao().equals(emp)) {
                
                System.out.println("\nId:" + l.getIdLivro() + "\nNome: " + l.getTitulo() + "\nAutor: " + l.getAutor()
                    + " Ano: " + l.getAno() + " Situação: " + l.getSituacao() + "\n");
            }
           
        }
        //return p;
    }
    
    public void autorLivro(String emp){
        for (Livro l : listaLivro){
            
            if (l.getAutor()!= null && l.getAutor().toLowerCase().equals(emp)) {
                //return l;
                System.out.println("\nId:" + l.getIdLivro() + "\nNome: " + l.getTitulo() + "\nAutor: " + l.getAutor()
                    + " Ano: " + l.getAno() + " Situação: " + l.getSituacao() + "\n");
            }
           
        }
        //return p;
    }
    
    public void procuraPorAluno(int emp){
        int cont = 0;
        for (Livro l : listaLivro){
            
            if (l.getEmprestadoPara() == emp) {
                cont++;
                System.out.println("\nId:" + l.getIdLivro() + "\nNome: " + l.getTitulo() + "\nAutor: " + l.getAutor()
                    + " Ano: " + l.getAno() + " Situação: " + l.getSituacao() + "\n");
            }       
        }
        if (cont == 0) {
            System.out.println("\nEste aluno não tem nenhum livro emprestado\n");
        }
    }
    
    public void setEmprestimo(int emp){
        Scanner sc = new Scanner(System.in);
        
        for (Livro l : listaLivro){
            if (l.getIdLivro() == emp) {
                
                System.out.println("Para qual aluno você deseja emprestar? Insira o id");
                int id = sc.nextInt();
                
                l.setEmprestadoPara(id);
                l.setSituacao("Emprestado");
            }
        }
    }
    
    public void devolucao(int emp){
        for (Livro l : listaLivro){
            if (l.getIdLivro() == emp) {
                
                l.setEmprestadoPara(0);
                l.setSituacao("Não emprestado");
            }
        }
    }
    
    public int situacao(int emp){
        int id = 0;
        for (Livro l : listaLivro){
            if (l.getIdLivro() == emp) {
                
                System.out.println("Livro emprestado para: ");
                id = l.getEmprestadoPara();
                
                
            }
        }
        return id;
    }
    
    public int GetNewId() {
        int id = 0;
        for (Livro l : listaLivro) {
            if (l.getIdLivro()> id) {
                id = l.getIdLivro();
            }
        }
        return (id + 1);
    }
    
}
