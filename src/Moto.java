  public class Moto extends Vehicle
  {
   
    private final String model;
    private int battery;
    
    // constructor
    /**
     * 
     * @param model
     * @param kilometraje
     * @param matricula 
     */
    public  Moto (String model, int kilometraje, String matricula )
    {
      	super(kilometraje, matricula);
	this.model = model;  	
    }
    // getters
    /**
     * 
     * @return 
     */
    public double getBattery()
    {
       return battery;
    }
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
       	return 2;
    }

}