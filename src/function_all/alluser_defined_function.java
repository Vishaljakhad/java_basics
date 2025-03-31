package function_all;

public class alluser_defined_function {

    public static void main(String[] args) {

// 1. without parameters and without return type
        greet();

// 2. Without parameters but with return type
        String s = greet_with_hellow();
        System.out.println(s);
        int age_to_vote = age_to_vote();
        System.out.println("age to vote is -->" + age_to_vote);

//3 with parameters and without return type (90%)
        greet_with_name("pramod");
        greet_with_name("amit");

        greet_with_details("pramod", 23, 100);
        greet_with_details("DUTTA", 25, 101);
        greet_with_details("VISHAL", 26, 106);


//4  with parameters and with return type
        int sum = sum_of_two_numbers(3,4);
        int sum2 = sum_of_two_numbers(100,105);
        System.out.println(sum);
        System.out.println(sum2);

    }
//1. Without parameters and without return type
    static void greet() {
        System.out.println("hy i am without parameter and without return type");
    }

 // 2. Without parameters but with return type
    static  String greet_with_hellow(){
        return "hy, how are you ?";
    }
//2.1 example
    static int age_to_vote(){
        System.out.println("calculating age---");
        return 18;
    }

 //3 with parameters and without return type(void)
    static void greet_with_name(String name){    // one parameter
        System.out.println("hy your name is " +name);
    }
    static void greet_with_details(String firstname, String lastname){
        System.out.println("hy, your name is "+ firstname +lastname);
    }
    static void greet_with_details(String name, int age, double salary){
        System.out.println("your name is -> "+name + "\n your age is"+age +"\n your salary is"+salary);
    }

//4 with parameters and with return type
    static int sum_of_two_numbers(int a , int b){
        return a+b;
    }
}