import java.util.Scanner;

class Function13{
    public static int Binary(int n){
        int res = 0;
        int i =0;
        while(n>0){
            int rem = n%10;
            res = res + rem *(int)Math.pow(2, i);
            n = n/10;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int num = sc.nextInt();
        int answer = Binary(num);
        System.out.println("Decimal Number: "+answer);
        sc.close();
    }
}