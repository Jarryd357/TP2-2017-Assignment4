/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class DIPPrincipleViolateB 
{
    //Calculate VAT class
    
    public DIPPrincipleViolateB()
    {
        
    }
    
    //Using concrete class instantiation as opposed to abstraction
    
    public double calcVAT()
    {    
        int VAT = 12;
        DIPPrincipleViolateA a = new DIPPrincipleViolateA();
        a.setNum1(500);
        a.setNum2(200);
        
        return(a.add(a.getNum1(),a.getNum2()) * (VAT/100));
    }
}
