import java.util.Scanner;

class Loops {
    public static void main(String[] args){
        //Write a JAVA program to print all natural numbers from 1 to n

        System.out.println("Enter the Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        while(count<=num){
            System.out.println(count);
            count++;
        }
        //Write a JAVA C program to print all even numbers from 1 to n
        System.out.println("Enter the Number: ");
        int num1 = sc.nextInt();
        int count1 = 1;
        while(count1<=num1){
            if(count1%2==0){
                System.out.println(count1);

            }
            count1++;
        }
    }
}
