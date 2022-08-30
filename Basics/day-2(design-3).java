import java.util.Scanner;

class Design3 {
    public static void main(String[] args) {
        //Design 3 Half Pyramid
        Scanner sc = new Scanner(System.in);
        int i,j,row,col;
        System.out.println("Enter the number of rows");
        row = sc.nextInt();
        System.out.println("Enter the number of columns");
        col = sc.nextInt();
        sc.close();
        //outer loop
        for(i=1;i<=row;i++)
        {
            //inner loop
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
