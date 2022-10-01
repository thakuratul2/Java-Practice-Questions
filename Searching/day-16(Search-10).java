import java.util.Scanner;

class Search10{
    public static int MatrixSearch(int arr[][],int size , int target){
        for(int i =0;i<size;i++){
            for(int j = 0;j<size;j++){
                if(arr[i][j]==target){
                    System.out.print("Element found at ("
                            + i + ", " + j
                            + ")\n");
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //Searching in matrix
        int answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[][] arr1 = new int[size][size];

        //logic
        for(int i =0;i<size;i++){
            for(int j = 0;j<size;j++){
                arr1[i][j]= sc.nextInt();
            }
            
        }
        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();

         answer = MatrixSearch(arr1, size, key);
        System.out.println("The element found in: "+answer);
        
       sc.close();
        
    }
}