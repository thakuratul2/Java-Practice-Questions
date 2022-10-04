package Sorting;

import java.util.Scanner;

class Selection{
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
        System.out.println();
        System.out.println("Before Sorted: ");
        for(int i =0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //logic
        System.out.println("After Sorted: ");
        for(int i =0;i<size-1;i++){
            int max_ele = i;
            for(int j=i+1;j<size;j++){
                if(arr[max_ele]>arr[j]){
                    max_ele = j;
                   
                }
            }
            // swap code
            int temp = arr[i];
            arr[i] = arr[max_ele];
            arr[max_ele] = temp;
        }
        for(int i =0;i<size;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}