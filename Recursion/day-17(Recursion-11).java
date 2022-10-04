import java.util.Scanner;

class Recursion11 {
    public static int SumDigit(int num){
        if(num==1){
            return num;
        }
        return num%10 + SumDigit(num/10);
    }
    public static void main(String[] args) {
        //sum of digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int answer = SumDigit(n);
        System.out.println("Sum of digits of "+n+" is "+answer);
        sc.close();
    }
}
