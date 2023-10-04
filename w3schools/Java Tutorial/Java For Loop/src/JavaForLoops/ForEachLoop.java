package JavaForLoops;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
        For-Each Loop
        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

        for (type variableName : arrayName) {
         // code block to be executed
        }
        */

        // The following example outputs all elements in the cars array, using a "for-each" loop:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
