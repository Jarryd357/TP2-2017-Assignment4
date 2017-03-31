/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package OOPPrinciples;

public class PolyExampleSub2 extends PolyExampleSuper
{
    @Override
    public String isCarnivore()
    {        
        super.isCarnivore();
        //System.out.print(" This animal can also swim!");
        String carnivore = " This animal can also swim!";
        System.out.print(carnivore);
        return (super.isCarnivore() + carnivore);
    }
}
