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
           // sc.close();
        }
        System.out.println();
        System.out.println("Before Sorted: ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        //logic
        for(int i = 1;i<size;i++){
            int j = i;
            while((j>0) && (arr[j-1]>arr[j])){
                //swap code
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }
        System.out.println();
        System.out.println("After Sorted: ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
            sc.close();
        }
    }
}
