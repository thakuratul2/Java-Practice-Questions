package Strings;

import java.util.Scanner;

class Strings1 {
    public static void main(String[] args) {
        // Java Program to count the total number of characters in a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Total number pf characters in the string: " + name.length());
    }
}
