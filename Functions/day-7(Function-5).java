import java.util.Scanner;

class Functions5 {
    public static void main(String[] args) {
       // Compute the sum of the digits in an integer
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number: ");
       int n = sc.nextInt();
       sc.close();
       int fina = Sum(n);
       System.out.println("The sum of number is: "+fina);
    }
   public static int Sum(int num){
    int res = 0;
    while(num>0){
        res = res + num%10;
        num = num/10; 
    }
    return res;
   }
}
