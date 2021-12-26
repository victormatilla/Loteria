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

/**
 *It´s formed for:<ul>
 *                   <li>one number(it doesn´t have repetitives numbers)</li>
 *                   <li>one fraction(it has number between 1 and 99)</li>
 *                   <li>one serie(has number between 1 and 99)</li>
 *                 </ul>
 * @author victor 
 * @since 3/12/2020
 */
public class LoteriaNacional {
    /**
     * Loteria´s price
     */
    private final double PRICE;
    /**
     * Next raffle´s date 
     */
    private final String NEXTRAFFLE;
    /**
     * This is the number which the cliente will play
     */
    private String number;
    /**
     * This is the serie which the cliente will play
     */
    private final int SERIE;
    /**
     * This is the fraction which the cliente will play
     */
    private final int FRACTION;
    
    /**
     * Constructor without params
     */
    public LoteriaNacional() {
        this.PRICE=12;
        this.NEXTRAFFLE=LocalDateTime.now().with(next(DayOfWeek.SATURDAY)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.number="";
        this.SERIE=valueOfSerie();
        this.FRACTION=valueOfFraction();
    }

    /**
     * @return the PRICE
     */
    public double getPRICE() {
        return PRICE;
    }

    /**
     * @return the nextRaffle
     */
    public String getNextRaffle() {
        return NEXTRAFFLE;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }
    
    /**
     * 
     * @return serie.
     * <br>
     * This metod serves to set this.serie´s value in constructor.
     */
    private int valueOfSerie(){
        Random num=new Random();
        int serie=num.nextInt(99);
        return serie;
    }
    /**
     * 
     * @return fraction 
     * <br>
     * This metod serves to set this.fraction´s value in constructor.
     */
    private int valueOfFraction(){
        Random num=new Random();
        int fraction=num.nextInt(99);
        return fraction;
    }
    
    /**
     *
     * @param termination : values chosen by user. It could be empty.
     * @return this.number
     * <br>
     * This metod serves to set this.number´s value in constructor.
     */
    public String valueOfTermination(String termination){
        String string="";        
        Random num=new Random();
        for (int i = 0; i < 6-termination.length(); i++) {
            string+=String.valueOf(num.nextInt(9));
        }
        this.number=string.concat(termination);
        return this.number;
    }

    /**
     * @return the SERIE
     */
    public int getSERIE() {
        return SERIE;
    }

    /**
     * @return the FRACTION
     */
    public int getFRACTION() {
        return FRACTION;
    }
    
    
}
