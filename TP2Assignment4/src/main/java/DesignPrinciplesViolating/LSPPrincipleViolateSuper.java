/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class LSPPrincipleViolateSuper 
{
    //Rectangle class
    protected int width;
    protected int height;
    
    public LSPPrincipleViolateSuper()
    {
        
    }

    public int getWidth() 
    {
        return width;
    }

    public void setWidth(int width) 
    {
        this.width = width;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }
    
    public int area()
    {
        return(width * height);
    }        
    
}
