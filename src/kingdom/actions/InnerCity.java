package kingdom.actions;

import kingdom.Variables;

public class InnerCity {
    
    
    
    public static String getEmploymentStat() {
        int i = Variables.employmentStat;
                String dialogue = "Royal Guard: ";
        if(i<20){return dialogue+"Employment is dangerously low!";}
        if(i<40){return dialogue+"Employment is not looking good.";}
        if(i<60){return dialogue+"The employment levels are decent.";}
        if(i<80){return dialogue+"Employment is looking good.";}
        if(i<=100){return dialogue+"Employment is looking great!";}
        return "";
    }
    
    public static String getPovertyStat() {
        int i = Variables.povertyStat;
                String dialogue = "Royal Guard: ";
        if(i<20){return dialogue+"Poverty is dangerously high sir!";}
        if(i<40){return dialogue+"Our people are suffering. Poverty is high.";}
        if(i<60){return dialogue+"The poverty levels are average.";}
        if(i<80){return dialogue+"Poverty is less common than average.";}
        if(i<=100){return dialogue+"I am happy to report that poverty is very low!";}
        return "";    }
    
    public static String getCrimeStat() {
        int i = Variables.crimeStat;
                String dialogue = "Royal Guard: ";
        if(i<20){return dialogue+"Our crime rate is shooting through the roof!";}
        if(i<40){return dialogue+"The crime rate is higher than it should be!";}
        if(i<60){return dialogue+"The crime rate is about average.";}
        if(i<80){return dialogue+"Crime incidents are less common than average.";}
        if(i<=100){return dialogue+"I am happy to report that crime is very rare!";}
        return "";    }
    
    
    
    

    public static void GiveToPoor(double amt) {
        if(Variables.K_royalGold>=amt){      
        
        Variables.K_royalGold -= amt;

        //SUPER MAD POOR Take the money and spit on you - HIGH chance to steal more
        if (Variables.lowHappiness <= 15) {

            if ((int) (Math.random() * 2) + 1 == 1) { //IF THEY STEAL MORE
                double stolenGold = (Math.random() * 3);
                Variables.K_royalGold -= stolenGold;
                amt+= stolenGold;
            }

        } else if (Variables.lowHappiness <= 30) { //MAD POOR Take the money and spit on you  - FAIR chance to steal more

            if ((int) (Math.random() * 6) + 1 == 1) { //IF THEY STEAL MORE
                double stolenGold = (Math.random());
                Variables.K_royalGold -= stolenGold;
                amt+=stolenGold;
            }

        }
        
        Variables.lowTotalWealth += amt;

    }
    
    }

 
    public void TalkToGuard() {
        
    }
}
