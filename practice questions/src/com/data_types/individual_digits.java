package com.data_types;

import java.util.Scanner;

public class individual_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum = temp % 10;
            System.out.println(sum);
            temp = temp / 10;
        }
    }
}
