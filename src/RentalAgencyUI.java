import Exceptions.VehicleNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RentalAgencyUI 
{
    // instance variables
    private RentalAgency agency;
    Scanner input = new Scanner(System.in);
    
    // constructor
    /**
     * 
     * @param a 
     */
    public RentalAgencyUI(RentalAgency a) 
    {
        agency = a;
    }
    
    // general methods
    /**
     * 
     */
    public void Start()
    {   int selection;
        System.out.println("\n\nBienvenido a la Agencia");
	System.out.println("=================================================");
        do
        {
            DisplayMenu();
            selection = input.nextInt();
            if (selection >= 1 && selection <= 6)
	      ExecuteC(selection);
            else
              System.out.println("** Te has equivocado de numero, prueba otra vez **");
        }
        while (selection != 6);
    }
    /**
     * 
     */
   
    private void DisplayMenu()
    {
	System.out.println("\nElige uno de los siguientes:");
	System.out.println("-------------------------------------------------");
	System.out.println("1 - Mostrar los tipos de vehiculo disponible");
	System.out.println("2 - Mostrar los precios segun el tipo de vehiculo");
     	System.out.println("3 - Mostrar los vehiculos disponibles");
	System.out.println("4 - Reservar un vehiculo");
	System.out.println("5 - Cancelar una reserva");
	System.out.println("6 - Salir");
        System.out.print("\nSeleccion: ");
    }
    /**
     * 
     * @param cmd 
     */
    private void ExecuteC(int cmd)
    {
        int type;
	String matricula;

        switch(cmd)
	  {
            case 1: displayVehicleTypes();
                    break;
            case 2: do
                    {
		       System.out.print("Seleciona un tipo de vehiculo: ");
                       type = input.nextInt();
                    }
                    while (type < 1 || type > 3);

                    displayVehicleCost(type);
                    break;
            case 3: do
                    {
		       System.out.print("Seleciona un tipo de vehiculo: ");
                       type = input.nextInt();
                    }
                    while (type < 1 || type > 3);

                    displayAvailVehicles(type);
		    break;
            case 4: System.out.print("Matricula#: ");
                    matricula = input.next();
                    try
		    {
                        agency.reserveVehicle(matricula);
                    }
                    catch (VehicleNotFoundException e)
      		    {
                        System.out.println("matricula # no encontrada ");
                        break;
                    }
                    System.out.println("** Se ha echo la reserva correctamente **");
                    break;
            case 5: System.out.print("Matricula#: ");
                    matricula = input.next();
                    try
		    {
                        agency.unreserveVehicle(matricula);
                    }
                    catch (VehicleNotFoundException e)
                    {
                        System.out.println("matricula # no encontrada ");
                        break;
                    }
                    System.out.println("## Reserva cancelada correctamente ##");
                    break;
        }
    }
    
    private void ExecuteE(int cmd)
    {
        int type;
	String matricula;

        switch(cmd)
	  {
            case 1: displayVehicleTypes();
                    break;
            case 2: do
                    {
		       System.out.print("Seleciona un tipo de vehiculo: ");
                       type = input.nextInt();
                    }
                    while (type < 1 || type > 3);

                    displayVehicleCost(type);
                    break;
            case 3: do
                    {
		       System.out.print("Seleciona un tipo de vehiculo: ");
                       type = input.nextInt();
                    }
                    while (type < 1 || type > 3);

                    displayAvailVehicles(type);
		    break;
            case 4: System.out.print("Matricula#: ");
                    matricula = input.next();
                    try
		    {
                        agency.reserveVehicle(matricula);
                    }
                    catch (VehicleNotFoundException e)
      		    {
                        System.out.println("matricula # no encontrada ");
                        break;
                    }
                    System.out.println("** Se ha echo la reserva correctamente **");
                    break;
            case 5: System.out.print("Matricula#: ");
                    matricula = input.next();
                    try
		    {
                        agency.unreserveVehicle(matricula);
                    }
                    catch (VehicleNotFoundException e)
                    {
                        System.out.println("matricula # no encontrada ");
                        break;
                    }
                    System.out.println("## Reserva cancelada correctamente ##");
                    break;
            case 6: System.out.print("Matricula#: ");
                    matricula = input.next();
                    agency.addVehicle(matricula);
                    System.out.println("## Coche añadido correctamente ##");
                    break;
        }
    }

/**
 * 
 */
    private void displayVehicleTypes()
    {
	System.out.println("\nTipos de vehiculo");
	System.out.println("-------------------------------------------------");
	System.out.println("1 - Turismos");
     	System.out.println("2 - Furgonetas");
        System.out.println("3 - Moto");
    }
    /**
     * 
     * @param type 
     */  
    private void displayVehicleCost(int type)
    {
	System.out.println();  // skip line
        System.out.println("Precio para " + VehicleTypeName(type) );
	System.out.println("-------------------------------------------------");	    
        System.out.println(agency.getVehicleCost(type));
	System.out.println(); // skip line
    }	
    /**
     * 
     * @param type 
     */
    private void displayAvailVehicles(int type)
    {
        ArrayList<String> vehicles;
	System.out.println("\nAvailable " + VehicleTypeName(type) + " Vehicles");
	System.out.println("-------------------------------------------------");
        vehicles = agency.getAvailVehicles(type);
	System.out.println(vehicles);

    }
/**
 * 
 * @param type
 * @return 
 */
    private String VehicleTypeName(int type)
    {
	switch (type)
	{
	   case 1: return "Turismo";
	   case 2: return "Furgoneta";
           case 3: return "Moto";
        }  
        return " ";       
    }

    public void Login(int status) {
        
    }

    void Login() {
        int status;
        do
        {
            System.out.println("\n Ets client(1) o empleat(2)?");
            DisplayMenu();
            status = input.nextInt();
            if (status == 2)
	      ExecuteE(status);
            else
              System.out.println("** Eres un cliente **");
            ExecuteC(status);
        }
        while (status != 2);
    }
}