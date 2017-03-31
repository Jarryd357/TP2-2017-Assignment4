/*
TP Assignment 4 : OOP, Design and Packaging Principles
Jarryd Pretorius
206155247
 */

package InheritanceAlternative;


public class CompositionExample 
{
    private String playerName;
    private String Team;
    private String Position;
    
    public CompositionExample()
    {
        
    }   

    public String getPlayerName() 
    {
        return playerName;
    }

    public void setPlayerName(String playerName) 
    {
        this.playerName = playerName;
    }

    public String getTeam() 
    {
        return Team;
    }

    public void setTeam(String Team) 
    {
        this.Team = Team;
    }

    public String getPosition() 
    {
        return Position;
    }

    public void setPosition(String Position) 
    {
        this.Position = Position;
    }
    
}
