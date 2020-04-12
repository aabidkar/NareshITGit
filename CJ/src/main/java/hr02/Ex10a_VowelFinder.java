package hr02;

import java.util.Scanner;

public class Ex10a_VowelFinder {
    public static void main(String[] args) {
        char ch ;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        ch = str1.charAt(0);
        System.out.println(ch);
        char ch1 = Character.toLowerCase(ch);
        boolean flag = false;
        switch(ch1){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                flag = true;
                break;
            default:
                flag = false;
        }
        if(flag){
            System.out.println(ch + " is a Vowel.");
        } else {
            System.out.println(ch + " is NOT a Vowel.");
        }



    }
}
