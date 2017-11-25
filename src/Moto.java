  public class Moto extends Vehicle
  {
   
   
    private int battery;
    
    // constructor
    /**
     * 
     * @param model parametre String amb el model de la moto
     * @param kilometraje parametre integer amb el numero de kilometres recorregut per la moto
     * @param matricula parametre String amb la matricula
     */
    public  Moto (String model, int kilometraje, String matricula )
    {
      	super(model,kilometraje, matricula);
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