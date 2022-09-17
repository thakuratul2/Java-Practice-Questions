import java.util.Scanner;

class Recursion2 {
    //function with return type
    public static int Fact(int n){
        if(n==1){
            return 1;
        }

        int res = Fact(n-1);
        int result = n * res;
        return result;
    }
    public static void main(String[] args) {
        //print the n number of factorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
       int ans =  Fact(num);
       System.out.println("Factorial of "+num+" is "+ans);
        sc.close();
    }
}
