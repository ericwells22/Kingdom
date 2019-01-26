package kingdom;

/**
 *
 * @author s540643
 */
public class Variables {

    
    
    // BASE VARIABLES
    //========================
    public volatile double royalGold; //in whole gold bars, 24 karat, approx. 12,400 grams, approx. $531,000 per gold bar (today's money)
    public volatile int population; //in persons, every person in kingdom (inclusive of royal people as well).
    public volatile int foodSupply; //in 2500s of calories (1 food feeds average 1 person per day) 
    
    public volatile int wealthDistribution; //scale of 1 to 100. Higher is more congruent distribution.
   
    
    
    // CITIZEN VARIABLES (AVG for Upper Class, Middle Class & Lower Class CITIZENS)
    
    //========================
    public volatile int citizenHappiness; //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public volatile int citizenHealth;  //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public volatile double citizenWealth; //average wealth of a citizen in gold bars (fraction of a gold bar so out of $500,000)
    
    public volatile int citizenFreedom; //scale of 1 to 100. Higher is more freedoms. (speech, assembly, bearing arms, press, religion, taxes influence, etc.)
    
    
    
    
    
    
    // UPPER CLASS CITIZENS VARIABLES
    public volatile int lowerHappiness,lowerHealth,lowerFreedom;
    public volatile double lowerWealth, lowerTotalWealth;

    // MIDDLE CLASS CITIZEN VARIABLES
    public volatile int midHappiness,midHealth,midFreedom;
    public volatile double midWealth, midTotalWealth;
    
    // POOR CLASS CITIZENS VARIABLES
    public volatile int poorHappiness,poorHealth,poorFreedom;
    public volatile double poorWealth, poorTotalWealth;
    
    


    //INNER CITY VARIABLES
    public volatile int employmentStat, povertyStat, crimeStat; // STATS are based from 1 to 100. Higher is higher employment, higher poverty, higher crime.

            


}