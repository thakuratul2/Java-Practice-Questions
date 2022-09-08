package Recursion;

import java.util.Scanner;

class Recursion5 {
    public static void Reverse(String st , int index){

        if(index==0){
            System.out.println(st.charAt(index));
            return;
        }

        System.out.print(st.charAt(index));
        Reverse(st, index-1);
    }
    public static void main(String[] args) {
        //reverse a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        sc.close();
        System.out.println("The reverse of the string is: ");
        Reverse(str,str.length()-1);
    }
}
