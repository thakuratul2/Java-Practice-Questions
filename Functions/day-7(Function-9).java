import java.util.Scanner;

class Function9{
    public static void main(String[] args) {
        // Write a program to print the factorial of a number by defining a method named
        // 'Factorial'.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        sc.close();
        int res = Fact(num);
        System.out.println("Factorial is "+res);
    }
    public static int Fact(int n){
        if(n==0){
            return 1;
        }else{
            return (n*Fact(n-1));
        }
    }
    
}
