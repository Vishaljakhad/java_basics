package strings;

public class stringfunctions {
    public static void main(String[] args) {
        String name ="vishal";
        System.out.println(name.length());

        //1. charAt()
        System.out.println(name.charAt(3));
        //2. concat()
        System.out.println(name.concat("jakhad"));
        //3. contains()
        System.out.println(name.contains("du")); //true or false will give as a answer
        String name2= "vishal@jakhad";
        String[] split = name2.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);

        String name3="niagara. O rora again";
        String roar = name3.substring(11,19);
        System.out.println(roar);
        System.out.println(name3.substring(4,9)); //another method


        //lower case
        System.out.println("vishal".toUpperCase());

        //trim()
        String name01= "    VISHAL JAKHAD";
        System.out.println(name01.trim());


        //to create string by using 3rd option i.e. stringbuilder
        StringBuilder sb = new StringBuilder("hi");
        sb.append(" it's my world");
        System.out.println(sb.toString());

    }

}
