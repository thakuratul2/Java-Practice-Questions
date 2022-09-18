import java.util.Scanner;

class Conversion{
    public static void main(String[] args) {
        //decimal to binary
        Scanner sc = new Scanner(System.in);
        int res=0;
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        while(num>0){
            int rem = num%2;
            res = res*10 + rem;
            num = num/2;
        }
        System.out.println("Binary number is: "+res);
        sc.close();
    }
}