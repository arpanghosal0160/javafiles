import java.util.Arrays;

public class searchin2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
        };
        int target =  999;
        int[] ans = search(arr, target);
        int ans2 = max(arr);
        System.out.println(ans2);
        System.out.print("the number lies in :");
        System.out.println(Arrays.toString(ans));
    }

    //searching a number in 2d array
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }

    //max in 2d array
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;//taking max value that java can hold
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                max = arr[row][col];
            }

        }
        return max;
    }
}
