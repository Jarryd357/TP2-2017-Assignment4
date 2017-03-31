/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class LSPPrincipleAbideSub extends LSPPrincipleAbideSuper
{
    public LSPPrincipleAbideSub()
    {
        
    }
    
    //Rhombus class, same calculation for area as Square
    //Sub class can now be instantiated as super as well
    
    public void setWidth(int width) 
    {
        this.width = width; 
        this.height = width;    
    }
    
    public void setHeight(int height) 
    {
        this.height = height;
        this.width = height;
    }
    
}
