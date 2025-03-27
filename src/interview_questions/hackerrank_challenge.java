package interview_questions;

import java.util.Scanner;

public class hackerrank_challenge {

    public static void main(String[] args) {

//Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
//    A: 90-100
//    B: 80-89
//    C: 70-79
//    D: 60-69
//    F: 0-59

        //logic building ;;java
        // step 1 : figure input and out
         // input | score --->(0-100) | data type ---> int
        //output | grade ---> data type --> char

        // step 2. Basic logic  | rough logic
        // if ( score >= 90 && score <=100 --> return to print grade --A
        // else if (core <= 90 && score >=80-- --> return to print grade --B
        //else if score
        // D
        // else --> grade --> F

        // step 3 . write the code
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the score ");
        int score = sc.nextInt();
        char grade = 'F';  // adding default value of a local variable is a good practise.

        if(score >=90 && score <=100) {
            grade ='A';
        }
        else if ( score >=80 && score <=89) {
            grade = 'B';
        } else if ( score >=70 && score <= 79) {
            grade = 'c';
        } else if ( score >=60 && score <=69) {
            grade ='D';
        } else if ( score <0 || score >100) {   // && nahi ayega yaha par
            grade = 'O';
            System.out.println("LOL, you are the chaya of VISHAL");
        } else {
            grade = 'F';
        }
        System.out.println("your grade is -->" + grade);

    }
}
