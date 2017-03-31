/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

import OOPPrinciples.EncapsulationExample;
import OOPPrinciples.InheritanceExampleSub;
import OOPPrinciples.PolyExampleSub;
import OOPPrinciples.PolyExampleSub2;
import OOPPrinciples.PolyExampleSuper;
import InheritanceAlternative.CompositionExample;

public class OOPPrinciplesMain 
{
    public static void main(String [] args)
    {                
        EncapsulationExample ee = new EncapsulationExample();
        InheritanceExampleSub ies = new InheritanceExampleSub("01556F","Mordin",15,"R&D","Head Technician");
        PolyExampleSuper pes = new PolyExampleSub();
        PolyExampleSuper pes2 = new PolyExampleSub2();
        CompositionExample ce = new CompositionExample();
        
        System.out.print("Encapsulation Example:");               
        ee.setName("Sara Ryder");
        ee.setAge(26);
        ee.setAddress("04 Andromeda Drive");      
        System.out.print("\nName: " + ee.getName() + "\nAge: " + ee.getAge() + "\nAddress: " + ee.getAddress());
        
        System.out.print("\n");
        
        System.out.print("\nInheritance Example:");
        System.out.print("\nFrom Super: EmpNum - " + ies.getEmployeeNumber() + " EmpName - " + ies.getEmployeeName() + " Floor - " + ies.getFloorNumber());
        System.out.print("\nFrom Sub: Dept - " + ies.getDepartment() + " Job Title - " + ies.getJobTitle());
        
        System.out.print("\n");
        
        System.out.print("\nPolymorphism Example:");
        System.out.print("\n");
        pes.isCarnivore();
        System.out.print("\n");
        pes2.isCarnivore();
        
        System.out.print("\n");
        
        System.out.print("\nComposition Example:");
        ce.setPlayerName("Sadio Mane");
        ce.setTeam("Liverpool");
        ce.setPosition("Winger");
        System.out.print("Player Name: " + ce.getPlayerName() + "\nTeam: " + ce.getTeam() + "\nPosition: " + ce.getPosition());
    }
    
}
