
  public class Turismo extends Vehicle
  {
    // instance variables
    private final String model;
    private final boolean gps;
    private final boolean aire;

    // constructor
    /**
     * 
     * @param model
     * @param kilometraje
     * @param matricula
     * @param gps
     * @param aire 
     */
    public Turismo (String model, int kilometraje, String matricula, boolean gps, boolean aire)
    {
      	super(kilometraje, matricula);
	this.model = model;
        this.gps = gps;
        this.aire = aire;
              
    }
  
    // getters
    /**
     * 
     * @return 
     */
    @Override
    public String getModel()
    {
       	return model;
    }
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