import java.util.Scanner;

class Switch1 {
    public static void main(String[] args) {
        //enter the number and print corresponding name in string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7: ");
        int num = sc.nextInt();
        sc.close();
        //switch case
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
