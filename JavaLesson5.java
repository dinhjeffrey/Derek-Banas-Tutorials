/**
 * Created by Jeffrey on 12/2/15.
 */
import java.util.Scanner;

public class JavaLesson5
{
    //static double myPI = 3.14159; //Class Variable: accessible anywhere within this class
    static int randomNumber;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        //addThem(1,2); //call to addThem method
        //System.out.println(addThem(1,2));
//        int d = 5; //in different method than tryToChange(int d)
//        tryToChange(d);
//
//        System.out.println("main d = " + d);
        System.out.println(getRandomNum());

        int guessResult = 1;
        int randomGuess = 0;

        while(guessResult != -1)
        {
            System.out.print("Guess a number between 0 and 50: ");
            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess); //call to method checkGuess
        }
        System.out.println("Yes the random number is " + randomGuess);


    }
    //public static int addThem(int a, int b) //addThem method
    {
        //double smallPI = 3.140; //Local Variable
        //double myPI = 3.0; //this local variable in this method overwrites the class variable
        //myPI = myPI + 3.0; //local variables in methods can overwrite and change value of class variable
        //System.out.println("Local " + myPI);
        //int c = a + b;
        //return c;
    }
//    public static void tryToChange(int d)
//    {
//        d = d + 1;
//        System.out.println("tryToChange d = " + d);
//    }
    public static int getRandomNum()
    {
        randomNumber = (int) (Math.random() * 51); //will give us value between 0-50
        return randomNumber;
    }
    public static int checkGuess(int guess)
    {
        if(guess == randomNumber)
        {
            return -1;
        } else {
            return guess;
        }
    }
}
