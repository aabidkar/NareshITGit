package hr03;

public class StringIntro {
    public static void main(String[] args) {
        int i = 10;
        String str1 = "Java is an interesting Language !!!";
        String str2 = "Java is an interesting Language !!!";

        System.out.println("  str1 == str2        : "+ (str1 == str2) );
        System.out.println("  str1.equals(str2)   : " + str1.equals(str2)); //true

        String str4 = new String("Java is an interesting Language !!!");
        System.out.println("  str1 == str4        : "+ (str1 == str4) );
        System.out.println("  str1.equals(str4)   : " + str1.equals(str4)); //true

        String str5 = new String("Java is an interesting Language !!!");
        System.out.println("  str4 == str5        : "+ (str4 == str5) );
        System.out.println("  str4.equals(str5)   : " + str4.equals(str5)); //true




        String str6 = "Java is an interesting Language !!!";
        String str7 = "java is an interesting language !!!";
        System.out.println("  str6 == str7        : "+ (str6 == str7) );
        System.out.println("  str6.equals(str7)   : " + str6.equals(str7)); //
        System.out.println("  str6.equalsIgnoreCase(str7)   : " + str6.equalsIgnoreCase(str7)); //

    }
}
