import java.util.Arrays;
import java.util.Scanner;

class Arrays18 {
    public static void main(String[] args) {
        try (//check equal or not
        Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size: ");
            int size = sc.nextInt();
            System.out.println("Enter the element in Array 1: ");
            int[] arr = new int[size];

            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the element in Array 2: ");
            int[] arr1 = new int[size];

            for (int i = 0; i < size; i++) {
                arr1[i] = sc.nextInt();
            }
            //logic
            Arrays.sort(arr);
            Arrays.sort(arr1);
      // int ctem = 1;
            for(int i =0;i<size;i++){
                if(arr[i]!=arr1[i]){
                    System.out.println("Not Equal");
                    //ctem++;
                    return;
                }
            }
        }
        System.out.println("Equal");
       // sc.close();
    }
}
