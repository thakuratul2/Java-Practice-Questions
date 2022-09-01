package Strings;

import java.util.Scanner;

class Strings3{
    public static void main(String[] args) {
        // Java Program to determine whether two strings are the anagram
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();
        //int size = str1.length() + str2.length();
       int[] count = new int[256];
       for(int i =0;i<str1.length();i++){
           count[str1.charAt(i)-'a']++;
           count[str2.charAt(i)-'a']--;
       }
       for(int i=0;i<count.length;i++){
           if(count[i]!=0){
               System.out.println("Not anagram");
               return;
           }
        //   System.out.println("Anagram");
       }
       System.out.println("Anagram");

    }
}
