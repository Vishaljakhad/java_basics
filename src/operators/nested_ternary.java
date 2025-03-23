package operators;

public class nested_ternary {
    public static void main(String[] args) {

//    result = condition1 ? expression1 : expression2;
//    expression - (condition2 ? expression2 : expression3)
        int number = 15;
        String result = (number > 10 ) ? (number > 20 ? "G > 20" : "B 10 to 20") :"B" ;
        System.out.println(result);
        

    }

}
