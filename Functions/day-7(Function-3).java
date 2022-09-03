import java.util.Scanner;

class Function3 {
    public static void main(String[] args) {
        //Write a Java method to compute the average of three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int second = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int third = sc.nextInt();
        sc.close();
      int res =   Average(first,second,third);
      System.out.println("The Average is "+res);

    }
    public static int Average(int a,int b,int c){
        int avg = (a+b+c)/3;
        return avg;
    }
}
