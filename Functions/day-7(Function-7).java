import java.util.Scanner;

class Function7{
    public static void main(String[] args) {
        // Define a method that returns the product of two numbers entered by user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Number 2: ");
        int num2 = sc.nextInt();
        sc.close();

        int result = Pro(num1,num2);
        System.out.println("Product is: "+result);
    }
    public static int Pro(int a ,int b){
        return a*b;
    }
}