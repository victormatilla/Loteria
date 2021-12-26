/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * The main class which the app runs
 * @author victor
 * @version 1.0
 * @since 5/12/2020
 */
public class MainClass {
    public static void main(String[] args){
        
        @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
        System.out.println("\n---Bienvenido a la aplicacion de Loterias y Apuestas del Estado---");        
        int game;
        double totalPrice=0;
        do{
            System.out.println("...................");
            System.out.print("Elija el juego al que desea jugar:\n 1.Primitiva\n 2.Quiniela\n 3.Loteria nacional \n 4.Salir\n==>");            
            game=sc.nextInt();
            sc.nextLine(); //usado para consumir el espacio que no consume el nextInt()
            switch(game){
                case 1:                    
                    Primitiva primitiva = new Primitiva();
                    double primitivaPrice=primitiva.getPRICE();
                    totalPrice+=primitivaPrice;                    
                    String nextPrimitivaRaffle=primitiva.getNextRaffle();
                    System.out.println("...................");                    
                    System.out.println("  Fecha del siguiente sorteo: "+nextPrimitivaRaffle);
                    System.out.println("  Combinacion: "+primitiva.getCombination());
                    System.out.println("  Complementario "+primitiva.getComplementario()+" Reintegro: "+primitiva.getReintegro());
                    break;
                    
                case 2:                    
                    Quiniela quiniela=new Quiniela();
                    double quinielaPrice=quiniela.getPRICE();
                    int nBets;
                    String nextQuinielaRaffle=quiniela.getNextRaffle();
                    boolean valid;
                    System.out.println("...................");
                    System.out.println("  Fecha del siguiente sorteo: "+nextQuinielaRaffle);       
                    do{
                        System.out.print("  Dime el numero de apuestas a realizar(min:2 max:8)-->");
                        nBets=sc.nextInt();
                        valid=quiniela.validateNumberOfBets(nBets);
                        
                        if(valid==false){
                            System.out.println("  Minimo 2 apuestas, maximo 8.");
                        }
                    }while(valid==false);
                    
                    quiniela.setNumberOfBets(nBets);
                    quiniela.generateRaffle();                   
                    totalPrice+=quinielaPrice*nBets;
                                        
                    int nBet=0;                  

                    for (int i = 0; i < quiniela.getCombination().length(); i++) {
                        if(i%16==0){ //es 16 ya que por apuesta son 15 partidos entonces el caracter 16 es un espacio
                            nBet++;
                            System.out.print("\n  Apuesta "+nBet+": ");
                        }                           
                        System.out.print(quiniela.getCombination().charAt(i)+" ");
                                               
                    }
                    System.out.println();//usado para que asi muestre el menu en la sigiuente linea 
                    break;
                    
                case 3:                    
                    LoteriaNacional loteria=new LoteriaNacional();
                    double loteriaPrice=loteria.getPRICE();
                    totalPrice+=loteriaPrice;
                    System.out.println("...................");
                    String terminacion;
                    do{
                        System.out.print("  Elige terminación hasta 3 cifras (ENTER si te da igual): ");
                        terminacion=sc.nextLine();
                        if(terminacion.length()>3){
                            System.out.println("\t-Error-\n Maximo 3 valores.");
                        }
                    }while(terminacion.length()>3);
                                        
                    loteria.valueOfTermination(terminacion);
                    System.out.println("  Numero con el que juegas: "+loteria.getNumber());
                    System.out.println("  Serie: "+loteria.getSERIE()+" Fraccion: "+loteria.getFRACTION());
                    break;
                    
                case 4:
                    System.out.println("Gracias por participar, mucha suerte.");
                    System.out.println("...................");
                    break;
                
                default:
                    System.out.println("  Valor no valido.");                
            }
        }while(game!=4);
        
        NumberFormat nf=NumberFormat.getCurrencyInstance();
        
        System.out.println("A pagar: "+nf.format(totalPrice));
    }

}
