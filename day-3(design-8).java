import java.util.Scanner;

class design8 {
    public static void main(String[] args) {
        //reverse hill pyramid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        sc.close();

        //outer loop
        for(int i=0;i<=n;i++){
            //outer loop
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
