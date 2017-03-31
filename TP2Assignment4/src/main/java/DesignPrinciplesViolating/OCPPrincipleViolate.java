/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class OCPPrincipleViolate 
{
    public OCPPrincipleViolateSub1 a;
    public OCPPrincipleViolateSub2 b;
    
    public OCPPrincipleViolate()
    {
        
    }   
    
    public void eatMeat(OCPPrincipleViolateSub1 a)
    {
        System.out.print("Eating meat!");
    }
    
    public void eatPlants(OCPPrincipleViolateSub2 b)
    {
        System.out.print("Eating plants!");
    } 
    
    //Adding new sub class would require new method to be created i.e. changes needed
    
    public void eat(OCPPrincipleViolateSuper o)
    {
        if(o.animalType == "carnivore")
            eatMeat(a);
        else if(o.animalType == "herbivore")
           eatPlants(b);
    }    
        
}
