package com.sohail;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase");
        }
        else
        {
                System.out.println(ch+ " is an Uppercase");
        }
    }
}
