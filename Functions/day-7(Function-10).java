import java.util.Scanner;

class Function10 {
    public static void main(String[] args) {
        // Write a program that will ask the user to enter his/her marks (out of 100).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks out of 100: ");
        int marks = sc.nextInt();
        sc.close();
        Marks(marks);
    }
    public static void Marks(int n){
        if(n>=95){
            System.out.println("Grade A+");;
        }else if(n>=85 && n<95){
            System.out.println("Grade A");
        }else if(n>=75 && n<85){
            System.out.println("Grade B");
        }else if(n>=65 && n<75){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
    }
}
