package operators;

public class ternaryoperator_question {
    public static void main(String[] args) {

        // find the maximum number between two numbers.
        // X and Y ---> max X, y -> ternanry op.

        int x = 10;
        int y =20;
        int max = x > y ? x : y ;
        System.out.println(max);


        //2nd example
         int num = 10;
         String result = (num%2==0)? "even" : "odd" ;
        System.out.println(result);


    }

}
