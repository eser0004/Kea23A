package JavaArrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
    /*
    A Multidimensional array is an array of arrays.

    Multidimensional arrays are useful when you want to store data as a tabular form,
    like a table with rows and columns.

    To create a two-dimensional array, add each array within its own set of curly braces:
    */
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        //myNumbers is now an array with two arrays as its Elements.
        System.out.println(myNumbers[1][2]);    //Outputs 7
        //Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
        System.out.println("\n");

        // Change Element Values
        //You can also change the value of an element:
        //Example

        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); //Outputs 9 instead of 7
        System.out.println("\n");
        /*
        Loop Through a Multi-Dimensional Array
        We can also use a for loop inside another for loop to get the elements of a two-dimensional array
         (we still have to point to the two indexes):
        */

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
