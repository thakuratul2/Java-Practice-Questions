import java.util.Scanner;

class Conversion2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();

        int i = 0;
        int res =0;
        while(num>0){
            int rem = num%10;
            res = res + rem * (int) Math.pow(2, i);
            num = num/10;
            i++;
        }
        System.out.println("Decimal number: "+res);
        sc.close();
    }
}