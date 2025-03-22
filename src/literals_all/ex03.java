package literals_all;

public class ex03 {

        public static void main(String[] args) {
   /*     int age =78; //decimal system
        int marks_ece= -1 // -1 store as 1's compliment


        int binary_num = 0b11010; // binary literal
        // there are octal and hexadecimal no also

        //character literals*/

            char c1= 'a'; //cant use double quotes because it will convert into string
            char c2='b';
            char c3='@';  //can store special character also
            char c4='9'; // ab 9 char bangya hai not character now
            char c5='(';
            char c6=' '; // space is also a character

            // escape char
            char new_line='\n';
            char tab_line ='\t';
            char back_space ='\b';
            char car_r='\r';

            System.out.println("vishal" + new_line + "jakhad");
            System.out.println("vishal" + "jakhad");
            System.out.println("vishal" + back_space +  "jakhad");
            System.out.println("vishal" + car_r + "jakhad");  //carriage_return
            System.out.println("vishal" + tab_line + "jakhad");

            char ruppee = '$';
            System.out.println("vishal has " +ruppee+1000);
        }
// null is also a literal which is available to non-primitive datatype
//    only string can have null


    }


