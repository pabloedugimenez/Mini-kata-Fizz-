/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo;

import java.util.Scanner;

/**
 *
 * @author pegn
 */
public class Jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                   jogo jokenpo = new jogo("");
                   
        
       Scanner scan = new Scanner(System.in);
       System.out.println("jogadore 1º digite seu nome.");
         jokenpo.jogador1 =  scan.next();    
         
		System.out.println("jogadore 1º escolha uma das três opções : Pedra, Papel ou Tesoura.");
       String jogada1  = scan.next();
       
       System.out.println("jogadore 2º digite seu nome.");
         jokenpo.jogador2 =  scan.next();         
       System.out.println("jogadore 2º escolha uma das três opções : Pedra, Papel ou Tesoura.");
       String jogada2  = scan.next();    
       
       
       jokenpo.rodada(jogada1, jogada2);
       System.out.println(jokenpo.resultado);        
    }
    
   public static class jogo{
        String resultado;
        String jogador1;
        String jogador2;
        
         public jogo(String x) 
	{   resultado = x;}   
         
        public void setresultado(String x) {  
             resultado = x;}	     
        public String  getresultado() {      
            return resultado; }
        
        public void setjogador1(String x) {  
             jogador1 = x;}	     
        public String  getjogador1() {      
            return jogador1; }    
        
        public void setjogador2(String x) {  
             jogador2 = x;}	     
        public String  getjogador2() {      
            return jogador2; }             

 
        public  void  rodada(String i,String x){
            
		if ( "pedra".equals(i)) {
                   resultado = pedreira(x);}
                else {
		if ( "tesoura".equals(i)) {
                    
                   resultado = costureira(x);}                    
                else {
                if ( "papel".equals(i)) {
                   resultado = papelaria(x);}}
                } 
             
        }
        
        private String pedreira (String y)
        {
            if("pedra".equals(y)){
            return  "empate" ;} 
            else {
                if ("tesoura".equals(y)){
                return  "O jogador " + this.jogador2 + " Vencer a partida ";}
            }
         
             if ("papel".equals(y)){
                return  "O jogador " + this.jogador2 + " Perde a partida ";}  
                       
            return null;     
        }
        private String costureira (String y)
        {
            if("tesoura".equals(y)){
            return  "empate" ;} 
            else {
                if ("papel".equals(y)){
                return  "O jogador " + this.jogador2 + " Vencer a partida ";}
            }
            if ("pedra".equals(y)){
                return  "O jogador " + this.jogador2 + " Perde a partida ";}
            return null;
        }   
        
        private String papelaria (String y)
        {
            if("papel".equals(y)){
            return  "empate" ;} 
            else {
                if ("pedra".equals(y)){
                return  "O jogador " + this.jogador2 + " Vencer a partida ";}            
            }           
            if ("tesoura".equals(y)){
                return  "O jogador " + this.jogador2 + " Perde a partida ";}            
            return null;
        }           
        
    }
        
    
}
