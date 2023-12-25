//sum of 2 numbers using functions

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number :");
        int num1 = in.nextInt();
        System.out.println("enter second number:");
        int num2 = in.nextInt();
        int sum = num1 +num2;
        System.out.println("the sum is :"+ sum);
    }
}