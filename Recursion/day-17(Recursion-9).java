import java.util.Scanner;

class Recursion9 {
    public static int funRev(int num){
        if(num==1){
            return num;
        }
        funRev(num-1);
        System.out.println("Series is: "+num);
        return num;
    }

    public static void main(String[] args) {
        //series 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        funRev(n);
        sc.close();
    }
}
