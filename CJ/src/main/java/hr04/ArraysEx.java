package hr04;

public class ArraysEx {
    public static void main(String[] args) {
        //int i = 5;
        //int[] arr = {5,6,7,3,9,9,10};
        int[] arr = new int[50];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 3;
        arr[4] = 9;
        arr[5] = 9;
        arr[6] = 10;

        //System.out.println(arr[3]);
        //arr.length
        arr[3] = 0;
        int len = arr.length ;
        arr[7 ] = 9;
        arr[8] = 8;
        System.out.println(arr.length);

        for(int i = 0 ; i < arr.length ; i++  ) {
            System.out.println(arr[i]);
        }



        String[] strarr = {"Java", "Python", "c", "c++", "Scala"     };
        String language = strarr[1];
        //int len1 = strarr.length();
        System.out.println(language);
        language.length();
        strarr[1].charAt(strarr[1].length() - 1);


    }
}
