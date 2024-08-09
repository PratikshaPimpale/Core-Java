/*5. Write a package game which will have 2 classes Indoor & Outdoor. Use a function 
display() to generate the list of player for the specific game. Use default & parameterized 
constructor. */

/*D:game/Indoor.java
package game;
class Indoor
{
    int players;
    String gname;
    public Indoor(String gname,int players)
    {
        this.players=players;
        this.gname=gname;
    }
    public void display()
    {
        System.out.println("Indoor game="+gname);
        System.out.println("No of players="+players);
    }
}*/

/*D:game/Outdoor.java
package game;
class Outdoor
{
    int players;
    String gname;
    public Outdoor(String gname,int players)
    {
        this.players=players;
        this.gname=gname;
    }
    public void display()
    {
        System.out.println("Outdoor game="+gname);
        System.out.println("No of players="+players);
    }
}*/

class MD
{
    public static void main(String arg[])
    {
        Indoor ob1=new Indoor("Caram",4);
        ob1.display();

        Outdoor ob2=new Outdoor("Cricket",9);
        ob2.display();
    }
}