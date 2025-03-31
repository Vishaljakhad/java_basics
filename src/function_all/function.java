package function_all;

public class function {
    public static void main(String[] args) {   //JVM program is calling the MAIN(continously running in RAM)
        // (string[] arg) : input/argument of the function
        //void : return type , never return anything
        // main : name of the function

        //step 2 : call the function
        main();
        greet();
        Math.max(3,4);
        System.out.println();     //println & print & printf is also a function  (inbuld functions)

    }
    // step 1: Decleration/define
    static void main(){  //no input(argument/parameter/ no return becs of void )
        System.out.println("hy another look like of main ");
    }
    //IMPT :example of without parameter and without return type.
    static void greet(){     //no input(argument/parameter/no return becs of void)
        System.out.println("hy how r u ?");
    }
}
