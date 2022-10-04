import java.util.Scanner;

class Recursion12 {
    public static int SumPro(int num){
        if(num==1){
            return num;
        }
        //int res = SumPro(num-1);
        return num%10 * SumPro(num/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = SumPro(n);
        System.out.println("Sum of product of digits of "+n+" is "+ans);
        sc.close();
    }
}
