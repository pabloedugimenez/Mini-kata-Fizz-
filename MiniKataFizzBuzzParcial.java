/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini.kata.fizzbuzz.parcial;

import java.util.Scanner;

/**
 *
 * @author pegn
 */
public class MiniKataFizzBuzzParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           calcular C1 = new calcular("");
       
       Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		
       int entrada  = scan.nextInt();
       C1.multiplor(entrada);
       System.out.println(C1.retorno);
       

       
    }
    
   public static class calcular{
        String retorno;
         public calcular(String x) 
	{   retorno = x;		
                     
        }         
           public void setretorno(String x) {  
             retorno = x;  
        }	
        
	public String  getretorno() {      
            return retorno; }
 
        public void multiplor(int i){
            
		if (i % 5 == 0 && i % 3 == 0)
			retorno ="fizzbuzz";
                else 
                    retorno ="O número " + Integer.toString(i)+" não é  múltiplo de 3 e 5 .";
        }
        
    }
    
     
}