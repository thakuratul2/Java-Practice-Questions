import java.util.Scanner;

class Array12 {
    public static void main(String[] args) {
        // Write a Java program to test if an array contains a specific value
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");
       // System.out.println("Enter the element to be searched: ");
       // int ele = sc.nextInt();
        //arr = sc.nextInt();

        //loop
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
          int ele = sc.nextInt();
        for(int i = 0;i<arr.length;){
            if(arr[i]==ele){
                System.out.println("The element is present in the array");
                break;
            }else{
                System.out.println("The element is not present in the array");
                break;
               
            }
            
        }
        sc.close();
    }
}
