package ifcondition;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1 = sc.nextInt();
        System.out.println("enter the number2");
        int num2 = sc.nextInt();


        if (num1> num2) {
            System.out.println("num1");
        }
        else if(num2>num1) {
            System.out.println("num2");
        }
        else {
            System.out.println("equal");
        }
    }


}
