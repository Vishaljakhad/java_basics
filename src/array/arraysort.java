package array;

import java.util.Arrays;

public class arraysort {

    public static void main(String[] args) {
        int[] marks ={51,100,120,130,112};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        System.out.println("-----------");

        //2nd method print of array
        for (int i =0; i< marks.length; i++){
            System.out.println(marks[i]);
        }
        Arrays.sort(marks); //51,100,112,120,130
    }
}
