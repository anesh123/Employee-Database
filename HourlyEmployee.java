/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_hierarchy;

/**
 *
 * @author iar5052
 */
public class HourlyEmployee extends Employee_Hierarchy{
    private double hourlyWage;
    private double hoursWorked;
    
    public HourlyEmployee(String firstName, String lastName,String socialSecurityNumber,double hourlyWage, double hoursWorked){
        super(firstName, lastName, socialSecurityNumber);
                
                if(hourlyWage<=0.0)
                
                    throw new IllegalArgumentException("Hourly wage must be greater than 0");
        if (hoursWorked <=0.0 || hoursWorked > 168 )
            
            throw new IllegalArgumentException("Hours worked must be greater than 0 and less than 168 ");
                
        this.hourlyWage=hourlyWage;
        this.hoursWorked=hoursWorked;
               
    }
    public double getHourlyWage(){
        return hourlyWage;
    }
    
    public void setHourlyWage(double hourlyWage){
        if(hourlyWage<=0.0)
        
            throw new IllegalArgumentException("Hourly wage must be greater than 0");
            this.hourlyWage=hourlyWage;
        
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    
    public void setHoursWorked(double hoursWorked)
    {
        if(hoursWorked<=0.0 || hoursWorked>168)
        {
            throw new IllegalArgumentException("Hourly wage must be greater than 0 and less than 168 ");
        }
        this.hoursWorked=hoursWorked;
    }
    
    public double earnings(){
        double earnings;
        if(getHoursWorked()>40)
            earnings=40*getHourlyWage()+(getHoursWorked()-40)*getHourlyWage()*1.5;
        else 
            earnings=getHoursWorked()*getHourlyWage();
        return earnings;
            
        
    }

@Override
public String toString(){

return String.format("%s: %s %s %s: %s%n %s: %.2f%n %s: %.2f%n %s:%.2f%n ", "Hourly Employee",getFirstName(),getLastName(),"with ssn", getSocialSecurityNumber(),"Hourly Wage",getHourlyWage(),"Hours Worked",getHoursWorked(),"Earnings",earnings());
}
}