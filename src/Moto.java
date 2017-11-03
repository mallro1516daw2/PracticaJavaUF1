






  public class Moto extends Vehicle
  {
   
    private final String model;
    private double x;
    private double y;
    private int battery;
    
    // constructor
    public  Moto (String model, int kilometraje, String matricula )
    {
      	super(kilometraje, matricula);
	this.model = model;  	
    }
    // getters
    public double getX()
    {
       return x;
    }

    public double getY()
    {
       return y;
    }
    public double getBattery()
    {
       return battery;
    }
    @Override
    public String getModel()
    {
       	return model;
    }

    @Override
    public int getNumSeats()
    {
       	return 2;
    }

}