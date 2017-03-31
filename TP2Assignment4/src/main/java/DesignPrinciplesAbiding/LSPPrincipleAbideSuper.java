/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class LSPPrincipleAbideSuper 
{
    //Square class
    protected int width;
    protected int height;
    
    public LSPPrincipleAbideSuper()
    {
        
    }   

    public int getWidth() 
    {
        return width;
    }

    public void setWidth(int width) 
    {
        this.width = width;
        this.height = width;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
        this.width = height;
    }
    
    public int area()
    {
        return(width * height);
    } 
     
}
