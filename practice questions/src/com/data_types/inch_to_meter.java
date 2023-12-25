package com.data_types;

import java.util.Scanner;

public class inch_to_meter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the distance in inches : ");
        float inch = sc.nextInt();
        float  meter = (float) (0.0254 * inch);
        System.out.println("the distance in meters is :"+ meter);

    }
}
