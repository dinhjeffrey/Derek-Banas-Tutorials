/**
 * Created by Jeffrey on 12/29/15.
 */
public class Cats extends Animals
    // inheritance. Cats is a subclass of Animals.
{
    public String favToy = "Yarn";
    public void playWith()
    {
        System.out.println("Yeah " + favToy);
    }
    public void walkAround()
    {
        System.out.println(this.getName() + " stalks around");
    }
    public String getToy()
    {
        return this.favToy;
    }
    public Cats(){}
    public Cats(String name, String favFood, String favToy)
    {
        super(name, favFood);
        this.favToy = favToy;
    }
}
