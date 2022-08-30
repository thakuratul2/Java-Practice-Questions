import java.util.Scanner;

class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //copy element of one array in another array
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[]  arr1= new int[size];

        System.out.println("Enter the elements of array: ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        //display array
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i = 0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        System.out.println();
        System.out.println("Elements of array1: ");
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        sc.close();
        
    }
}
