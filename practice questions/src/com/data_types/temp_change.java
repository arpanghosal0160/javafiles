package com.data_types;

import java.util.Scanner;

public class temp_change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temperature in centrigate:");
        float c = sc.nextInt();
        float f = (float) ((1.8*c)+32);
        System.out.println("the temperature in farenheit is : "+ f );
    }
}
