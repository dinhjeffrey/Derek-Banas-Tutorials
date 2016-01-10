/**
 * Created by Jeffrey on 12/5/15.
 */
//import java.util.*;
    import java.io.*;

public class JavaLesson6
/*exception and exception handling
exception is an object that is created when an error occurs
exception itself tells you specifically what error occurred
 */


{
//    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
//        divideByZero(2);
//        System.out.print("How old are you? ");
//        int age = checkValidAge();
//
//        if (age != 0)
//        {
//            System.out.println("You are " + age + " years old.");
//        }
//        getAFile("./somestuff.txt");
    }
    public static void getAFile(String fileName) throws IOException, FileNotFoundException //throws exception back to main.
    {
//        try
//        {
//            FileInputStream file = new FileInputStream(fileName);
//        }
//        catch(FileNotFoundException e) //most specific exception first.
//        {
//            System.out.println("Sorry can't find that file. Don't judge.");
//        }
//        catch(IOException e) //more general exception second.
//        {
//            System.out.println("Unknown IO Error.");
//        }
////        catch(ClassNotFoundException | IOException e) {} //catches exception and ignores it. catches ClassNotFoundException and IOException.
//
//        catch(Exception e) //catches every single error.
//        {
//            System.out.println("Some error occurred.");
//        }
//        finally //runs no matter what. if there is exception or not. It is used for clean up duty. close any exceptions, etc.
//        {
//            System.out.println("");
//        }


    }
//    public static int checkValidAge()
//    {
//        try
//        {
//            return userInput.nextInt();
//        }
//        catch (InputMismatchException e)
//        {
//            userInput.next(); //skips over what the user inputted and moves on
//            System.out.println("That isn't a whole number.");
//            return 0; //method is int (not void) so we have to return something.
//
//        }
//    }
////    public static void divideByZero(int a)
////    {
////        try
////        {
////            System.out.println(a / 0);
////
////        }
////        catch (ArithmeticException e)
////        {
////            System.out.println("You can't do that. Don't Judge.");
////
////            System.out.println(e.getMessage());
////
////            System.out.println(e.toString());
////
////            e.printStackTrace();
////        }
////    }

}
