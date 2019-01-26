package kingdom;

/**
 *
 * @author s540643
 */
public class Variables {

    
    
    // BASE VARIABLES
    //========================
    public static volatile double royalGold; //in whole gold bars, 24 karat, approx. 12,400 grams, approx. $531,000 per gold bar (today's money)
    public static volatile int population; //in persons, every person in kingdom (inclusive of royal people as well).
    public static volatile int foodSupply; //in 2500s of calories (1 food feeds average 1 person per day) 
    
    public static volatile int wealthDistribution; //scale of 1 to 100. Higher is more congruent distribution.
   
    
    
    // CITIZEN VARIABLES (AVG for Upper Class, Middle Class & Lower Class CITIZENS)
    
    //========================
    public static volatile int citizenHappiness; //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public static volatile int citizenHealth;  //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public static volatile double citizenWealth; //average wealth of a citizen in gold bars (fraction of a gold bar so out of $500,000)
    
    public static volatile int citizenFreedom; //scale of 1 to 100. Higher is more freedoms. (speech, assembly, bearing arms, press, religion, taxes influence, etc.)
    
    
    
    
    
    
    // UPPER CLASS CITIZENS VARIABLES
    public static volatile int lowerHappiness,lowerHealth,lowerFreedom;
    public static volatile double lowerWealth, lowerTotalWealth;

    // MIDDLE CLASS CITIZEN VARIABLES
    public static volatile int midHappiness,midHealth,midFreedom;
    public static volatile double midWealth, midTotalWealth;
    
    // POOR CLASS CITIZENS VARIABLES
    public static volatile int poorHappiness,poorHealth,poorFreedom;
    public static volatile double poorWealth, poorTotalWealth;
    
    


    //INNER CITY VARIABLES
    public static volatile int employmentStat, povertyStat, crimeStat; // STATS are based from 1 to 100. Higher is higher employment, higher poverty, higher crime.

}
