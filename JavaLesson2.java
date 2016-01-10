/**
 * Created by Jeffrey on 11/24/15.
 */
import java.util.Scanner;
//Scanner object allows us to ask our program questions
public class JavaLesson2 {

    static Scanner userInput = new Scanner(System.in);
    //static only allows classes to call this statement to execute

    public static void main(String[] args){
    //void doesn't return

        System.out.print("Your favorite number: ");

        if (userInput.hasNextInt()){
            int numberEntered = userInput.nextInt();

            System.out.println("You entered " + numberEntered + ". Woot!");
        } else {
            System.out.println("Enter an integer next time and DON'T JUDGE!!");
        }

    }

}
