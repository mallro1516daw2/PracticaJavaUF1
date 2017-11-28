



public class VehicleCost
{
    // instance variables
    private double dailyCost;
    private double weeklyCost;
    private double weekendCost;

    // constructor
    /**
     * 
     * @param daily parametre del preu per dia per defecte
     * @param weekly parametre del preu de una setmana sencera
     * @param weekend paramertre del preu de un cap de setmana
     */
    protected VehicleCost (double daily, double weekly, double weekend)
    {  
 	dailyCost = daily;
      	weeklyCost = weekly;
      	weekendCost = weekend;
    }
  
    // getters
    /**
     * 
     * @return Retorna un String amb un text del cost del tipus de vehicle elegit
     */
    protected String getVehicleCost()
    {
   	return "Por dia: $" + Double.toString(dailyCost) + " Semanal: $" + 
                weeklyCost + " Fin de semana: $" + weekendCost;
    }
}