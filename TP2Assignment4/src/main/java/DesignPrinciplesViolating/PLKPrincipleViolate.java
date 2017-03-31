/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class PLKPrincipleViolate 
{
    public void employeeDetails()
    {
        PLKPrincipleViolateA a = new PLKPrincipleViolateA();
        PLKPrincipleViolateB b = new PLKPrincipleViolateB();
        a.setEmployeeNumber("0188");
        a.setName("James");
        a.setPosition(b.getJobTitleName()); //Shouldn't be using methods from other classes
    }        
}
