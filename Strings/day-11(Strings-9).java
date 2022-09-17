package Strings;

import java.util.Scanner;

class String9 {
    public static void main(String[] args) {
        // Java Program to determine whether two strings are the anagram
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second string: ");
        String str2 = sc.nextLine();
        int count = 0;
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        break;
                    }
                }
            }
            if (count == str1.length()) {
                System.out.println("Strings are anagram");
            } else {
                System.out.println("Strings are not anagram");
            }
        } else {
            System.out.println("Strings are not anagram");
        }
        sc.close();
    }
}
