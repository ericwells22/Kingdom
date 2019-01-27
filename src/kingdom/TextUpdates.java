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
    

    public String RandomCase(ArrayList<String> list){
        int r = (int)(Math.random()*list.size());
        
        return list.get(r); 
        
    } //Return a random element from a String ArrayList
    
        
    
    
    //INNER CITY 
    //==========================================
    public String RandomGuardGreet(String kingName){ //Return a random royal guard greeting
       String full_greeting = "";
        ArrayList<String> greet1 = new ArrayList<>();
           greet1.add("Hello sire! "); greet1.add("Greetings your Majesty! "); greet1.add("Greetings your Honor! "); greet1.add("Hello there, Honorary " +kingName +"! "); greet1.add("My Lord! ");
           full_greeting += RandomCase(greet1);
           
        ArrayList<String> greet2 = new ArrayList<>();
           greet2.add("What would you like to hear about?"); greet2.add("What interests you?"); greet2.add("What shall I tell you?"); greet2.add("What do you need?"); 
           full_greeting += RandomCase(greet2);
           
           return full_greeting; 
           
           
        }
    
        
    }
    
    
    
    

