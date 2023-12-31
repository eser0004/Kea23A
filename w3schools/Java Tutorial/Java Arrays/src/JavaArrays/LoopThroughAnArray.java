package JavaArrays;

public class LoopThroughAnArray {
    public static void main(String[] args) {
        /*
        Loop Through an Array
        You can loop through the array elements with the for loop,
        and use the length property to specify how many times the loop should run.

        The following example outputs all elements in the cars array:
         */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("\n");
        // Loop Through an Array with For-Each
        //There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

        String[] newCars = {"Volvo", "BMW", "Ford", "Mazda", "Fiat", "Mercedes"};
        for (String i : newCars) {
            System.out.println(i);
        }
        /*
        The example above can be read like this:
        for each String element (called i - as in index) in newCars, print out the value of i.

        If you compare the for loop and for-each loop, you will see that the for-each method is easier to write,
        it does not require a counter (using the length property), and it is more readable.
         */
    }
}
