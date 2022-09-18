import java.util.Scanner;

class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int  num  = sc.nextInt();

        for(int i =0;i<num;i++){
            if(i==5){
                continue;
            }
            System.out.println("The Answer is: "+i);
            sc.close();
        }
    }
}
