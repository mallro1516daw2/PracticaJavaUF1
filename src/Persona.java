



public abstract class Persona
{
   
    private String id;
    private String nombre;
    private String apellidos;
    
    
    // constructor
    public Persona (String id, String nombre, String apellidos )
    {  
    	this.id = id;
     	this.nombre = nombre;
        this.apellidos = apellidos;
    }
  
    public String getId()
    {
      return id;
    }
    public String getNombre()
    {
      return nombre;
    }
    public String getApellidos()
    {
      return apellidos;
    }
    
}
