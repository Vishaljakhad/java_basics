package array;

public class sumofarray {
    public static void main(String[] args) {
         int[] number = {12,12,14};
         int sum =0;
         for ( int i =0; i< number.length; i ++)
        {
            sum = sum + number[i];
        }
        System.out.println(sum);
    }
}
