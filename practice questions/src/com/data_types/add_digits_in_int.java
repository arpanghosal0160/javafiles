package com.data_types;

import java.util.Scanner;

public class add_digits_in_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp!=0){
            sum = sum + (temp%10);
            temp = temp/10;
        }
        System.out.println("the sum of digits of the numbers is :"+ sum);

    }
}
