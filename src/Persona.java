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
     * @return retorna el identificador de la persona
     */
    public String getId()
    {
      return id;
    }
    /**
     * 
     * @return retorna el nom de la persona
     */
    public String getNombre()
    {
      return nombre;
    }
    /**
     * 
     * @return retorna els cognoms de la persona
     */
    public String getApellidos()
    {
      return apellidos;
    }
    
}
