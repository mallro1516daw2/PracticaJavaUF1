







//----------------------------------------------------------
//  Vehicle Class
//----------------------------------------------------------
public abstract class Vehicle
{
    // instance variables
    private int kilometraje;
    private final String matricula;
    private boolean reserved;
    
    
    // constructor
    public Vehicle (int kilometraje, String matricula )
    {  
    	this.kilometraje = kilometraje;
     	this.matricula = matricula;
    }
  
    public String getModel()
    {
      return "";
    }
    public boolean getGps()
    {
      return false;
    }
    public boolean getAire()
    {
      return false;
    }

    public int getKilometraje()
    {
       return kilometraje;
    }
    
    public abstract int getNumSeats();

    public String getMatricula()
    {
       return matricula;
    }

    public String getVehicleInfo()
    {
       return getModel() + " " + getKilometraje() + " kilometros " + getNumSeats() + " asientos " + "  matricula# " + getMatricula()
               + " GPS incorporado:"+ getGps() + " aire acondicionado incorporado:" + getAire() + " RESERVADO? " + isReserved();
    }

    // general methods
    public void reserveVehicle()
    {  
        reserved = true; 
    }

    public boolean isReserved()
    {
       return reserved;
    }

    public void unreserveVehicle()
    {
        reserved = false; 
    }
}