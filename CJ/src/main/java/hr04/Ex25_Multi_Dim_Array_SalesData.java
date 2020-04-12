package hr04;


public class Ex25_Multi_Dim_Array_SalesData {
    public static void main(String[] args) {
/*
        int[] yr1 =  {1000,5000,6000,3000};
        int[] yr2 = {2000,6000,3000,7500};
        int[] yr3 = {2100,2700,5000,1870};
*/
        //int[][] data = { yr1 , yr2, yr3   };

        int[][] data = { {1000,5000,6000,3000} ,
                         {2000,6000,3000,7500},
                         {2100,2700,5000,1870}   };

        //int[][] data={{1000,5000,6000,3000},{2000,6000,3000,7500},{2100,2700,5000,1870}};

        int nrow = data.length ;
        int ncol = data[0].length;

        System.out.println("No. of rows : "+nrow);
        System.out.println("No. of cols : "+ncol);
        System.out.println("Q1 \t Q2 \t Q3 \t Q4 \t");
for(int i = 0 ; i < nrow ; i++){

    for (int j=0 ; j < ncol ; j++){
        System.out.print(data[i][j] + "\t");
    }
    System.out.println();
}

        for(int i = 0 ; i < nrow ; i++){
            int sum = 0;
            for (int j =0; j< ncol; j++){
                sum = sum + data[i][j];


            }
            System.out.println(sum);
        }



        /*

        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=3;j++)
            {
                System.out.print(" "+data[i][j]);

            }
            System.out.println('\n');
        }
*/
    }
}