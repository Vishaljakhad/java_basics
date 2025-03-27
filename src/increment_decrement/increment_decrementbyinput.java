package increment_decrement;

public class increment_decrementbyinput {

    public static void main(String[] args) {
        int a =10;
        System.out.println(++a);
        System.out.println(a);


        //POST increment == print first and then decrease
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        int b =10;
        System.out.println(b++ +b);
        System.out.println(b++ + ++b); //24 //22
        // post increment 10 b++  a--> 11
        // +
        // ++b --> 11 already hai ab uska increment i.e 12

        System.out.println(b);

        //A + B
        // A--> a++ -->10,  a--> 11


    }
}

