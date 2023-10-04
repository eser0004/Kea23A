package JavaArrays;

public class Arrays {
    public static void main(String[] args) {

        /*
        Arrays are used to store multiple values in a single variable,
        instead of declaring separate variables for each value.
        */


        //  To declare an array, define the variable type with square brackets:
        //We have now declared a variable that holds an array of strings.
        //To insert values to it, you can place the values in a comma-separated list, inside curly braces:


         String[] names = {"Eser", "Emre", "Khalid", "Mo"};
        System.out.println(names[0]);   //outputs Eser


        // Access the Elements of an Array
        //You can access an array element by referring to the index number.
        //This statement accesses the value of the 2nd element in cars:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); //Outputs BMW, Index [0] Would putput Volvo, 2 = Ford, 3 = Mazda
        cars[0] = "Opel";
        System.out.println(cars[0]);    //Overwrote first element of the array from Volvo to Opel.

        System.out.println(cars.length); //outputs 4, cause that's how many elements in our array


        // Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        //To create an array of integers, you could write:

        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[3]); //Outputs 40
        myNum[3] = 60;
        System.out.println(myNum[3]);   //outputs 60
    }
}
