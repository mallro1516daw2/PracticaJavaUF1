
/**
 * 
 * @author mklr9
 */
public class RentalAgencyProgramDriver
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        RentalAgency Agency = new RentalAgency();
        RentalAgencyUI UI = new RentalAgencyUI(Agency);
        //UI.Login();
        UI.Start();
    }
    
}