package com.Arpan;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.printf("hello world");
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt()); //prints the integer
        System.out.println(input.next()); //prints only the first character until it finds a space in between words
        System.out.println(input.nextLine());//prints the whole line


        }

}