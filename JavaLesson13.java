/**
 * Created by Jeffrey on 12/19/15.
 */
import java.util.Arrays;

public class JavaLesson13
{
    public static void main(String[] args)
    {
        String randomString = "I'm just a randomstring";

        String gotToQuote = "He said, \"I'm here\""; // does not include "I'm here"

        int numTwo = 2;

        System.out.println(randomString + " " + gotToQuote);

        String uppercaseStr = "BIG";
        String lowercaseStr = "big";

        if(uppercaseStr.equals(lowercaseStr))
        {
            System.out.println("They're equal");
        }
        String letters = "abcde";
        String moreLetters = "fghjk";

//        System.out.println("2nd char: " + letters.charAt(1));
//
//        System.out.println(letters.compareTo(moreLetters)); // if letters comes before moreLetters, will return negative value. depends on how many letters before
//
//        System.out.println(letters.contains("abc")); // boolean
//
//        System.out.println(letters.endsWith("de"));
//
//        System.out.println(letters.indexOf("cd")); // start index
//
//        System.out.println("Length: " + letters.length());
//
//        System.out.println(letters.replace("abc", "xy"));
//
//        String[] letterArray = letters.split("");
//
//        System.out.println(Arrays.toString(letterArray)); // still leaves a space in front of a for some reason, so we use char.
//
//        char[] charArray = letters.toCharArray();
//
//        System.out.println(Arrays.toString(charArray));
        String randString = "      abfgfhfj     ";

        StringBuilder randSB = new StringBuilder("A random value");

        System.out.println(randSB.append(" again")); // adds "again" to the end of randSB and changes the value of SB.

        System.out.println(randSB);

        System.out.println(randSB.delete(15,21)); // deletes parts of SB and changes value of SB.

        System.out.println(randSB);

        System.out.println(randSB.capacity()); // whenever you create StringBuilder, it gives you an amount of space.
        // call capacity to tell you how much space you have in memory
        randSB.ensureCapacity(60); // gives a capacity of at least 60, can be bigger

        System.out.println(randSB.capacity());

        randSB.trimToSize(); // trims capacity to size of used String.

        System.out.println(randSB.capacity());

        System.out.println(randSB.insert(1, "nother"));

        String oldSB = randSB.toString();
    }
}
