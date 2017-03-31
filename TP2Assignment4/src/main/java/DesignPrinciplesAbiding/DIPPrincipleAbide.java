/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class DIPPrincipleAbide implements DIPPrincipleInterface
{
    public double item1Cost;
    public double item2Cost;
    
    public DIPPrincipleAbide()
    {
        
    } 
    
    //Making use of interface and abstract method over concrete instantiation
    
    @Override
    public double add(double item1Cost, double item2Cost)
    {
        return(item1Cost + item2Cost);
    }       
     
}
