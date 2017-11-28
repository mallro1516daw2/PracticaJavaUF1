package persona;

  public class Cliente extends Persona
  {
    private int reservas;      
    
    // constructor
    /**
     * 
     * @param nombre parametre String amb el nom del client
     * @param id parametre String amb el DNI del client
     * @param apellidos parametre String amb els cognoms del client
     * @param reservas parametre integer amb el numero de reserves fetes
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