package hr03;

public class StringReversal {
    public static void main(String[] args) {
        String str="redivider";
        // 321redivider
        //String revStr = "";
        int len = str.length();
        StringBuffer sb = new StringBuffer(str);
        //StringBuffer sbrev = sb.reverse();
        String revStr = sb.reverse().toString();

        if(str.equals(revStr)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is NOT a palindrome");
        }



       /* for(int i = len-1 ; i >= 0  ; i--){
            revStr = revStr + str.charAt(i);

        }
        System.out.println(revStr + "\n" + str);
        if(str.equals(revStr)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is NOT a palindrome");
        }*/

    }
}
