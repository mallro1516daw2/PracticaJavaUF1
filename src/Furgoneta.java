  public class Furgoneta extends Vehicle
  {
      private String model;
    private int numSeats;
    private final boolean gps;
    private final boolean aire;     
    
    // constructor
    /**
     * @param model 
     * @param kilometraje
     * @param numSeats
     * @param matricula
     * @param gps
     * @param aire 
     */
    public Furgoneta (String model, int kilometraje, int numSeats, String matricula, boolean gps, boolean aire)
    {
    	super(kilometraje, matricula);
	this.model = model;
   	this.numSeats = numSeats;
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
    public int getNumSeats()
    {
       return numSeats;
    }
    /**
     * 
     * @return 
     */
     @Override
    public boolean getGps()
    {
       	return gps;
    }
    /**
     * 
     * @return 
     */
    @Override
    public boolean getAire()
    {
       	return aire;
    }
}