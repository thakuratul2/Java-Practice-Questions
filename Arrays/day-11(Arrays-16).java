import java.util.Scanner;

class Arrays16 {
    public static void main(String[] args) {
        // Lower Triangular Matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int cols = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int[][] arr = new int[rows][cols];
        
        //loop
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
           if(rows!=cols){
            System.out.println("Matrix is not equal");
           }else{
            System.out.println("Lower Triangular Matrix: ");
            for(int i = 0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    if(j>i){
                        System.out.print("0 ");
                    }else{
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                    sc.close();
                }
            }
           }
        }
    }

