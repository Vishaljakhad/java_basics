package array;

import java.util.Arrays;

public class lab1_array {

    public static void main(String[] args) {

        int[] marks ={10,11,12,32,33,45};
        System.out.println(marks);   //will print [I@7b23ec81 and it   is the memory address (hashcode in hexadecimal), this is used in string

        System.out.println(Arrays.toString(marks));
        //2nd
        int[] marks2= new int[5]; //fixed size.(alwayssss fixed size)
        System.out.println(marks2.length);
    }
}
