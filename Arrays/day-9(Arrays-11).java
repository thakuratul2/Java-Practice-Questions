import java.util.Scanner;

class Array11 {
    public static void main(String[] args) {
        // Write a Java program to calculate the average value of array elements
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];

        //loop
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
        }
       
            float avg = sum/arr.length;
            //System.out.println("The average of array is: "+avg);
        System.out.println("The average of array is: "+avg);
        sc.close();
    }
}
