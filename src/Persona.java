



public abstract class Persona
{
   
    private String id;
    private String nombre;
    private String apellidos;
    
    
    // constructor
    /**
     * 
     * @param id
     * @param nombre
     * @param apellidos 
     */
    public Persona (String id, String nombre, String apellidos )
    {  
    	this.id = id;
     	this.nombre = nombre;
        this.apellidos = apellidos;
    }
    /**
     * 
     * @return 
     */
    public String getId()
    {
      return id;
    }
    /**
     * 
     * @return 
     */
    public String getNombre()
    {
      return nombre;
    }
    /**
     * 
     * @return 
     */
    public String getApellidos()
    {
      return apellidos;
    }
    
}
