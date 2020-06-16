
package employee_hierarchy;


public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate,double baseSalary){
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);         
        
        if(baseSalary<0)
        throw new IllegalArgumentException("Base Salary must be >=0");
        
        this.baseSalary=baseSalary;
    }
    
    public void setBaseSalary(double baseSalary)
    {
        if(baseSalary<0)
            throw new IllegalArgumentException("Base Salary must be >=0");
        
        this.baseSalary=baseSalary; 
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double earnings()
    {
        return baseSalary+(getCommissionRate()*getGrossSales());
    }
    
    @Override
    
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n %s %.2f %n%s: %.2f%n","Base Salary Plus Commisionned Employee",getFirstName(),getLastName(),"with ssn: ",getSocialSecurityNumber(),"gross sales",getGrossSales(),"commision rate",getCommissionRate(),"base salary",getBaseSalary(),"earnings",earnings());
    }
}
