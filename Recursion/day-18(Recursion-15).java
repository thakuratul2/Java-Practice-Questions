import java.util.Scanner;

class Recursion15 {
    public static int Palidrome(int n , int temp){
        if(n==0){
            return temp;
        }
        int rem = n%10;
        temp = temp*10 + rem;
        return Palidrome(n/10, temp);
    }

    public static void main(String[] args){
        //Palidrome of number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = Palidrome(num, 0);
        if(temp == num){
            System.out.println("Number is Palidrome");
        }
        else{
            System.out.println("Number is not Palidrome");
        }
        sc.close();

    }
}
