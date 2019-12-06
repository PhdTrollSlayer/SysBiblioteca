package cadastrobiblioteca;

import dao.AlunoDao;
import dao.AutorDao;
import dao.LivroDao;
import util.Validacao;
import java.util.Scanner;

public class CadastroBiblioteca {
    
    static LivroDao lDao = new LivroDao();
    static AlunoDao aDao = new AlunoDao();
    static AutorDao auDao = new AutorDao();
    
    Validacao valida = new Validacao();
    
    public static void main(String[] args) {
        CadastroBiblioteca cb = new CadastroBiblioteca();
        Scanner sc = new Scanner(System.in);
        
        //Teste
        lDao.defineLivros();
        lDao.defineLivros2();
        lDao.defineLivros3();
        lDao.defineLivros4();
        
        aDao.defineAluno();
        aDao.defineAluno2();
        aDao.defineAluno3();
        aDao.defineAluno4();
        
        auDao.defineAutor();
        auDao.defineAutor2();
        auDao.defineAutor3();
        auDao.defineAutor4();
        
        System.out.println("Bibilioteca");
        int menu = 0;
        
        do {            
            System.out.println("1 - Fazer empréstimos");
            System.out.println("2 - Receber devolução");
            System.out.println("3 - Listar todos os livros");
            System.out.println("4 - Listar todos os alunos");
            System.out.println("5 - Listar todos os autores");
            System.out.println("6 - Mostras todos os livros emprestados");
            System.out.println("7 - Mostrar todos os livros emprestados de um determinado aluno");
            System.out.println("8 - Mostrar todos os empréstimos de um determinado livro");
            System.out.println("9 - Mostrar livro de um determinado autor");
            System.out.println("0 - SAIR");
            
            String validaMenu = sc.next();
            menu = cb.valida.validaNumeroMenu(validaMenu);
            
            switch (menu){
                case 1:
                    cb.fazEmprestimo();
                    break;
                    
                case 2: 
                    cb.recebeDevolucao();
                    break;
                case 3:
                    System.out.println(lDao.toString());
                    break;
                
                case 4: 
                    System.out.println(aDao.toString());
                    break;
                 
                case 5:
                    System.out.println(auDao.toString());
                    break;
                    
                case 6:
                    lDao.livreLivro("Emprestado");
                    break;
                    
                case 7:
                    cb.procuraAluno();
                    break;
                    
                case 8:
                    lDao.livreLivro("Emprestado");
                    System.out.println("Digite o id do livro que deseja verificar");
                    int esco = sc.nextInt();
        
                    int lv = lDao.situacao(esco);
                    
                    aDao.procuraAluno(lv);
                    break;
                    
                case 9:
                    cb.procuraAutor();
                    break;
                
                case 0:
                    System.out.println("Cya");
                    
            }
            
            if (menu < 0 || menu > 9){
                System.out.println("Opção inválida. Tente novamente!");
                menu = 1;
            }
            
        } while (menu != 0);
        
    }
    
    private void procuraAutor(){
        Scanner sc = new Scanner(System.in);
        LivroDao ls = this.lDao;
        
        System.out.println(lDao.toString());
        System.out.println("Digite o nome do autor que deseja procurar");
                    
        String esco = sc.nextLine();
        ls.autorLivro(esco.toLowerCase());
     
    }
    
    private void procuraAluno(){
        Scanner sc = new Scanner(System.in);
        LivroDao ld = this.lDao;
        
        System.out.println(aDao.toString());
        System.out.println("Digite o id do Aluno que deseja procurar");
        int esco = sc.nextInt();
        
        ld.procuraPorAluno(esco);
    } 
    
    private void fazEmprestimo(){
        Scanner sc = new Scanner(System.in);
        LivroDao ld = this.lDao;
        
        lDao.livreLivro("Não emprestado");
        System.out.println("Digite o id do livro que deseja emprestar");
        int esco = sc.nextInt();
        
        System.out.println(aDao.toString());
        
        ld.setEmprestimo(esco);
    }
    
    private void recebeDevolucao(){
        Scanner sc = new Scanner(System.in);
        LivroDao ld = this.lDao;
        
        lDao.livreLivro("Emprestado");
        System.out.println("Digite o id do livro que deseja receber");
        int esco = sc.nextInt();
        
        ld.devolucao(esco);
    }
    
        
}
