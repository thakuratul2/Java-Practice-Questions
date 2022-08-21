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

        // Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        System.out.println("Enter a Number : ");
        int c = sc.nextInt();
        if(c%5==0 && c%11==0){
            System.out.println("Number "+c+ " is divisible by 5 and 11");
        }else{
            System.out.println("Number is not divisible by 5 and 11");
        }
        
    }
}
