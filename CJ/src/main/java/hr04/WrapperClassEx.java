package hr04;

public class WrapperClassEx {
    public static void main(String[] args) {
        int num = 769 ;
        String str = Integer.toString(num);

        StringBuffer sb = new StringBuffer(str);
        String revStr = sb.reverse().toString();

        int revnum = Integer.parseInt(revStr);
        System.out.println(num + " and its reverse is " + revnum);
    }
}
