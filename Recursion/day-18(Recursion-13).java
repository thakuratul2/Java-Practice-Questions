import java.util.Scanner;

class Recursion13{
    public static int Reverse(int num){
        //reverse a digit by recursion
        int sum = 0;
        if(num==0){
            return num;
        }
        //return (num%10)*10 + Reverse(num/10);
        int res = num%10;
        sum = sum * 10 + res;
        Reverse(num/10);
        return sum;
       // return sum;
    }
    
   
    public static void main(String[] args) {
        //reverse a digi by Recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int ans = Reverse(num);
        System.out.println("Reverse of "+num+" is "+ans);
        sc.close();

       
    }
}