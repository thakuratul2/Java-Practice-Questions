import java.util.Scanner;

class Recursion10 {
    public static int SumOf(int num){
        if(num==1){
            return num;
        }
        int res = SumOf(num-1);
        int answer = num + res;
        return answer;
    }
    public static void main(String[] args) {
        //sum of series 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = SumOf(n);
        System.out.println("Sum of "+n+" is "+ans);
        sc.close();


    }
}
