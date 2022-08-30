import java.util.Scanner;

class design9 {
    public static void main(String[] args) {
        // Butterfly Patterns

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();

        // outer loop for upper half of the pattern
        for (int i = 1; i <= n; i++) {
            // inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // logic for printing spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // outer loop for lower half of the pattern
        for (int i = n; i >= 1; i--) {
            // inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // logic for printing spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
