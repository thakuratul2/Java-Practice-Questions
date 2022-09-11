import java.util.Scanner;

class Pallidrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev) {
            System.out.println("Pallidrome");
        } else {
            System.out.println("Not Pallidrome");
        }
        sc.close();
    }
}
