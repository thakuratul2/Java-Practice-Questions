import java.util.Scanner;

class Loop {
    public static void main(String[] args) {
        // Write a JAVA program to print all natural numbers from 1 to n
        System.out.println("Enter the Number: ");
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            System.out.println(i);

        }
        // Write a JAVA C program to print all odd numbers from 1 to n
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        sc.close();
        for(int j=1;j<=a;j++){
            if(j%2!=0){
                System.out.println(j);
            }
        }
    }
}
