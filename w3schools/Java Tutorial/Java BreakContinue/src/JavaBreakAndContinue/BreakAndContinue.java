package JavaBreakAndContinue;

public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if ( i == 4) {
                break;  // should stop at the 4th value cause of the break statement
            }
        }
        System.out.println("\n");

        int j = 0;
        while (j < 10) {
            if (j == 4) {
                j++;
                continue;
                //it says, if "j" is less than 10, then continue until 4th value, and continue after that too
            }
            System.out.println(j);
            j++;
        }
    }
}
