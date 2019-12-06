package util;

import java.util.Scanner;

public class Validacao {
    
    Scanner sc = new Scanner(System.in);

    public boolean validaNum(String p) {
        boolean retorno = true;
        for (Character c : p.toCharArray()) {
            if (!Character.isDigit(c)) {
                retorno = false;
                break;
            }
        }
        return retorno;
    }
    
    public int validaNumeroMenu(String p){
        int retorno = -1;
        Boolean x = true;
        
        do{
            x = this.validaNum(p);
            if(!x){
                System.out.println("Opção inválida! Tente novamente:");
                p = this.sc.nextLine();
            }else{
                retorno = Integer.parseInt(p);
            }
         }while(!x);
        return retorno;
    }
    
    public float validaFlutuante(String n){
        Boolean aux = true;
        float retorno = 0.0f;
        do{
            try{
                retorno = Float.parseFloat(n);
                aux = false;
            }catch(Exception e){
                aux = true;
                System.out.println("Dados inválidos. Tente novamente:");
                n = this.sc.nextLine();
            }
        }while(aux);
        return retorno;
    }
}
