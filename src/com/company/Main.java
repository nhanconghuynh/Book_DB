package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keybd = new Scanner(System.in);

        System.out.print("Enter the Book Code: ");

        String code = keybd.nextLine();

        Book_LookUp(code);
    }
}
