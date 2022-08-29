import java.util.Scanner;

class design10 {
    public static void main(String[] args) {
        // solid rhombus
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        //outer loop
        for(int i =1;i<=n;i++){
            //inner loop for spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //loop for print star
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
