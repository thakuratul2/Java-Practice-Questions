import java.util.Scanner;

class Design1{
      public static void main(String[] args){
        //Design-1 Solid Rectangle
        Scanner sc = new Scanner(System.in);
        sc.close();
        int row,col;
        System.out.println("Enter the number of Rows: ");
        row = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        col = sc.nextInt();
        //inner loop 
        for(int i=1;i<=row;i++){
            //outer loop
            for(int j=1;j<=col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }
}