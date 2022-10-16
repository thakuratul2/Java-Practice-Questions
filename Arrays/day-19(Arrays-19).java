import java.util.Scanner;

class Arrays19 {
    public static void main(String[] args) {
        // Write a Java program to check if an array of integers contains two specified
        // elements 65 and 77.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr = new int[size];
        int num = 65;
        int num2 = 75;

        //loop
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        //logic
        for(int number : arr){
            Boolean r = number != num && number != num2;
            if(r){
                System.out.println("False");
            }else{
                System.out.println("True");
            }
            sc.close();
        }
    }
}
