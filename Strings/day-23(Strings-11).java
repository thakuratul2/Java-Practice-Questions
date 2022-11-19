package Strings;

import java.util.Scanner;

class Strings11 {
    public static void main(String[] args) {
        //count the numeric character in string
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String  name = sc.nextLine();
        int n = 0;
        char[] ch = name.toCharArray();
        for(int i =0;i<name.length();i++){
            if(ch[i]>='0' && ch[i]<='9')
            n++;
        }
        System.out.println("Count of digits in the entered strings are "+n);
        sc.close();
    }
}
