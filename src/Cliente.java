  public class Cliente extends Persona
  {
    private String reservas;      
    
    // constructor
    /**
     * 
     * @param nombre
     * @param id
     * @param apellidos
     * @param reservas 
     */
    public Cliente (String nombre, String id, String apellidos, String reservas)
    {
    	super(id, nombre, apellidos);
	this.reservas = reservas;
   
    }

    // getters
    /**
     * 
     * @return 
     */
    public String getReservas()
    {
       return reservas;
    }

    
}