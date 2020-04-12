package hr01;

public class Ex04_EvenOrOdd {
    public static void main(String[] args) {
        int num ;
        num = 13;

        if( num % 2 == 0 ) {
            //Given num is an even
            System.out.println("The given no. is Even No." );
            System.out.println("Square of num is " + num * num );
        } else {
            System.out.println("The given no. is Odd No." );
            System.out.println("Cube of num is " + num * num * num );

        }
    }
}
