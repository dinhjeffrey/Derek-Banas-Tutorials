/**
 * Created by Jeffrey on 12/7/15.
 */
import java.util.Arrays;
/*
Basic class definition
public means this class can be used by other classes
Class names should begin with a capital letter
A file can't contain two public classes. It can contain classes that are not public
If you place class files in the same folder the java compiler will be able to find them

 */
public class MonsterTwo
{
    static char [][] battleBoard = new char[10][10]; //created an array

    public static void buildBattleBoard()
    {
        for(char[] row : battleBoard) //populate arrays. char[] - individual cells. row - individual stars that go into these cells. battleBoard - arrays itself
        {
            Arrays.fill(row, '*'); //puts stars in cells
        }
    }
    public static void redrawBoard()
    {
        int k = 1; //handles line at the top
        while(k <= 30) { System.out.print('-'); k++; }
        System.out.println();

        for (int i = 0; i < battleBoard.length; i++) //handles all the lines and stars inside our battleBoard
        {
            for(int j = 0; j < battleBoard[i].length; j++) //figures out length of battleBoard
            {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println(); //need a new line a the end of the row
        }
        k = 1; //handles line across the bottom
        while(k <= 30) { System.out.print('-'); k++; }
        System.out.println();
    }

    //Class Variables or Fields
    //You declare constants with final

    public final String TOMBSTONE = "Here Lies a Dead Monster.";

    private int health = 500; //fields
    private int attack = 20;
    private int movement = 2;
//    private int xPosition = 0;
//    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPosition = 0;
    public int yPosition = 0;
    public static int numOfMonsters = 0;

    public int getAttack() //(accessor methods) find out what attack value is without going in and accessing it. still keep fields protected.
    {
        return attack;
    }
    public int getMovement()
    {
        return movement;
    }
    public int getHealth()
    {
        return health;
    }
    public boolean getAlive()
    {
        return alive;
    }
    public void setHealth(int decreaseHealth)
    {
        health = health - decreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }
    public void setHealth(double decreaseHealth)
        /*overloaded methods. 2 setHealth - it handles double values if they are sent.
    can have as many as long as attribute are different
    attribute are booleans, int, doubles, etc.
    */
    {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health < 0)
        {
            alive = false;
        }
    }
    public MonsterTwo(int health, int attack, int movement, String name)
    /*constructor - set up function/method. only executed once when the object is created. must have same name as the class
    can change blueprint of class or keep it the same.
    in this case we are creating a new Monster with different health, attack, movement.
     */
    {
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.name = name;
        int maxXBoardSpace = battleBoard.length - 1; //9
        int maxYBoardSpace = battleBoard[0].length - 1; //9

        int randNumX, randNumY; //random generator to place where monsters spawn

        do
        {
            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[randNumX][randNumY] != '*'); //only allow monsters to occupy space with star on it (not on another monster)
        this.xPosition = randNumX; //assign position to the monsters
        this.yPosition = randNumY;

        this.nameChar1 = this.name.charAt(0); //gets the first initial of the name

        battleBoard[this.yPosition][this.xPosition] = this.nameChar1;

        numOfMonsters++; //track how many monsters there are. if we ran through this constructor, there is 1 more new monster.


        /*
        If the attributes had the same names as the class health, attack, movement
        You could refer to the objects fields by proceeding them with 'this'
        this.health = health;
        this.attack = attack;
        objectFieldName = attributeFieldName;
         */
    }
    public MonsterTwo() //overloading constructor. if you don't define constructor, java defines public Monster(){} as default constructor.
    {

    }
//    public Monster(int newHealth)
//    {
//        health = newHealth;
//    }
//    public Monster(int newHealth, int newAttack)
//    {
//        this(newHealth); //can call the newHealth by using this(newHealth).
//        attack = newAttack;
//    }
    public static void main(String[] args)
    {
        MonsterTwo Frank = new MonsterTwo();

        System.out.println(Frank.attack); //can print out a private field because we're inside of the class
    }
}
