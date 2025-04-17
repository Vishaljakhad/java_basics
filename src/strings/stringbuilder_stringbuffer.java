package strings;

public class stringbuilder_stringbuffer {
    public static void main(String[] args) {

        StringBuffer stringBuffer= new StringBuffer("vishal");
        stringBuffer.append("jakhad");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);
    }
}
