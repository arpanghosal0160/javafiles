//search in 2d array and return true if the value is present


import java.util.Scanner;

public class Search2darr {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10,11,16,20},
                {23,30,34,60},
        };
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        boolean ans = search(arr , target);
        System.out.println(ans);
    }
    static boolean search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return true;
                }
            }
        }
       return false;
    }
}
