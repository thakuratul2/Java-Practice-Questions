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
        // Write a JAVA program to check whether a character is uppercase or lowercase
        // alphabet.
        System.out.println("Enter the Character: ");
        char d = sc.next().charAt(0);
        if(d>='A' && d<='Z'){
            System.out.println("UpperCase");
        }else if(d>='a' && d<='z'){
            System.out.println("LowerCase");
        }else{
            System.out.println("Enter Again");
        }
        // Write a JAVA program to check whether the triangle is equilateral, isosceles or
        // scalene triangle.
        System.out.println("Enter the Side 1: ");
        int e = sc.nextInt();
        System.out.println("Enter the Side 2: ");
        int f = sc.nextInt();
        System.out.println("Enter the Side 3: ");
        int g = sc.nextInt();

        if(e==f && f==g){
            System.out.println("Triangle is equilateral");
        }else if(e==f || f==g){
            System.out.println("Triangle is isosceles");
        }else{
            System.out.println("Triangle is scalene");
        }

    }
}
