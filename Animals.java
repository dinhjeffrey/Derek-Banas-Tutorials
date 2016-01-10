/**
 * Created by Jeffrey on 12/29/15.
 */
public class Animals
{
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName)
    // want copies to access this method we use "protected"
    // method right here can't be change by other subclasses
    {
        this.name = newName;
    }
    protected final String getName()
    {
        return this.name;
    }
    public void eatStuff()
    {
        System.out.println("Yum " + favFood);
    }
    public void walkAround()
    {
        System.out.println(this.name + " walks around");
    }
    public Animals(){}
    public Animals(String name, String favFood)
    {
        this.changeName(name);
        this.favFood = favFood;
    }
}
