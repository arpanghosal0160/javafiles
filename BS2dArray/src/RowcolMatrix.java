import java.util.Arrays;

public class RowcolMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {33, 34, 38, 50},
                {28, 39, 37, 49}
        };
        System.out.println(Arrays.toString(search(arr, 15)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        System.out.println(matrix.length);
        while(r<matrix.length && c>=0){
            if (matrix[r][c] == target){
                return new int[]{r, c};
            }
            if (matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
