/**
 * Created by Jeffrey on 12/9/15.
 */
import java.util.Arrays;

public class JavaLesson9
{
    public static void main(String[] args)
    {
        int[] randomArray; // integer array

        int[] numberArray = new int[10]; // how big your array is. have 10 values in it

        randomArray = new int[20]; // declare how big it is; 20.
        randomArray[1] = 2; // in index 1, you give it value of 2.

        String[] stringArray = {"just", "random", "words"}; //string array that you declare have 3 items

        for(int i = 0; i < numberArray.length; i++)
        {
            numberArray[i] = i; // i is iterator that continues to change. set value of i to the index i of array.
        }
        int k = 1;
        while(k <= 41) {System.out.print('-'); k++;}
        System.out.println();

        for(int j = 0; j < numberArray.length; j++)
        {
            System.out.print("| " + j + " ");
        }
        System.out.println('|');

        /* MultiArray
         */

        String[][] multiArray = new String[10][10]; // [column] [row]

        for(int i = 0; i< multiArray.length; i++) // how long is our column; 10.
        {
            for(int j = 0; j < multiArray[i].length; j++) // row
            {
                multiArray[i][j] = i + " " + j;
            }
        }
        k = 1;
        while(k <= 61) {System.out.print('-'); k++;}
        System.out.println();

        for(int i = 0; i< multiArray.length; i++) // how long is our column; 10.
        {
            for(int j = 0; j < multiArray[i].length; j++)
            {
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println();
        }
        k = 1;
        while(k <= 61) {System.out.print('-'); k++;}
        System.out.println();

        /* enhanced for loop to print out array values
         */

        for(int row : numberArray)
       /* row is temporary placeholder, hold values as you chuck them out of array.
        numberArray is array we defined. int[] numberArray = new int[10];
        */
        {
            System.out.print(row);
        }
        System.out.println("\n");

        /*
        enhanced 'for' loop for multiArrays
         */

//      for(dataType[]varForRow : arrayName). This is what is happening below.
        for(String[] rows : multiArray) // row stays the same
        {
  //        for(dataType(String) varForColumn : arrayName). This is happening below.
            for(String column : rows) // column changes
            {
                System.out.print("| " + column + " "); // column is storing the string we want to print to screen.
            }
            System.out.println("|");
        }
        /*
        copyOf is a method we imported
         */
        int[] numberCopy = Arrays.copyOf(numberArray, 5); // copy the first 5 elements.
        for(int row : numberCopy)
        {
            System.out.print(row);
        }
        System.out.println("\n");

//        Array.copyOfRange(numberArray, 3, 6); // copy the element starting at 3 and ending at 6.

        System.out.println(Arrays.toString(numberCopy));

        int[] moreNumbers = new int[100]; // integer array.
        Arrays.fill(moreNumbers, 2); // put value of 2 in every item of array moreNumbers

//        char[][] boardGame = new char[10][10];
//        for(char[] row : boardGame)
//        {
//            Arrays.fill(row,'*');
//        }
        int[] numsToSort = new int[10];

        for(int i = 0; i < 10; i++)
        {
            numsToSort[i] = (int) (Math.random() * 100); // 0-99
        }
        Arrays.sort(numsToSort);

        System.out.println(Arrays.toString(numsToSort));

        int whereIs50 = Arrays.binarySearch(numsToSort, 50);

        System.out.println(whereIs50); // it may not exist so it will spit out a negative value.
    }
}
