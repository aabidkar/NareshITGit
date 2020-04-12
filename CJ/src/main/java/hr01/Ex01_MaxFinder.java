package hr01;

public class Ex01_MaxFinder {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 50;

        if (num1 > num2){
            System.out.println("num1 = " + num1 + " is greater than num2 " + num2);
        }
        else if (num1 == num2){
            System.out.println("num1 = " + num1 + " is same as num2 " + num2);
        }
        else{
            System.out.println("num2 = " + num2 + " is greater than num1 " + num1);
        }

    }

}