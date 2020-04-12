package hr04;

public class Ex15_TextProcessing {
    public static void main(String[] args) {
        String str = "This article 1  is about the 5 chemical element. For the software testing framework, see Selenium (software).";
String newstr =    str.toLowerCase();
int length = str.length();
        System.out.println(str);
        System.out.println(newstr);
        int endindex = newstr.indexOf('.');

        String sub = newstr.substring(0,endindex+1);
        System.out.println(sub);
        int vcount = 0;
        int ccount = 0;
        int dcount = 0 ;
        int ocount = 0;

for (int i = 0 ; i < length ; i++ ){
    char ch = newstr.charAt(i);
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        vcount++;
    } else if( ch >= 'a' && ch <= 'z') {
        ccount++;
    } else if(ch >= '0' && ch <= '9'){
        dcount++;
    }
}
        System.out.println("No. of total characters : " + length);
        //no. of vowels
        System.out.println("No. of Vowels = : "+ vcount);
        //no. of consonants
        System.out.println("No. of consonants = : "+ ccount);
        //no. of numeric digit
        System.out.println("No. of digits = : "+ dcount);
        //no. of others
        ocount = length - (vcount+ccount+dcount);
        System.out.println("No. of Others = : "+ ocount);


    }
}
