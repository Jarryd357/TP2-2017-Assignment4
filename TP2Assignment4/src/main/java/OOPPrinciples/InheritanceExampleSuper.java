/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package OOPPrinciples;


public class InheritanceExampleSuper 
{
    protected String employeeNumber;
    protected String employeeName;
    protected int floorNumber;
    
    public InheritanceExampleSuper(String employeeNumber, String employeeName, int floorNumber)
    {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.floorNumber = floorNumber;
    }

    public String getEmployeeNumber() 
    {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) 
    {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) 
    {
        this.employeeName = employeeName;
    }

    public int getFloorNumber() 
    {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) 
    {
        this.floorNumber = floorNumber;
    }
    
}
