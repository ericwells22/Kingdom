/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.actions;

import kingdom.Variables;

/**
 *
 * @author S540643
 */
public class Actions {
    
    Variables var = new Variables(); //variable
    
    
    
    //INNER CITY
    public void GiveToPoor(double amt){
        int happyUp = 0;
        var.royalGold -= amt;
        
        
        //SUPER MAD POOR Take the money and spit on you - HIGH chance to steal more
        if(var.poorHappiness<=15){
        happyUp = (int)(Math.random()*(amt*8))+1;
        
        if((int)(Math.random()*2)+1==1){ //IF THEY STEAL MORE
        double stolenGold = (Math.random()*3); 
        var.royalGold -= stolenGold; }
        
        }
        
        //MAD POOR Take the money and spit on you  - FAIR chance to steal more
        if(var.poorHappiness<=30&&var.poorHappiness>15){
        happyUp = (int)(Math.random()*(amt*12))+2;
        
        if((int)(Math.random()*6)+1==1){ //IF THEY STEAL MORE
        double stolenGold = (Math.random()); 
        var.royalGold -= stolenGold; }

        }
        
        //NEUTRAL POOR Take the money and thank you
        if(var.poorHappiness<=70&&var.poorHappiness>30){
        happyUp = (int)(Math.random()*(amt*15))+3;
        }
        
        //HAPPY POOR Take the money and physically embrace the king
        if(var.poorHappiness>70){
        happyUp = (int)(Math.random()*(amt*20))+5;
        
        }
        
        var.poorHappiness += happyUp;
        var.poorWealth += amt;
        
    }
    public void SubsidizeJob(double amt){}
    public void TalkToGuard(){}
    
    
    
    
      
}
