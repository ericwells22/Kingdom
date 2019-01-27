package kingdom;

/**
 *
 * @author s540643
 */
public class Variables {

    
    
    
    
    
    // BASE VARIABLES
    //===================================================================================================================
    public static volatile double K_royalGold; //in whole gold bars, 24 karat, approx. 12,400 grams, approx. $531,000 per gold bar (in today's money).
    public static volatile int K_population; //in persons, every person in kingdom (inclusive of royal guard & council as well).
    public static volatile int K_foodSupply; //in 2500s of calories (1 food feeds average 1 person per day).
    
    public static volatile int K_wealthDistribution; //scale of 1 to 100. Higher is more congruent distribution.
   
    
    
    
    
    
    
    // CITIZEN VARIABLES (AVG for Upper Class, Middle Class & Lower Class CITIZENS)
    //===================================================================================================================
    public static volatile int K_citizenPopulation; //total number of citizens in kingdom (excludes council members & royal guard). 
    
    public static volatile int K_citizenHappiness; //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public static volatile int K_citizenHealth;  //scale of 1 to 100. Higher is more satisfied citizens on average.
    
    public static volatile double K_citizenTotalWealth; //total amount of wealth of all citizens in gold bars so per $500,000s
    public static volatile double K_citizenAvgWealth; //average amount of wealth of each citizen (fraction of a gold bar so out of $500,000)

    public static volatile int K_citizenFreedom; //scale of 1 to 100. Higher is more freedoms. (speech, assembly, bearing arms, press, religion, taxes ALL influence, etc.)

    
    // UPPER CLASS CITIZENS VARIABLES
     
    public static volatile int upperHappiness,upperHealth,upperFreedom,upperPopulation; //similar to K_citizenHappiness/Health/Freedom/Population but just for upper class citizens
    public static volatile double upperAvgWealth, upperTotalWealth; //similar to K_citizenTotalWealth/AvgWealth but just for upper class citizens

    // MIDDLE CLASS CITIZEN VARIABLES
    public static volatile int midHappiness,midHealth,midFreedom,midPopulation; //similar to K_citizenHappiness/Health/Freedom/Population but just for middle class citizens
    public static volatile double midAvgWealth, midTotalWealth; //similar to K_citizenTotalWealth/AvgWealth but just for middle class citizens
    
    // POOR CLASS CITIZENS VARIABLES
    public static volatile int lowHappiness,lowHealth,lowFreedom,lowPopulation; //similar to K_citizenHappiness/Health/Freedom/Population but just for lower class citizens
    public static volatile double lowAvgWealth, lowTotalWealth; //similar to K_citizenTotalWealth/AvgWealth but just for lower class citizens
    
    
    

    //INNER CITY VARIABLES
    //===================================================================================================================
    public static volatile int InnerCityPopulation; //total number of people lvi
    public static volatile int employmentStat, povertyStat, crimeStat; // STATS are based from 1 to 100. Higher means higher employment, more poverty, more crime.

    
    //OUTER CITY VARIABLES
    //===================================================================================================================    
    
    
    
    
    //TRADING DISTRICT VARIABLES
    //===================================================================================================================    
    
    
    
    //QUARTER OF WEALTH VARIABLES
    //=================================================================================================================== 
    public static volatile int weatherStat;
    
}
