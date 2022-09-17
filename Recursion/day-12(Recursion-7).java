
import java.util.Scanner;

class Recursion7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the power to find: ");
        int pow = sc.nextInt();
        System.out.println("The result is: "+ Power(num, pow));
        sc.close();
    }

    public static int Power(int n , int pow){
        int res = 1;
        if(pow==1){
            return n;
        }else{
           res = n * Power(n,pow-1);
        }
        return res;
    }
}