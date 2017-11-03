


  public class Cliente extends Persona
  {

    private String reservas;      
    
    // constructor
    public Cliente (String nombre, String id, String apellidos, String reservas)
    {
    	super(id, nombre, apellidos);
	this.reservas = reservas;
   
    }

    // getters
    
    public String getReservas()
    {
       return reservas;
    }

    
}