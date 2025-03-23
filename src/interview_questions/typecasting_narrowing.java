package interview_questions;

public class typecasting_narrowing {
    public static void main(String[] args) {

        //implicit casting
        byte b = 10;
        int a = b; // Valid -> Implicit Casting(automatically done by compiler)
        System.out.println(a);


        //explicit casting
        byte c = 10;
        int a1 = (int)c; // Valid -> Explicit Casting( by telling a compiler what to do )
        System.out.println(a1);


        //narrowing

        int val =200;
       // byte b = val;  // // invalid -- implicit casting narrowing is not allowed
        byte d = (byte)val; // // valid --- explicit casting --allowed
        System.out.println(d);

    }
}
