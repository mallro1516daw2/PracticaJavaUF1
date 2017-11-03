

//----------------------------------------------------------
//  VehicleCost Class
//----------------------------------------------------------
public class VehicleCost
{
    // instance variables
    private double dailyCost;
    private double weeklyCost;
    private double weekendCost;

    // constructor
    public VehicleCost (double daily, double weekly, double weekend)
    {  
 	dailyCost = daily;
      	weeklyCost = weekly;
      	weekendCost = weekend;
    }
  
    // getters
    public String getVehicleCost()
    {
   	return "Por dia: $" + Double.toString(dailyCost) + " Semanal: $" + 
                weeklyCost + " Fin de semana: $" + weekendCost;
    }
}