package JavaBreakAndContinue;

public class JavaBreak {
    public static void main(String[] args) {

        /*
        You have already seen the break statement used in an earlier chapter of this tutorial.
        It was used to "jump out" of a switch statement.
        The break statement can also be used to jump out of a loop.

        This example stops the loop when i is equal to 4:
         */
        for (int i = 0; i < 10; i++) { // because of second statement, it can't go beyond 10, look
            if (i == 4) {       // should stop at 3, cause it counts 0, 1, 2, 3
                break;
            }
            System.out.println(i);
        }
    }
}
