
package employee_hierarchy;

public class SalariedEmployee extends Employee_Hierarchy{
    private double salary;
    
     public SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double salary){
         
         super(firstName, lastName, socialSecurityNumber);
         
         if(salary<0)
             throw new IllegalArgumentException("Salary must be greater than 0");
         
         this.salary=salary;
     }
     public double getSalary(){
         return salary;
     }
    public void setSalary(){
        if(salary<0)
            throw new IllegalArgumentException("Salary must be greater than 0");
        this.salary=salary;
    }
    public double earnings(){
        double earnings;
        earnings=salary;
        return earnings;
    }
    
    @Override
    
    public String toString(){
        return String.format("%s: %s %s %s: %s%n %s: %.2f%n %s: %.2f%n ", "Salaried Employee",getFirstName(),getLastName(),"with ssn", getSocialSecurityNumber(),"Salary",getSalary(),"Earnings",earnings());
    }
    
}
