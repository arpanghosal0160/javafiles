import java.util.Scanner;

public class sum_return_value {
    public static void main(String[] args) {
        int ans = sum3(20,44);
        System.out.println("the sum of the numbers is :"+ ans);
//        int ans = sum2();
//        System.out.println(ans);
    }
//    static int sum2(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the first number :");
//        int num1 = in.nextInt();
//        System.out.println("enter second number:");
//        int num2 = in.nextInt();
//        return num1 +num2;
//    }
    static int sum3(int a , int b){
        return a+b;

    }
}
