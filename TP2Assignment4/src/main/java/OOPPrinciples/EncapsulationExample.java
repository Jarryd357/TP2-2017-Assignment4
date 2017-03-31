/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package OOPPrinciples;

public class EncapsulationExample 
{
    private String Name;
    private int Age;
    private String Address;
    
    public EncapsulationExample()
    {
        
    }

    public String getName() 
    {
        return Name;
    }

    public void setName(String Name) 
    {
        this.Name = Name;
    }

    public int getAge() 
    {
        return Age;
    }

    public void setAge(int Age) 
    {
        this.Age = Age;
    }

    public String getAddress() 
    {
        return Address;
    }

    public void setAddress(String Address) 
    {
        this.Address = Address;
    }
  
}
