/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class SRPPrinciple 
{
    public int num1;
    public int num2;
    
    public SRPPrinciple()
    {
        
    }
    
    //class has one purpose i.e. add 2 numbers
    
    public int add(int num1, int num2)
    {
        return(num1 + num2); 
    }        

    public int getNum1() 
    {
        return num1;
    }

    public void setNum1(int num1) 
    {
        this.num1 = num1;
    }

    public int getNum2() 
    {
        return num2;
    }

    public void setNum2(int num2) 
    {
        this.num2 = num2;
    }
      
}
