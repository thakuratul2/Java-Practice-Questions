import java.util.Scanner;

class Ifelse{
    public static void main(String[] args){
        // Write a JAVA program to find maximum between two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        if(a<b){
            System.out.println(a+" is less than "+b);
        }else{
            System.out.println(a+" is greater than "+b);
        }
    }
}
