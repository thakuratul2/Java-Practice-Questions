package Sorting;

import java.util.Scanner;

class Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr = new int[size];

        //loop

        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
    }
}
