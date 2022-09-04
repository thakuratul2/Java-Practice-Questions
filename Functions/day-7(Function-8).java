import java.util.Scanner;

class Function8 {
    public static void main(String[] args) {
        // Define a method to find out if a number is prime or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int prime = sc.nextInt();
        sc.close();
        Prime(prime);

    }
    public static void Prime(int n){
        if(n%2==0){
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }
}
