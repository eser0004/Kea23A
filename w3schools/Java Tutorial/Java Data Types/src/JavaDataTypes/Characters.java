package JavaDataTypes;

public class Characters {
    public static void main(String[] args) {
        // char is used to store a single character, and must be surrounded by single quotes ' '.

        char myGrade = 'A';
        System.out.println(myGrade);
        System.out.println("");


        /*
    Can also be used to display ASCII values:
    ASCII stands for the "American Standard Code for Information Interchange".
    ASCII is a 7-bit character set containing 128 characters.
    It contains the numbers from 0-9, the upper and lower case English letters from A to Z, and some special characters.

    https://www.w3schools.com/charsets/ref_html_ascii.asp     ASCII printable character list

         */

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        /*
        On the ASCII char list, 65 is the Value of uppercase A, 66 = B, 67 = C
        if printing them individually as chars, it should print A, B and C
        but if you add them together in 1 sout, it will just give the sum of 65 + 66 + 67
         */
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
        System.out.println(myVar1 + myVar2 + myVar3);

        System.out.println("");

        //String stores a sequence of characters (text) and must be surrounded by double quotes " ".
        String welcomeGreeting = "Hello & Welcome sir!";
        System.out.println(welcomeGreeting);
    }
}
