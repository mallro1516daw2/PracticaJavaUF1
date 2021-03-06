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
     * @return retorna el % de bateria que li queda a la moto
     */
    public double getBattery()
    {
       return battery;
    }
    /**
     * 
     * @return retorna el model de la moto
     */
    @Override
    public String getModel()
    {
       	return model;
    }
    /**
     * 
     * @return retorna el numero de seients de la moto que sempre son 2
     */
    @Override
    public int getNumSeats()
    {
       	return 2;
    }

}