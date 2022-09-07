package Recursion;

import java.util.Scanner;

class Recursion1 {
    public static void Sum(int i,int n,int sum){
        if(i==n){
            sum = sum+i;
            System.out.println(sum);
            return;
        }

        sum = sum +i;
        Sum(i+1, n, sum);
       // System.out.println("Sum of first "+n+" natural numbers is "+sum);

    }
    public static void main(String[] args) {
        //print sum of n natural numbers
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter the starting number: ");
    int num = sc.nextInt();
    System.out.println("Enter the ending number: ");
    int end = sc.nextInt();
   // System.out.println("Sum of natural numbers from "+num+" to "+end+" is: "+sum);
    Sum(num, end, sum);
    sc.close();
    }
}
