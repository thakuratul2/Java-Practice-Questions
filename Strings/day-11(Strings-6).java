
    package Strings;

import java.util.Scanner;

class String6 {
        public static void main(String[] args) {
            //get the character at the given index within the String
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String: ");
            String str = sc.nextLine();
            System.out.println("Enter the index value to find: ");
            int index = sc.nextInt();

            System.out.println("The Character is "+ str.charAt(index));
            sc.close();
        }
    }
    