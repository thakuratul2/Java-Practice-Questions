import java.util.Scanner;

class Function11 {
    public static void main(String[] args) {
        // Display the factors of 3 in a given integer

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        Factors(num);
        sc.close();
    }
    public static void Factors(int n){
        System.out.println("Factors of " + n + " are: ");
        int result = n;
        while(result % 3==0){
            System.out.print("3 * ");
            result = result / 3;
            
        }
        System.out.println(result);
       
    }
}
