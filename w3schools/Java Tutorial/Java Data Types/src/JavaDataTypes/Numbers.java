package JavaDataTypes;

public class Numbers {
    public static void main(String[] args) {

        /*
        Primitive number types are divided into two groups:

        Integer types, which stores whole numbers. Positive or negative, with no decimals.
        Such valid types are:
        - byte, short, int & long.

        Floating point types, which are numbers containing one or more decimals.
        There are two types:
        - float & double

        The most used types for whole numbers are "int" and for floating point numbers is "double".



         */

        byte myByte = 110;   // a Byte can only store numbers from -128 to 127
        System.out.println(myByte);
        System.out.println("");

        short myShort = 30000;  // a Short can store whole numbers from -32.768 to 32.767
        System.out.println(myShort);
        System.out.println("");

        int myInt = 2000000000;     // int can store whole numbers from -2147483648 to 2147483647
        System.out.println(myInt);
        System.out.println("");

        long myLong = 150000000000000000L; //  stores whole numbers from -9223372036854775808 to 9223372036854775807
        // Only used when int isn't large enough. Remember to end the value with an "L".

        /*
        Here comes the floating point types, you only use them when u need a number with a decimal such as
        9.99 or 3.14515.

         */

        float myFloat = 12.62f;     //end value with f with float
        System.out.println(myFloat);
        System.out.println("");

        double myDouble = 35.88d;       //end value with d when it's double
        System.out.println(myDouble);
        System.out.println("");


        // Scientific numbers, a floating point number can also be scientific with an "e" to indicate the power of 10:

        float f1 = 35e3f;   // the 3f indicates how many zeroes after 35*10 will be displayed
        double d1 = 12E4d;  //likewise same here.
        System.out.println(f1);
        System.out.println(d1);

    }
}
