package Searching;

import java.util.Scanner;

class Linear{

    public static int LinearAtul(int arr[],int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in arrays: ");
        int[] arr = new int[size];
        

        //loop
        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int key = sc.nextInt();
        int answer= LinearAtul(arr, size, key);

        System.out.println("Found in index: "+answer);
        sc.close();
    }
}
