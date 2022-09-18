import java.util.Scanner;

class Function12 {

    public static void Decimal(int n){
        int res =0;
        while(n>0){
            int rem = n%2;
            res = res *10 +rem;
            n = n/2;
        }
        System.out.println("The Binary Number: "+res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        Decimal(num);
        sc.close();
    }
}
