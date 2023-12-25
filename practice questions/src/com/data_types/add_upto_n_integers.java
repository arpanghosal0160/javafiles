package com.data_types;

import java.util.Scanner;

public class add_upto_n_integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n  ; i++) {
            sum = sum +i;
        }
        System.out.println("the sum is :"+ sum);


    }
}
