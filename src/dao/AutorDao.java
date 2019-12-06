package dao;

import java.util.ArrayList;
import model.Autor;

public class AutorDao {
    public ArrayList<Autor> listaAutor = new ArrayList<Autor>();
    
    public Autor a = new Autor();
    
    public void defineAutor(){
        Autor au = new Autor();
        
        au.setNome("Carlos");
        au.setApelido("Caca da Barraca");
        au.setPais("Acre");
        au.setIdAutor(this.GetNewId());
        
        this.InsertAutor(au);
    }
    public void defineAutor2(){
        Autor au = new Autor();
        
        au.setNome("Danrlei");
        au.setApelido("Ice Blue");
        au.setPais("Fraiburg");
        au.setIdAutor(this.GetNewId());
        
        this.InsertAutor(au);
    }
    public void defineAutor3(){
        Autor au = new Autor();
        
        au.setNome("Matheus");
        au.setApelido("Mano Brown");
        au.setPais("Big Bom");
        au.setIdAutor(this.GetNewId());
        
        this.InsertAutor(au);
    }
    public void defineAutor4(){
        Autor au = new Autor();
        
        au.setNome("William");
        au.setApelido("Polenta");
        au.setPais("PHP Land");
        au.setIdAutor(this.GetNewId());
        
        this.InsertAutor(au);
    }
    
    public void InsertAutor(Autor a){
        this.listaAutor.add(a);
    }
    
     public String toString(){
        String retorno = "";
        retorno += "****************************"
                + "Listagem de Autores "
                + "*************************** \n";
        
        for (Autor a : listaAutor){
            retorno += "\nId:" + a.getIdAutor()+ "\nNome: " + a.getNome()
                    + " Pais: " + a.getPais()+ "\nApelido: " + a.getApelido() + "\n";
        }
        return retorno;
    }
    
    public int GetNewId() {
        int id = 0;
        for (Autor a : listaAutor) {
            if (a.getIdAutor() > id) {
                id = a.getIdAutor();
            }
        }
        return (id + 1);
    }
}
