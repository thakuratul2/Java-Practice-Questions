import java.util.Scanner;

class design7 {
    public static void main(String[] args) {
        //Hill pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
