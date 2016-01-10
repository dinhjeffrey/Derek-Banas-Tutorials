/**
 * Created by Jeffrey on 12/14/15.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLesson11
{
    public static void main(String[] args)
    {
        ArrayList arrayListOne; // create an arraylist variable

        arrayListOne = new ArrayList(); // create an arraylist object

        ArrayList arrayListTwo = new ArrayList(); // create an arraylist all in one line

        ArrayList<String> names = new ArrayList<String>(); // arraylist that only accepts strings

        names.add("John Smith");
        names.add("mohamed Alami");
        names.add("Oliver Miller");

        names.add(2, "Jack Ryan"); // @ index 2, it will add Jack Ryan

        names.set(0, "John Adams"); // replaces a value within an arraylist

        names.remove(3);

        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }
        // names.removeRange(0, 1);

        System.out.println(names);

        for(String i : names) // enhanced for loop changes arraylist to string
        {
            System.out.println(i);
        }
        Iterator indivItems = names.iterator(); // creates an iterator object

        while(indivItems.hasNext()) /* before enhanced for loop, always done this way.
        hasNext is an iterator object method (any additional object need to do stuff with).
        boolean value will keep printing until false, nothing next to print.
        */
        {
            System.out.println(indivItems.next());
        }
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names);

        String paulYoung = "Paul young";

        names.add(paulYoung);

        if(names.contains(paulYoung))
        {
            System.out.println("Paul is here");
        }
        if(names.containsAll(nameCopy))
        {
            System.out.println("Everything in nameCopy is in names " + nameCopy + " " + names);
        }
        /*
        copied names to nameCopy
        added to names
         */
        names.clear();

        if(names.isEmpty())
        {
            System.out.println("ArrayList is Empty");
        }
        Object[] moreNames = new Object[4];
        moreNames = nameCopy.toArray();

        System.out.println(Arrays.toString(moreNames));
    }
}
