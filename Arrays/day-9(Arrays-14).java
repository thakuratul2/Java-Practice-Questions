import java.util.Scanner;

class Arrays14 {
    public static void main(String[] args) {
        // difference largest and smallest value
        //array = 2,3 4
        //answer = 4-3 = 1

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array: ");

        //loop
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        int diff = arr[0] - arr[arr.length - 1];
        System.out.println("The difference between largest and smallest number is: " + diff);
        sc.close();
    }
}
