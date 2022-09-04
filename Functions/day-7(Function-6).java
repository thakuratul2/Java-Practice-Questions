import java.util.Scanner;

class Function6{
    public static void main(String[] args) {
        //A person is eligible to vote if his/her age is greater than or equal to 18.
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        Vote(age);
    }
    public static void Vote(int n){
        if(n>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not Eligible to vote");
        }
        }
    }
