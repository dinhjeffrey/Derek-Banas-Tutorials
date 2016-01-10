/**
 * Created by Jeffrey on 11/26/15.
 */
import java.util.Scanner;
public class JavaLesson4
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {
        //for (declare iterator; conditional statement; change iterator

        for (int z=10; z >=1; z--)
        {
            System.out.println(z);
        }


        int i = 1;

        while(i <= 20)
        {
            if(i == 3)
            {
                i+=2;
                continue;
                /*continue jumps out of this iteration and back to where it left off in the while loop
                skips 3,4 and continues from 5
                 */
            }
            if((i%2) ==0)
            {
                i++;
                //if i is divisible by 2 (even) it adds +1. Trick to get the odd numbers
            }
            if (i>10)
            {
                break;
                //ends the while loop pre-maturely
            }
            i++;
        }
        double myPi = 4.0;

        double j = 3.0;
        //task: 4 - 4/3 + 4/5 - 4/7

        while(j<11)
        {
            myPi = myPi - (4/j) + (4/(j+2));
            j +=4;
            System.out.println(myPi);
        }


        //monitor keyboard input



        String contYorN = "Y";
        //execute a while loop until user says to stop

        int h = 1;

        while (contYorN.equalsIgnoreCase("y"))
            //ignores capital Y or lower case y entered
        {
            //continually increment and print on screen value of h
            //will continue increment and print h if user says y
            contYorN = userInput.nextLine();
            //accept a string from the user and set it equal to contYorN
            h++;

        }

        int k = 1000;

        do //executes at least once for a do-while loop
        {
            k++;
        } while(k<10);





    }
}
