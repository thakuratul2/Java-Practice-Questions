package Strings;

import java.util.Scanner;

class Strings4 {
    public static void main(String[] args) {
        // Write a java program to print even length words in a String?
        Scanner sc = new Scanner(System.in);
       // int count = 0;
        System.out.println("Enter the string: ");
        String sb = sc.nextLine();
        sc.close();
        if(sb.length()%2==0){
           // count++;
            System.out.println("Even length");
        }
        else{
            System.out.println("Not even length");
        }
       // System.out.println(count);
    }
}
