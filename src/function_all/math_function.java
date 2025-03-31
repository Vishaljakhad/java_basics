package function_all;

import java.math.BigInteger;
import java.util.Scanner;

public class math_function {
    public static void main(String[] args) {
        //Create a function of sub, sum, mul & div
        //with parameter a, b (take the parameter from the user)

// logic building
//  step 1: input output decleration
//   a, b --> int--> scanner
//    int --> variable result
//
//  step 2: create function
//
//  step 3: write the code and fix and edge cases


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a =0 ;
        int b =0;
        if(scanner.hasNextInt()){
             a = scanner.nextInt();
        }
        else  {
            System.out.println("enter the int only");
            System.exit(0);
        }
        //BigInteger a = scanner.nextBigInteger();
        System.out.println("enter the num2");
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else  {
            System.out.println("enter the int only");
            System.exit(0);
        }

        int result_sum= sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = modulus(a,b);

        System.out.println(result_sum);
        System.out.println(result_div);
        System.out.println(result_mod);
        System.out.println(result_mul);
        System.out.println(result_sub);


    }
    static int sum(int a , int b){
        return a+b;
    }
    static int mul(int a , int b){
        return a*b;
    }
    static int sub( int a , int b){
        return a-b;
    }
    static  int div(int a , int b){
        if (b==0){
            System.out.println("div by zero is not allowed");
        }
        return a/b;
    }
    static int modulus(int a, int b){
        return a%b;
    }


}

