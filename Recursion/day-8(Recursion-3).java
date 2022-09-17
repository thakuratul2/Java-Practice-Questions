import java.util.Scanner;

class Recursion3 {
    public static void Fib(int a,int b ,int n){
        if(n==0){
            return;
        }
        
        int c = a+b;
        System.out.println(c);
        Fib(b, c, n-1);
    }
    public static void main(String[] args) {
        //fibonnaci series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonnaci series is: ");
        System.out.println(a);
        System.out.println(b);
        Fib(a,b,num-2);
        sc.close();
    }
}
