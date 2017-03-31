/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesAbiding;


public class ISPPrincipleAbide implements ISPPrincipleAbideInterfaceA
{
    //Rectangle class
    public int length;
    public int width;
    
    public ISPPrincipleAbide()
    {
        
    }
    
    @Override
    public int perimeter(int length, int width)
    {
        return (2 * (length + width));  //One abstract method from lean interface
    }
           
    public int getLength() 
    {
        return length;
    }

    public void setLength(int length) 
    {
        this.length = length;
    }

    public int getWidth() 
    {
        return width;
    }

    public void setWidth(int width) 
    {
        this.width = width;
    }
}
