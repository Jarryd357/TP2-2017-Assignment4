/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class CRPPrincipleAbideSub extends CRPPrincipleAbideSuper
{
    //Carnivore class
    public String animalEats;
    
    public CRPPrincipleAbideSub(String animalName, String animalEats)
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
