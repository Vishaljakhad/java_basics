package switch_learning;

public class switch_jdk13 {

    public static void main(String[] args) {

        int itemcode =001;

        switch (itemcode){
            case 001,002,005:
                System.out.println("all of them are electronci gadget");
break;
            case 004,006,007:
                System.out.println("This is a mech");
                break;
            default:
                System.out.println("None");

        }
    }
}
