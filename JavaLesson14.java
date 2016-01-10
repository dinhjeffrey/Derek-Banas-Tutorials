/**
 * Created by Jeffrey on 12/29/15.
 */
public class JavaLesson14 // cover Polymorphism, Inheritance, Protected, Final, Instanceof and a bunch more.
{
    public static void main(String[] args)
    {
        Animals genericAnimal = new Animals();

        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");

        System.out.println();

        System.out.println(morris.getName());
        System.out.println(morris.favFood);
        System.out.println(morris.favToy);

        System.out.println();

        Animals tabby = new Cats("Tabby", "Salmon", "Ball");

        acceptAnimal(tabby);
    }
    public static void acceptAnimal(Animals randAnimal)
    {
        System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println();

        randAnimal.walkAround();
        // polymorphism. there's 2 methods walkaround in animal and cats. java is smart enough to use the more specific one (cats).
        // java knows randAnimal is a cat. Java can find if the method and field is in both class + subclass but not if it is only in the subclass.

        Cats tempCat = (Cats) randAnimal;
        System.out.println(tempCat.favToy);

        System.out.println(((Cats) randAnimal).favToy);

        if(randAnimal instanceof Animals)
        {
            System.out.println(randAnimal.getName() + " is a Cat");
        }

    }
}
