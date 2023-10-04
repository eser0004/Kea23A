package JavaMethods;public class JavaMethod {

        /*
        A method is a block of code which only runs when it is called.

        You can pass data, known as parameters, into a method.

        Methods are used to perform certain actions, and they are also known as functions.

        Why use methods? To reuse code: define the code once, and use it many times.
         */

        static void myMethod() {
            // Code to be executed

        // 1. myMethod() is the name of the method
        // 2. static means that the method belongs to the Main class and not an object of the Main class.
        // 3. void means that this method does not have a return value.

            /*
         Call a Method
         To call a method in Java, write the method's name followed by two parentheses () and a semicolon;

         In the following example, myMethod() is used to print a text (the action), when it is called:

          */

            System.out.println("I just got executed!");
            System.out.println("");
        }
        static void mySecondMethod() {
            String[] names = {"Eser", "Emre", "Khalid", "Mo"};
            for (String i : names) {
                System.out.println(i);
                System.out.println("");
            }

        }


        static void myMultidimensionalArray() {
            int[][] myNums = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < myNums.length; ++i) {
                for (int j = 0; j < myNums[i].length; ++j) {
                    System.out.println(myNums[i][j]);
                }
            }
        }

    public static void main(String[] args) {
        myMethod(); // Outputs "I just got executed!"
        mySecondMethod(); // Outputs all elements in my String Array called names
        myMultidimensionalArray(); //Outputs my multidimensional array
    }
    }
