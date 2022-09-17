package Strings;

import java.util.Scanner;

class String8 {
    public static void main(String[] args) {
        //Java Program to determine whether a given string is palindrome
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
        sc.close();
    }
}
