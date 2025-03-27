package ifcondition;

import java.util.Scanner;

public class ex50_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //syntax to get the inputfrom the user

        System.out.println("enter your age");
 //       int age = 15;

        int age = sc.nextInt();

        if( age > 18) {
            System.out.println("you are allowed to vote !");

        } else{
            System.out.println("not allowed to vote");
        }
    }
    }

