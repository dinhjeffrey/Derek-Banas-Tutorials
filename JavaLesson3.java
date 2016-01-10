/**
 * Created by Jeffrey on 11/25/15.
 */
public class JavaLesson3
{

    public static void main(String[] args)
    {
        int randomNumber = (int) (Math.random() * 50);

        /* Relational Operators:
         Java has 6 relational operators
         > : Greater than
         < : Less than
         == : Equal to
         != : Not equal to
         >= : Greater than or equal to
         <= : Less than or equal to
         */

        if (randomNumber < 25)
        {
            System.out.println("The random number is less than 25");
        }
        else if (randomNumber >40)
        {
            System.out.println("The random number is greater than 40");
        }

        /* Logical Operators:
        Java has 6 logical operators
        ! : Converts the boolean value to its right to its opposite
        & : Returns true if boolean value on the right and left are
        && : Returns true if boolean value on the right and left are
        | : Returns true if either boolean value on the right or left
        || : Returns true if either boolean value on the right or left
        ^ : Returns true if there is 1 true and 1 false boolean value
         */
        if (!(false))
        {
            System.out.println("\nStatement is True so don't JUDGE!!");
        }
        if ((true) && (true))
        {
            System.out.println("\t Statement is True and Pokemon don't JUDGE.");
        }
        if ((true) | (false))
        {
            System.out.println("\n | is an or statement so if either is the case, true or false, it will print this. Don't Judge.");
        }
        if ((false) ^ (true))
        {
            System.out.println("^ is 'X or statement'. only evaluates if 1 is true and 1 is false");
        }

        System.out.println("The random number is " + randomNumber+ "\n\n\n");

        int valueOne = 1;
        int valueTwo = 2;

        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        /*this simply means that if valueOne > valueTwo is true, I want you to assign valueOne to biggestValue.
        If it is not true, I want you to assign valueTwo to biggestValue.
         */

        System.out.println(biggestValue);

        char theGrade = 'c';

        switch (theGrade) //use switch when you have a limited number of possible values
        {
            case 'A':
            case 'a':
                System.out.println("Great job");
                break; //stops checking from there on. Stop using switch statement and jump down under it
            case 'B':
            case 'b':
                System.out.println("Good job");
                break;
            case 'C':
            case 'c':
                System.out.println("Ok");
                break;
            case 'D':
            case 'd':
                System.out.println("Bad");
                break;
            default:
                System.out.println("You Fail");
                break;


        }
    }
}
