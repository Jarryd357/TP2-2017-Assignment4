/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class CRPPrincipleAbide 
{
    //Make use of polymorphism over inheritance
    public void animalList()
    {
        CRPPrincipleAbideSuper c = new CRPPrincipleAbideSub("Falcon","Meat");
        CRPPrincipleAbideSuper c2 = new CRPPrincipleAbideSub("Giraffe","Leaves");
    }        
}
