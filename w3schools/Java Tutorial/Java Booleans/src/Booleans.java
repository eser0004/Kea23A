public class Booleans {
    public static void main(String[] args) {

        // Boolean Values
        //A boolean type is declared with the boolean keyword and can only take the values true or false

        boolean isJavafun = true;
        boolean isFishTasty = false;
        System.out.println(isJavafun); // outputs true
        System.out.println(isFishTasty); // outputs false
        System.out.println("\n");

        /*
        Boolean Expression
        A Boolean expression returns a boolean value: true or false.

        This is useful to build logic, and find answers.

        For example, you can use a comparison operator,
        such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:
         */

        int x = 10;
        int y = 9;
        System.out.println(x > y);  // returns true, because x(10) is greater than y(9)

       /*     Operator	Name	                            Example
                ==	    Equal to	                        x == y
                !=	    Not equal	                        x != y
                >	    Greater than	                    x > y
                <	    Less than	                        x < y
                >=	    Greater than or equal to	        x >= y
                <=	    Less than or equal to	            x <= y

        */

        System.out.println(10 > 9); // even easier, returns true, because 10 is greater than 9
        System.out.println("");

        // In the examples below, we use the equal to (==) operator to evaluate an expression

        int x1 = 10;
        System.out.println((x1 == 10) + " - returns true, because the value of x1 is equal to 10");
        // returns true, because the value of x is equal to 10

        System.out.println((10 == 15) + " - returns false, because 10 is not equal to 15");
        // returns false, because 10 is not equal to 15
        System.out.println("");

        /*
        Real Life Example
        Let's think of a "real life example" where we need to find out if a person is old enough to vote.
        In the example below,
        we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit,
        which is set to 18.
         */

        int myAge = 25; // age is over voting age, so it will print "Old enough to vote!"
        int votingAge = 18;
        System.out.println((myAge >= votingAge) + " - myAge is greater or equal to the voting age, so true");
        System.out.println("");

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else  {
            System.out.println("Not old enough to vote!");

        }

    }
}
