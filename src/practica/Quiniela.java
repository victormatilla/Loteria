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

/**
 *It´s formed for one String witch 1,2 or x, it represents the winner of the match.
 * @author victor 
 * @since 4/12/2020
 */
public class Quiniela {
    /**
     * Quiniela´s price
     */
    private final double PRICE;
    /**
     * Next raffle´s date 
     */
    private final String NEXTRAFFLE;
    /**
     * User´s combination
     */
    private String combination;

    /**
     * Bet´s number
     */
    private int nBets;
    
    /**
     * Constructor without parameters 
     */
    public Quiniela(){
        this.PRICE=0.5;
        this.NEXTRAFFLE=LocalDateTime.now().with(next(DayOfWeek.SUNDAY)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.combination="";
        this.nBets=0;
    }

    /**
     * @return the PRICE
     */
    public double getPRICE() {
        return PRICE;
    }

    /**
     * @return the NEXTRAFLLE
     */
    public String getNextRaffle() {
        return NEXTRAFFLE;
    }

    /**
     * @return the combination
     */
    public String getCombination() {
        return combination;
    }
    
    /**
     * Generate your bet, if this.combination=0, it adds x 
     */
    public void generateRaffle() {
        int winner;
        for (int i = 0; i < this.nBets; i++) {
            for (int j = 0; j < 16; j++) {
                winner=(int) (Math.random() * 3);
                if(winner==0){
                    this.combination=this.combination.concat("x");
                }else{
                    this.combination=this.combination.concat(String.valueOf(winner));
                }            
            }

        }
    }        

    /**
     * @param nBets the nBets to set
     */
    public void setNumberOfBets(int nBets) {
        this.nBets = nBets;
    }
    
    /**
     * 
     * @param nBets :Number of bets
     * @return <ul>
     *          <li>true: if nBets if biggets or equal than 2 and nBets is lower than 9
     *          <li>false: if nBets is lower than 2 or nBets is biggest than 8
     *         </ul>
     */
    public boolean validateNumberOfBets(int nBets){
        return !(nBets<2 || nBets>8);
    }
    
}
