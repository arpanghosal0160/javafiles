package com.data_types;

import java.util.Scanner;

public class floor_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of the number:");
        int num = sc.nextInt();
        int fl_div = 0;
        int fl_mod = 0;
        fl_div = num/10;
        System.out.println("the floor division value is :"+ fl_div);

        fl_mod= num%10;
        System.out.println("the floor modulus value i s:"+ fl_mod);
    }
}
