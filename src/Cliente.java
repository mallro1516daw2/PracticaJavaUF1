  public class Cliente extends Persona
  {
    private int reservas;      
    
    // constructor
    /**
     * 
     * @param nombre
     * @param id
     * @param apellidos
     * @param reservas 
     */
    public Cliente (String nombre, String id, String apellidos, int reservas)
    {
    	super(id, nombre, apellidos);
	this.reservas = reservas;
   
    }

    // getters
    /**
     * 
     * @return retorna el numero de reservas que ha fet el client 
     */
    public int getReservas()
    {
       return reservas;
    }

    
}