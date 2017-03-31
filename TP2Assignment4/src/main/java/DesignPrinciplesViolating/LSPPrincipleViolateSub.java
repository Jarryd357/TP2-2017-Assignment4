/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class LSPPrincipleViolateSub extends LSPPrincipleViolateSuper
{
    //Square class extending rectangle
    
    public LSPPrincipleViolateSub()
    {
        
    }  
    
    //Height and width of square same so set them equal to each other
    //This will alter outcome of area() method when using Rectangle = new Square
    
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
