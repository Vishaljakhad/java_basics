package operators;

public class ternary_operator {

//    #### Syntax
//- result = condition ? expression1 : expression2;
//
//- **condition**: This is a boolean expression that is evaluated.
//- **expression1**: This expression is executed if the condition is true.
//- **expression2**: This expression is executed if the condition is false.
public static void main(String[] args) {

    int age = 12;
    String canIvote =  age >= 18 ? "yes, you can vote" : "No, you can't vote" ;

    System.out.println(canIvote);


   // question : Find the largest and smallest number from n1,n3,n3
     int n1 = 2, n2= 9, n3 =-11;

     int largest =   (n1 >= n2) ? ((n1>=n3)  ? n1 : n3 ) : ((n2 >= n3) ? n2: n3);
    int smallest =   (n1 <= n2) ? ((n1<=n3)  ? n1 : n3 ) : ((n2 <= n3) ? n2: n3);
    System.out.println(" largest number:" + largest );
    System.out.println(" smallest number:" + smallest );

}



}
