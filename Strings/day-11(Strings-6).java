
    package Strings;

import java.util.Scanner;

class String6 {
        public static void main(String[] args) {
            //get the character at the given index within the String
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str = sc.nextLine();

           
            System.out.println("Enter the index Value to find: ");
            int index = sc.nextInt();
            
            for(int i = str.length();i>0;i--){
                 index = str.charAt(i);
        }
             
            System.out.println((char)index);
            sc.close();
        }
    }
    