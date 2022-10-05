import java.util.Scanner;

class Recursion14 {
    public static int CountZero(int n , int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem ==0){
            return CountZero(n/10, count+1);
        }
        return CountZero(n/10, count);
    }
    public static void main(String[] args) {
        //count number of zeros
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Number of Zero in the number is: "+CountZero(num, 0));
        sc.close();
        
    }
}
