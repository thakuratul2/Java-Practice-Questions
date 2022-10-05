import java.util.Scanner;

class Recursion13{
    public static void Reverse(int num){
        if(num==0){
            return;
        }
        System.out.print(num%10);
        Reverse(num/10);

        
    }
    
   
    public static void main(String[] args) {
        //reverse a digi by Recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        System.out.print("Reverse Number is: ");
        Reverse(num);
        sc.close();

       
    }
}