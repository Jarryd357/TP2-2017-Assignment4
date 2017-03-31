/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package OOPPrinciplesTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import OOPPrinciples.EncapsulationExample;
import OOPPrinciples.InheritanceExampleSub;
import OOPPrinciples.PolyExampleSub;
import OOPPrinciples.PolyExampleSub2;
import OOPPrinciples.PolyExampleSuper;


public class OOPPrinciplesTest 
{ 
    public OOPPrinciplesTest() 
    {
        
    }
    
    EncapsulationExample ee = new EncapsulationExample();
    InheritanceExampleSub ies = new InheritanceExampleSub("01556F","Mordin",15,"R&D","Head Technician");
    PolyExampleSuper pes = new PolyExampleSub();
    PolyExampleSuper pes2 = new PolyExampleSub2();
    
    @Test
    public void testEncapsulationName()
    {
        ee.setName("Sara Ryder");
        Assert.assertEquals("Sara Ryder", ee.getName());
    }
    
    @Test
    public void testEncapsulationAge()
    {
        ee.setAge(26);
        Assert.assertEquals(26, ee.getAge(), 0);
    }
    
    @Test
    public void testEncapsulationAddress()
    {
        ee.setAddress("04 Andromeda Drive");
        Assert.assertEquals("04 Andromeda Drive", ee.getAddress());
    }
    
    @Test
    public void testInheritanceEmpNum()
    {
        Assert.assertEquals("01556F", ies.getEmployeeNumber());
    }
    
    @Test
    public void testInheritanceEmpName()
    {
        Assert.assertEquals("Mordin", ies.getEmployeeName());
    }
    
    @Test
    public void testInheritanceFloorNum()
    {
        Assert.assertEquals(15, ies.getFloorNumber(), 0);
    }
    
    @Test
    public void testInheritanceDept()
    {
        Assert.assertEquals("R&D", ies.getDepartment());
    }
    
    @Test
    public void testInheritanceJobTitle()
    {
        Assert.assertEquals("Head Technician", ies.getJobTitle());
    }
    
    @Test
    public void testPolySub01()
    {
        Assert.assertEquals("This animal eats meat! This animal can also fly!", pes.isCarnivore());
    } 
    
    @Test
    public void testPolySub02()
    {
        Assert.assertEquals("This animal eats meat! This animal can also swim!", pes2.isCarnivore());
    }
     
}
