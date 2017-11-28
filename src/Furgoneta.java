



  public class Furgoneta extends Vehicle
  {
    
    private int numSeats;
    private final boolean gps;
    private final boolean aire;     
    
    // constructor
    /**
     * @param model parametre string amb el model
     * @param kilometraje parametre integer amb el kilometres que  ha fet la furgoneta
     * @param numSeats parametre integer amb el numero de seients
     * @param matricula parametre string amb la matricula de la furgoneta
     * @param gps parametre boolea si te o no gps
     * @param aire parametre boolea si te o no aire
     */
    public Furgoneta (String model, int kilometraje, int numSeats, String matricula, boolean gps, boolean aire)
    {
    	super(model,kilometraje, matricula);
   	this.numSeats = numSeats;
      	this.gps = gps;
        this.aire = aire;
    }

    // getters
    /**
     * 
     * @return retorna el model de coche
     */
  
    /**
     * 
     * @return retorna el numero de seients de la furgoneta
     */
    @Override
    public int getNumSeats()
    {
       return numSeats;
    }
    /**
     * 
     * @return Retorna si té o no GPS
     */
     @Override
    public boolean getGps()
    {
       	return gps;
    }
    /**
     * 
     * @return retorna si té o no airee acondicionat
     */
    @Override
    public boolean getAire()
    {
       	return aire;
    }
}