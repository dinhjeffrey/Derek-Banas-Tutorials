/**
 * Created by Jeffrey on 12/30/15.
 */
public class JavaLesson15
    /* cover interfaces, abstract classes, abstract methods and more.

    You need interfaces and abstract classes because Java doesn't allow you to inherit from more than one other class.
    You would use an interface when you want to force the user of the interface to create every method in the interface.

    You use an abstract method when you need some flexibility.
     */
{
    public static void main(String[] args)
    {
        Vehicle car = new Vehicle(4,100.00);

        System.out.println("Cars Max Speed " + car.getSpeed());
        System.out.println("Num of Wheels " + car.getWheels());

        car.setCarStrength(10);
        System.out.println("Strength: " + car.getCarStrength());
    }
}
