import java.util.Scanner;

class Design5 {
    public static void main(String[] args) {
        //Inverted half pyramid(180 degrees)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        sc.close();
        //outer loop for rows
        for(int i =1;i<=n;i++){
            //inner loop for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for stars
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
