package hr01;

public class Ex05_TableOfNumber {
    public static void main(String[] args) {
        int i = 1;
        int num = 6;
        //for( i = 1 ; i <= 10 ; i++){
        while(i <= 10){
            System.out.println(num + " * " + i + " = "+ num * i);
            i = i + 1;

        }
        System.out.println("Outside For Loop " + i);


    }
}
