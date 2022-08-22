import java.util.Scanner;

class Design2 {
    public static void main(String[] args){
        //Design-2 Hollow Rectangle
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.println("Enter the number of rows: ");
        rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        cols= sc.nextInt();

        //outer loop for rows
        for(int i =1;i<=rows;i++){
            //outer loops
            for(int j = 1;j<=cols;j++){
                if(i==1||j==1||i==rows||j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
