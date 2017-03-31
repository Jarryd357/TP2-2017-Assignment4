/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package OOPPrinciples;

public class InheritanceExampleSub extends InheritanceExampleSuper
{
    protected String Department;
    protected String JobTitle;
    
    public InheritanceExampleSub(String employeeNumber, String employeeName, int floorNumber, String Department, String JobTitle)
    {
        super(employeeNumber, employeeName, floorNumber);
        this.Department = Department;
        this.JobTitle = JobTitle;       
    } 

    public String getDepartment() 
    {
        return Department;
    }

    public void setDepartment(String Department) 
    {
        this.Department = Department;
    }

    public String getJobTitle() 
    {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) 
    {
        this.JobTitle = JobTitle;
    }
     
}
