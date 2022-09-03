import java.util.Scanner;

class Function2 {
    public static void main(String[] args) {
        // Write a Java method to find the smallest number among three numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int first = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int second = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int third = sc.nextInt();
        sc.close();
        Small(first,second, third);
    }
    public static void Small(int a,int b,int c){
        if(a<b && a<c){
            System.out.println("Smallest number is "+a);
        }else if(b<c && b<a){
            System.out.println("Smallest number is "+b);
        }else{
            System.out.println("Smallest number is "+c);
        }
    }
}
