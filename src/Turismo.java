




//  Turismo Class
//----------------------------------------------------------
  public class Turismo extends Vehicle
  {
    // instance variables
    private final String model;
    private final boolean gps;
    private final boolean aire;

    // constructor
    public Turismo (String model, int kilometraje, String matricula, boolean gps, boolean aire)
    {
      	super(kilometraje, matricula);
	this.model = model;
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
    public boolean getGps()
    {
       	return gps;
    }
    @Override
    public boolean getAire()
    {
       	return aire;
    }

    @Override
    public int getNumSeats()
    {
       	return 5;
    }

}