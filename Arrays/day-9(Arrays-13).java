import java.util.Scanner;

class Array13 {
    public static void main(String[] args) {
        // check_duplicate_number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[size];

        //loop 
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        //System.out.println("The duplicate number are: ");
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate number is: "+arr[j]);
                    break;
                
                }
            }
            //System.out.println("No");
        }
        //System.out.println("No duplicate number");
        sc.close();
    }
}
