import java.util.Scanner;

class Recursion8 {
    public static int Natural(int num){
        if(num==0){
            return 1;
        }
        System.out.println("Series is: "+num);
        return Natural(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        Natural(num);
        //System.out.println("Series is: "+answer);
        sc.close();
    }
}
