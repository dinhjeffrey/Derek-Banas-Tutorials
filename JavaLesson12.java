/**
 * Created by Jeffrey on 12/16/15.
 */
import java.util.Arrays;
import java.util.LinkedList;

public class JavaLesson12
{
    public static void main(String[] args)
    {
        LinkedList linkedListOne = new LinkedList();

        LinkedList<String> names = new LinkedList<String>();

        names.add("Ahmed Bennani");
        names.add("Ali Syed");

        names.addLast("Nathan Martin"); // is a method

        names.addFirst("Joshua Smith");

        names.add(0, "Noah Peeters");

        names.set(2, "Paul Newman");

        names.remove(4);
        names.remove("Joshua Smith");

        for(String name : names) // enhanced for loop. "names" is the array
        {
            System.out.println(name);
        }
        System.out.println("\nFirst Index: " + names.get(0));

        System.out.println("\nLast Index: " + names.getLast());

        LinkedList<String> nameCopy = new LinkedList<String>(names);

        System.out.println("\nnameCopy: " + nameCopy);

        if(names.contains("Noah Peeters"))
        {
            System.out.println("\nNoah is here. Don't Judge.");
        }
        if(names.containsAll(nameCopy))
        {
            System.out.println("\nCollections the Same");
        }
        System.out.println("\nAli index at: " + names.indexOf("Ali Syed"));

        System.out.println("\nList Empty: " + names.isEmpty());

        System.out.println("\nHow Many: " + names.size());

        System.out.println("\nLook without Error: " + names.peek()); // peek checks if a value retrieve at the first element. if not returns null. it returns Noah Peeters here.

        System.out.println("\nRemove first element: " + nameCopy.poll()); // poll takes first element, prints it out, then deletes it

        System.out.println("\nRemove last element: " + nameCopy.pollLast()); // same as poll but for last element

        nameCopy.push("Noah Peeters"); // push a new value into the front of the list
        nameCopy.pop(); // chops off the first element

        for(String name : nameCopy)
        {
            System.out.println(name);
        }
        Object[] nameArray = new Object[4];

        nameArray = names.toArray();

        System.out.println(Arrays.toString(nameArray));

        names.clear();

    }
}
