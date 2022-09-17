import java.util.Scanner;

class Arrays17 {
    public static void main(String[] args) {
        // Find the sum of each row and each column of a matrix
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the size of column: ");
        int col = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int[][] arr = new int[rows][col];

        //loop
        for(int i =0;i<rows;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
            
        }
        for(int i =0;i<rows;i++){
            int rowSum = 0;
            for(int j = 0;j<col;j++){
               
                rowSum = rowSum+arr[i][j];
            }
            System.out.println("Sum of " + (i+1) + " Rows is: "+rowSum);
        }
        for(int i=0;i<col;i++){
            int rowCol = 0;
            for(int j =0;j<rows;j++){
                rowCol = rowCol+arr[j][i];
            }
            System.out.println("Sum of " + (i + 1) + " Columns is: "+rowCol);
            sc.close();
        }
    }
}
