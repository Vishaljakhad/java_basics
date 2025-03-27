package interview_questions;

import java.util.Scanner;

public class hackerrankQ2_traingleclassifier {

    public static void main(String[] args) {

        // triangle classifier;
//        Write a program that classifies a triangle based on its side lengths.
//        Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
//        isosceles (exactly two sides are equal), or scalene (no sides are equal).
//        Use an if-else statement to classify the triangle.

//     Logic building
//     Step 1
//     Find the input/outputs
//     input | side1, side2, side 3 --> data type --> double
// output | SOP ---> String or message --> Equilateral, Isosceles, scalene.

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the length of side 1 :");
        Double side1 = sc.nextDouble();

        System.out.printf("Enter the length of side 2 : ");
        double side2 = sc.nextDouble();

        System.out.printf("Enter the length of side 3 : ");
        double side3 = sc.nextDouble();

        if ( side1<=0 ||  side2 <=0 || side3 <=0)
        {
            System.out.println("Invalid input : side lengths must be positive");
        }
        else
        {
            if (side1 == side2 && side2 == side3 ){
                System.out.println("it is a equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side3== side1) {
                System.out.println("it is an isosceles triangle");
            }
            else {
                System.out.println("it is an scalene triangle");
            }

        }
        sc.close();
        }

    }
