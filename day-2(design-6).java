import java.util.Scanner;

class Design6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //half pyramid with numbers
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
