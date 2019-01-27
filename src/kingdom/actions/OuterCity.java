/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.actions;

import kingdom.Variables;

/**
 *
 * @author jtm07
 */
public class OuterCity {
    
    
    public static String getWeather() {
        switch(Variables.weatherStat) {
            case 0:
                return "Flooding";
            case 1:
                return "Rainy";
            case 2:
                return "Normal";
            case 3:
                return "Sunny";
            case 4:
                return "Drought";
            default:
                return "Sunny";
        }
    }
}
