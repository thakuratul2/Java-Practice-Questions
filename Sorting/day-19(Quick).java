package Sorting;

import java.util.Scanner;

class Quick{
    public static int Partition(int arr[],int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j =l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                //swap code
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int tem = arr[i];
        arr[i] = pivot;//arr[i] = arr[h] also written
        arr[h] = tem;
        return i;
    }
    public static void Quicksort(int arr[],int l,int h){
        if(l<h){
            int piv = Partition(arr,l,h);

            Quicksort(arr, l, piv-1);
            Quicksort(arr, piv+1, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr = new int[size];


        //loop
        for(int i = 0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        Quicksort(arr, 0, size-1);

        System.out.println();
        System.out.println("Sorted array: ");
        for(int i = 0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        sc.close();
    }
}
