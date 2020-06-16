
package employee_hierarchy;

public class CommissionEmployee extends Employee_Hierarchy {
    
   private double grossSales;
   private double commissionRate;
   
   public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate){
       super(firstName,lastName,socialSecurityNumber);
       
   }
   public void setGrossSales(double grossSales)
   {
       if(grossSales<0.0)
          throw new IllegalArgumentException("Gross Sales must be greater than >=0.0");
       this.grossSales=grossSales;
   }
    public double getGrossSales()
    {
        return grossSales;
    }
    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate<=0||commissionRate>=1)
            throw new IllegalArgumentException("Commision rate must be <0 and <1.0");
        this.commissionRate=commissionRate;
    }
    public double getCommissionRate()
    {
        return commissionRate;
    }
    public double earnings()
    {
        return commissionRate*grossSales;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n %s %.2f%n","Commision employee",getFirstName(),getLastName(),"with ssn",getSocialSecurityNumber(),"gross sales",getGrossSales(),"commision rate",getCommissionRate(),"earnings",earnings());
    }
}
