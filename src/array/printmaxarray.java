package array;

public class printmaxarray {

    public static void main(String[] args) {

        int[] array = {25,32,45,12,88,78,99,100};
        // MAX, MIN
        //logic building
        //1. step --< input ---> array --> int
        //output ---> int--77

        int max_output = give_max(array);      //You call a custom method named give_max() and pass the array to it.
        System.out.println(max_output);       //  The returned value (the largest number) is stored in max_output and then printed.


    }
    static int give_max(int[] array){        //This is a static method that takes an integer array as a parameter and returns an integer (the maximum value).

        //logic i will write here
        int max = array[0];           //Assume the first element is the maximum to begin with.

        for ( int i =0; i< array.length; i++){

            if(array[i] > max){
                max = array[i];
            }
        }

        return max;            //This returns the maximum value found in the array to the main method.

    }
}
