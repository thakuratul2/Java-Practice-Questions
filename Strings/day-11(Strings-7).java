package Strings;

import java.util.Scanner;

class String7 {

    public static void main(String[] args) {
        // Java Program to replace lower-case characters with upper-case and vice-versa

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println();
        System.out.println("Original String: "+str);
        System.out.println();
        String result = str.replace(str.toLowerCase(),str.toUpperCase());
        System.out.print("New String: ");
        System.out.println(result);
        sc.close();
    }
}
