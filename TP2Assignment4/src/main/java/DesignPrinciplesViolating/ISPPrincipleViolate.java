/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package DesignPrinciplesViolating;


public class ISPPrincipleViolate implements ISPPrincipleViolateInterface
{
    //Rectangle class
    public int length;
    public int width;
    
    public ISPPrincipleViolate()
    {
        
    }
    
    @Override
    public int perimeter(int length, int width)
    {
        return (2 * (length + width));
    }
    
    @Override
    public double circumference(int diamater, double pi)
    {
        return 0;   //Circumference not used for rectangle, but needed due to fat interface
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
