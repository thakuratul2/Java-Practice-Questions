import java.util.Scanner;

class Function1{
    public static void main(String[] args) {
        //swapping a variable by using third variable

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int first = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int second = sc.nextInt();
        sc.close();
        swap(first, second);
       
    }
    public static void swap(int a, int b){
        System.out.println("Before swapping: ");
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
        int c = a;
        a = b;
        b= c;
        System.out.println("After swapping: ");
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }
}