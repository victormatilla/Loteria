/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalAdjusters.next;
import java.util.Random;
//import java.util.Arrays;

/**
 *
 * It´s formed to:<ul>
 *                   <li>one combination(it doesn´t have repetitives numbers)</li>
 *                   <li>one reintegro(it has number between 1 and 9</li>
 *                   <li>one complementario(it can´t be equal to one number in combination</li>
 *                 </ul>
 * @author victor 
 * @since 3/12/2020
 */
public class Primitiva {
    
//    private int []combination;
    /**
     * It´s the user´s combination
     */
    private String combination;
    /**
     * It´s the user´s reintegro
     */
    private int reintegro;
    /**
     * It´s the Primitiva´s price
     */
    private final double PRICE;
    /**
     * It´s the next raffle´s day.
     */
    private final String NEXTRAFFLE;
    /**
     * It´s the user´s complementario
     */
    private String complementario;
    
    /**
     * Constructor without params
     */
    public Primitiva(){
        this.combination = generateCombination();
        this.reintegro = (int) (Math.random()*9+1);
        this.PRICE = 1;
        this.NEXTRAFFLE = LocalDateTime.now().with(next(DayOfWeek.THURSDAY)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.complementario = generateComplemetario();
    }
    /**
     * 
     * @return the reintegro
     */
    public int getReintegro() {
        return reintegro;
    }
    /**
     * 
     * @param reintegro the reintegro to set
     */
    public void setReintegro(int reintegro) {
        this.reintegro = reintegro;
    }
        
    /**
     * @return the nextRaffle
     */
    public String getNextRaffle() {
        return NEXTRAFFLE;
    }

    /**
     * @return the PRICE
     */
    public double getPRICE() {
        return PRICE;
    }
    
    /**
     * 
     * @return this.combination      
     * <br>
     * This metod serves to set this.combination´s value in constructor.
     */
    private String generateCombination(){
        this.combination="";
        Random num=new Random();
        int incrementer=0;
        
        while (incrementer<6) {            
            String numString=String.valueOf((num.nextInt(49)+1));
            if(!this.combination.contains(numString)){
                this.combination+=numString.concat(" ");
                incrementer++;
            }
        }
        return this.combination;        
    }

    /**
     * @return the combination
     */
    public String getCombination() {
        return combination;
    }

    /**
     * @return the complementario
     */
    public String getComplementario() {
        return complementario;
    }
    /**
     * This metod serves to set this.complementario´s value in constructor. 
     * @return this.complementario
     */
    private String generateComplemetario(){
        this.complementario="";
        Random num=new Random();
        
        while(this.complementario.length()<1){
            String numString=String.valueOf((num.nextInt(49)+1));
            if(!this.combination.contains(numString)){
                this.complementario+=numString;
                return this.complementario;
            }
        }
        return null;
    }
    
        
}
