//Write a program for multilevel inheritance such that country is inherited from
//continent. State is inherited from country. Display the place, state, country
//and continent.

class continent
{
    void continent()
    {
        System.out.println("Continent is Asia !");
    }
    
}
class country extends continent
{
    void country()
    {
        System.out.println("Country is India !");
    }
}
class state extends country
{
    void state()
    {
        System.out.println("State is Maharashtra !");
    }
}
class place extends state
{
    void place()
    {
        System.out.println("This is the place : Malegaon");
    }
}
public class Assn2
{
    public static void main(String[] args)
    {
        place p = new place();
        p.continent();
        p.country();
        p.state();
        p.place();
    }
}
