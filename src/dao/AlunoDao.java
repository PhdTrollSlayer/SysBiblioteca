package dao;

import java.util.ArrayList;
import model.Aluno;

public class AlunoDao{
    
    public ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
    
    public Aluno a = new Aluno();
    
    public void defineAluno(){
        Aluno al = new Aluno();
        
        al.setIdAluno(this.GetNewId());
        al.setNome("Zé");
        al.setCodigo("666");
        al.setCpf("081-999");
        al.setCurso("Adm");
        
        this.InsertAluno(al);
    }
    
    public void defineAluno2(){
        Aluno al = new Aluno();
        
        al.setIdAluno(this.GetNewId());
        al.setNome("Gopnik");
        al.setCodigo("678");
        al.setCpf("092-821");
        al.setCurso("Malandragem");
        
        this.InsertAluno(al);
    }
    
    public void defineAluno3(){
        Aluno al = new Aluno();
        
        al.setIdAluno(this.GetNewId());
        al.setNome("Zica Boy");
        al.setCodigo("246");
        al.setCpf("267-900");
        al.setCurso("Malandragem");
        
        this.InsertAluno(al);
    }
    
    public void defineAluno4(){
        Aluno al = new Aluno();
        
        al.setIdAluno(this.GetNewId());
        al.setNome("Gaúcho");
        al.setCodigo("544");
        al.setCpf("102-876");
        al.setCurso("Rodeio");
        
        this.InsertAluno(al);
    }
    
    public void InsertAluno(Aluno a){
        this.listaAluno.add(a);
    }
    
    public String toString(){
        String retorno = "";
        retorno += "****************************"
                + "Listagem de Alunos "
                + "*************************** \n";
        
        for (Aluno a : listaAluno){
            retorno += "\nId:" + a.getIdAluno()+ "\nNome: " + a.getNome()
                    + "\nCPF: " + a.getCpf()+ " Codigo: " + a.getCodigo() + 
                    "\nCurso: " + a.getCurso() + "\n";
        }
        return retorno;
    }
    
    public void procuraAluno(int emp){
        for (Aluno a : listaAluno){
            
            if (a.getIdAluno() == emp) {
                
                System.out.println("\nId:" + a.getIdAluno()+ "\nNome: " + a.getNome()
                    + "\nCPF: " + a.getCpf()+ " Codigo: " + a.getCodigo() + 
                    "\nCurso: " + a.getCurso() + "\n");
            }
           
        }
        
    }
    
    public int GetNewId() {
        int id = 0;
        for (Aluno a : listaAluno) {
            if (a.getIdAluno()> id) {
                id = a.getIdAluno();
            }
        }
        return (id + 1);
    }
    
}
