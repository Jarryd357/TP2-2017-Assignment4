/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class OCPPrincipleAbide 
{
    public OCPPrincipleAbide()
    {
        
    }
    
    //Uses same eat() method when adding subclass, no changes needed
    
    public void eatMeat(OCPPrincipleAbideSuper o)
    {
        System.out.print(o.eat() + " meat!");
    }        
}
