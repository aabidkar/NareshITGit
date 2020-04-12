package hr03;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Java is an interesting Language !!!";
        char ch = str1.charAt(0);
        //System.out.println(ch);
        int len = str1.length();
        int ind = str1.lastIndexOf('a');
        System.out.println("index of a is : "+ ind);
        int j = str1.lastIndexOf("an");
        System.out.println(" an is at : " + j);

        /*for (int i = 0 ; i < len ; i=i+2){
            ch = str1.charAt(i);
            System.out.println(i + " :  " + ch);
        }*/

        boolean flag = true ;
        String str3 = "Very ";
        System.out.println(str3 + String.valueOf(flag) );
                //very
       // "true".equals(String.valueOf(flag))
        String s1 = "Java ";
        String s2 = "Language";
        System.out.println(s1 + s2) ;
        s1.concat(s2);




    }
}
