




  public class Furgoneta extends Vehicle
  {
  
    private String model;
    private int numSeats;
    private final boolean gps;
    private final boolean aire;     
    
    // constructor
    public Furgoneta (String model, int kilometraje, int numSeats, String matricula, boolean gps, boolean aire)
    {
    	super(kilometraje, matricula);
	this.model = model;
   	this.numSeats = numSeats;
      	this.gps = gps;
        this.aire = aire;
    }

    // getters
    @Override
    public String getModel()
    {
       return model;
    }

    @Override
    public int getNumSeats()
    {
       return numSeats;
    }
     @Override
    public boolean getGps()
    {
       	return gps;
    }
    @Override
    public boolean getAire()
    {
       	return aire;
    }
}