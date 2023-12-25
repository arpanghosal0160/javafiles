import java.util.*;

public class multidimensional_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //no. of columns is not necessary to specify
        System.out.println(arr.length); //prints the number of rows
        //input
        for (int row = 0; row <3 ; row++) {
            //for each column in each row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= in.nextInt();
            }
        }
        for (int row = 0; row <3 ; row++) {
            //for each column in each row
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
