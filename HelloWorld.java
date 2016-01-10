/**
 * Created by Jeffrey on 11/23/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 2100000000;
        long bigLong = 9220000000000000000L;
        float bigFloat = 3.14F;
        double bigDouble = 3.14823794872734872347923748;

        boolean trueOrFalse = true;

        char randomChar = 64;
        char anotherChar = 'A';

        char escapedChars = '\\';

        String randomString = "I'm a random string";
        String anotherString = "Stuff";

        String andAnotherString = randomString + ' ' + anotherString;

        String byteString = Byte.toString(bigByte);

        double aDoubleValue = 30000000000000.145234;
        int doubleToInt = (int) aDoubleValue;
        //float, boolean, and char don't work

        //parseShort, parseLong, parseByte, parseFloat, parseDouble, parseBoolean

        int stringToInt = Integer.parseInt(byteString);

        System.out.println(stringToInt);

    }
}
