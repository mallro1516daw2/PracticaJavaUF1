
  public class Turismo extends Vehicle
  {
    // instance variables
   
    private final boolean gps;
    private final boolean aire;

    // constructor
    /**
     * 
     * @param model parametre String amb el model de turisme
     * @param kilometraje parametre integer amb el numero de kilometres recorregut
     * @param matricula parametre String amb la matricula del turisme
     * @param gps parametre boolean de si té o no GPS el turisme
     * @param aire parametre boolean de si té o no aire acondicionat el turisme
     */
    public Turismo (String model, int kilometraje, String matricula, boolean gps, boolean aire)
    {
      	super(model, kilometraje, matricula);
        this.gps = gps;
        this.aire = aire;
              
    }
  
    // getters
    /**
     * 
     * @return 
     */
    
    /**
     * 
     * @return 
     */
    @Override
    public boolean getGps()
    {
       	return gps;
    }/**
     * 
     * @return 
     */
    @Override
    public boolean getAire()
    {
       	return aire;
    }
/**
 * 
 * @return 
 */
    @Override
    public int getNumSeats()
    {
       	return 5;
    }

}