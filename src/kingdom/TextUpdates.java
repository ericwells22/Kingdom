/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom;

import java.util.ArrayList;


/**
 *
 * @author S540643
 */
public class TextUpdates {
    

    public static String RandomCase(ArrayList<String> list){
        int r = (int)(Math.random()*list.size());
        
        return list.get(r); 
        
    } //Return a random element from a String ArrayList
    
        
    
    
    //INNER CITY 
    //==========================================
    public static String RandomGuardGreet(String kingName){ //Return a random royal guard greeting
       String full_greeting = "Royal Guard: ";
        ArrayList<String> greet1 = new ArrayList<>();
           greet1.add("Hello sire! "); greet1.add("Greetings your Majesty! "); greet1.add("Greetings your Honor! "); greet1.add("Hello there, Honorary " +kingName +"! "); greet1.add("My Lord! ");
           full_greeting += RandomCase(greet1);
           
        ArrayList<String> greet2 = new ArrayList<>();
           greet2.add("What would you like to hear about?"); greet2.add("What interests you?"); greet2.add("What shall I tell you?"); greet2.add("What do you need?"); 
           full_greeting += RandomCase(greet2);
           
           return full_greeting; 
           
           
        }
    public static String PoorPersonDialogue(String kingName, int howLarge, boolean thanks){ 
        
        String dialogue = "Lowly Peasant: ";
        
        if(thanks==false){
                        ArrayList<String> thanks0 = new ArrayList<>();
                        thanks0.add("How much shall you give sir, Great King " +kingName +"?");
                        thanks0.add("Alms for the poor! How much will you give sir?");
                        thanks0.add("Sire? How much shall you give King "+kingName +"?");
                        thanks0.add("My Lord! Will you provide us with funds? Oh please, King "+kingName +"!");
                        thanks0.add("Alms for the poor! Please sire!");
                        thanks0.add("Money for the hungry?");
                        thanks0.add("Please my Lord! Please help the weak!");
                        thanks0.add("Alms for the peasants! Please my Lord!");
            dialogue+= RandomCase(thanks0);
            
        }
        if(thanks==true){
                ArrayList<String> thanks1 = new ArrayList<>();
                if(howLarge==1&&Variables.lowHappiness>=50){thanks1.add("Thank you sire! We love our King!"); thanks1.add("My Lord I shall always bow to you!"); thanks1.add("Our Sire has shared the wealth! Thank you my Lord!");}
                if(howLarge==1&&Variables.lowHappiness<50){thanks1.add("Sire...that donation was satisfactory."); thanks1.add("Thanks...I guess...sir."); thanks1.add("Lord...you just don't do enough for the poor...");}

                if(howLarge==2&&Variables.lowHappiness>=50){thanks1.add("Long live the King!"); thanks1.add("Bow to the Lord of the Land! He has given us prosperity!");} thanks1.add("Thank you, My Lord! Make it more next time!");
                if(howLarge==2&&Variables.lowHappiness<50){thanks1.add("Thanks for...at least something..."); thanks1.add("We appreciate the small bit you give sire..."); thanks1.add("King...you just don't help us enough...");}

                if(howLarge==3&&Variables.lowHappiness>=50){thanks1.add("Our Lord will live forever! Long live the King!"); thanks1.add("Your contributions will be forever cherished my Lord!"); thanks1.add("You are our savior! The King shall live forever!"); thanks1.add("Your donations will forever be remembered!");}
                if(howLarge==3&&Variables.lowHappiness<50){thanks1.add("That was a lot, sire! But you still don't do enough..."); thanks1.add("My Lord...you will never satisfy us....even with your riches...");}
                
                dialogue+= RandomCase(thanks1);
            
        }

           return dialogue;
           
        }
    
        
    }
    
    
    
    

