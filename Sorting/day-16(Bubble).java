package Sorting;

import java.util.Scanner;

class Bubble {
    public static void main(String[] args) {
 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size: ");
       int size = sc.nextInt();
       System.out.println("Enter the elements: ");
         int arr[] = new int[size];

         //loop
            for(int i=0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Before sorting: ");
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            //logic
            
            System.out.println();
            System.out.println("After sorting: ");
            for(int i=0;i<size;i++){
                for(int j=1;j<size-i;j++){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            sc.close();

    }
}
