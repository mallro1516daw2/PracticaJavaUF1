
public abstract class Vehicle
{
    // instance variables
    private int kilometraje;
    private final String matricula;
    private boolean reserved;
    private double x;
    private double y;
    
    // constructor
    /**
     * 
     * @param kilometraje parametre integer de kilometres recorreguts
     * @param matricula parametre String de la atricula del cotxe
     */
    public Vehicle (int kilometraje, String matricula )
    {  
    	this.kilometraje = kilometraje;
     	this.matricula = matricula;
    }
  /**
   * 
   * @return Retorna un string buit amb el model del vehicle que mes tard es modificat
   */
    public String getModel()
    {
      return "";
    }
    /**
     * 
     * @return retorna si el vehicle té GPS
     */
    public boolean getGps()
    {
      return false;
    }
    /**
     * 
     * @return retorna si el vehicle te aire acondicionat
     */
    public boolean getAire()
    {
      return false;
    }
/**
 * 
 * @return retorna els kilometres recorreguts per el cotxe
 */
    public int getKilometraje()
    {
       return kilometraje;
    }
    /**
     * 
     * @return retorna la localitzacio de variable X del vehicle(nomes pot ser accedit pel client si es moto)
     */
    public double getX()
    {
       return x;
    }
/**
 * 
 * @return retorna la localitzacio de variable Y del vehicle(nomes pot ser accedit pel client si es moto)
 */
    public double getY()
    {
       return y;
    }
    /**
     * 
     * @return el nombre de seients en un integer
     */
    public abstract int getNumSeats();
/**
 * 
 * @return retorna la matricula en forma de String
 */
    public String getMatricula()
    {
       return matricula;
    }
/**
 * 
 * @return retorna un String amb tota l'informacio accedible pel client mitjançant tots els altres getters
 */
    public String getVehicleInfo()
    {
       return getModel() + " " + getKilometraje() + " kilometros " + getNumSeats() + " asientos " + "  matricula# " + getMatricula()
               + " GPS incorporado:"+ getGps() + " aire acondicionado incorporado:" + getAire() + " RESERVADO? " + isReserved();
    }

    // general methods
    /**
     * Setteja reserved a true quan el vehicle es reservat
     */
    public void reserveVehicle()
    {  
        reserved = true; 
    }
    /**
     * 
     * @return retorna si el vehicle es reservad o no
     */
    public boolean isReserved()
    {
       return reserved;
    }
    /**
     * Setteja reserved a false quan es cancela la reservael vehicle es reservat
     */
    public void unreserveVehicle()
    {
        reserved = false; 
    }
    
}