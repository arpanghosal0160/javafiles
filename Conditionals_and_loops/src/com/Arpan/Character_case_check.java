//find out if the character in any given index is upper case or lower case


package com.Arpan;

import java.util.Scanner;

public class Character_case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        //trim() removes extra space before and after
        //charAt(0) returns the character at the given index in bracket
        if (ch>='a' && ch<='z'){
            System.out.println("lower case");
        }else{
            System.out.println("upper case");
        }
        System.out.println(ch);
    }
}
