/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class CRPPrincipleViolateSub extends CRPPrincipleViolateSuper
{
    //Carnivore class
    public String animalEats;
    
    public CRPPrincipleViolateSub(String animalName, String anmalEats)
    {
        super(animalName);
        this.animalEats = animalEats;
    } 

    public String getAnimalEats() 
    {
        return animalEats;
    }

    public void setAnimalEats(String animalEats) 
    {
        this.animalEats = animalEats;
    }
      
}
