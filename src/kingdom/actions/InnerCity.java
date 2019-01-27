package kingdom.actions;

import kingdom.Variables;

public class InnerCity {
    
    public static String getEmploymentStat() {
        return Integer.toString(Variables.employmentStat);
    }
    
    public static String getPovertyStat() {
        return Integer.toString(Variables.povertyStat);
    }
    
    public static String getCrimeStat() {
        return Integer.toString(Variables.povertyStat);
    }

    public static void GiveToPoor(double amt) {
        System.out.println("GIVING " +amt);
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

 
    public void TalkToGuard() {
        
    }
}
