import Exceptions.VehicleNotFoundException;
import java.util.ArrayList;


public class RentalAgency 
{
    // instance variables
    private final VehicleCost vehicleCosts[] = new VehicleCost[3];
    private Vehicle vehicles[] = new Vehicle[13];

    // constructor
    
    public RentalAgency()
    {
      	populateVehicleCosts();
      	populateVehicles();
    }

    // general methods
    /**
     * 
     * @param type
     * @return 
     */
    public ArrayList<String> getAvailVehicles(int type)
    {
       ArrayList<String> availVehicles = new ArrayList<>();
       Class c;
       String className;

       for(int i=0; i < 13; i++)
       {
          if (vehicles[i] == null)
             break;
          
          c = vehicles[i].getClass();
          className = c.getName();
           if (type==3)//if type==3 es Moto por lo tal el cliente necesita la ubicacion
             availVehicles.add(vehicles[i].getVehicleInfo() + "Ubicacion: X" +vehicles[i].getX()+" Y "+ vehicles[i].getY()+ Character.toString('\n'));
           else//si no es moto entonces el cliente no la necesita
            availVehicles.add(vehicles[i].getVehicleInfo() + Character.toString('\n'));
       }
       return availVehicles;
    }
    /**
     * 
     * @param matricula
     * @throws VehicleNotFoundException 
     */
    public void reserveVehicle(String matricula) throws VehicleNotFoundException
    {    
   	int loc;
	
      	loc = findVehicle(matricula);
      	if (loc != -1)
           vehicles[loc].reserveVehicle();
    }
/**
 * 
 * @param matricula Numero int de la matricula
 * @throws VehicleNotFoundException quan no troba el vehicle
 */
    public void unreserveVehicle(String matricula) throws VehicleNotFoundException
    { 	int loc;

      	loc = findVehicle(matricula);
      	if (loc != -1)
           vehicles[loc].unreserveVehicle();
    }
/**
 * 
 * @param type 
 * @return 
 */
    public String getVehicleCost(int type)
    {    
       	return vehicleCosts[type-1].getVehicleCost();
    }

    // private supporting methods
    /**
     * 
     */
    private void populateVehicleCosts()
    {
       	vehicleCosts[0] = new VehicleCost(24.95, 149.95, 44.95);  // Turismo
       	vehicleCosts[1] = new VehicleCost(29.95, 189.95, 54.95);  // Furgoneta
       	vehicleCosts[2] = new VehicleCost(30.00, 200.00, 55.00); //Moto
    }
/**
 * 
 */
    private void populateVehicles()
    {
	vehicles[0] = new Turismo("Ford Focus", 35, "GF1TG6", false, false);
       	vehicles[1] = new Turismo("Nissan Sentra", 32, "AH1JK0", true, true);
       	vehicles[2] = new Turismo("Kia Rio", 36, "FD9BN2", true, true);
	vehicles[3] = new Turismo("Ford Focus", 35, "GF1TG6", false, false);
       	vehicles[4] = new Turismo("Chrysler Sebring", 30, "CEMN41", true, false);
       	vehicles[5] = new Turismo("Mercury Grand Marquis", 25, "CB4PE4", false, true);
 	vehicles[6] = new Turismo("Chrysler 300", 27, "KR9KE9", true, false);
       	vehicles[7] = new Furgoneta("Subaru Forester", 28, 5, "LE8JA4", true, false);
       	vehicles[8] = new Furgoneta("Ford Excape", 27, 8, "KK2HE8", true, false);
	vehicles[9] = new Furgoneta("Ford Expedition", 17, 8, "JK3RT3", true, false);
        vehicles[10] = new Moto("BMW R 1200 RT", 28, "LJ8JA4");
       	vehicles[11] = new Moto("Harley Davidson Breakout", 27, "KA2HE8");
	vehicles[12] = new Moto("Subaru 1234 JK", 17, "JK3FT3");
    }

/**
 * 
 * @param type
 * @param className
 * @return 
 */
    private boolean matchingVehicleType(int type, String className)
    {
     	switch(type)
	{
	   case 1: return (className.equals("Turismo"));
           case 2: return (className.equals("Furgoneta"));
           case 3: return (className.equals("Moto"));
	}
        return false;
    }      

/**
 * 
 * @param matricula
 * @return
 * @throws VehicleNotFoundException 
 */
    private int findVehicle(String matricula) throws VehicleNotFoundException
    {     
      for (int i = 0; i < 14; i++)
        if (vehicles[i].getMatricula().equals(matricula))
          return i;
      throw new VehicleNotFoundException();
        
    }
}