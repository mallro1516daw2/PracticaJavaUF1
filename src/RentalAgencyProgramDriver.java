

public class RentalAgencyProgramDriver
{
    public static void main(String[] args) 
    {
        RentalAgency Agency = new RentalAgency();
        RentalAgencyUI UI = new RentalAgencyUI(Agency);
        UI.Start();
    }
    
}