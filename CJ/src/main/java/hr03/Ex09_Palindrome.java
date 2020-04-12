package hr03;

public class Ex09_Palindrome {
    public static void main(String[] args) {
        String str="redivider";
        int length=str.length();
        int count=0;

        for(int i=0,j=length-1; i<str.length() && j>=0;i++,j--)
        {
            if(str.charAt(i) == str.charAt(j) )
            {
                count++;
            }
        }

        if(count==length){ //midlength==count
            System.out.println(str + "  String is palindrome");
        }
        else{
            System.out.println(str+ "  String is not palindrome");
        }

    }

}
