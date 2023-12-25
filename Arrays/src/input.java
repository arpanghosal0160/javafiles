import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        //normal input
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 187;
        arr[2] = 156;

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j);
        }
        //printing as arrays by converting into string
        System.out.println(Arrays.toString(arr));//takes the input and prints as arrays by converting it to string

        //array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();
        }
        System.out.printf(Arrays.toString(str));

    }
}
