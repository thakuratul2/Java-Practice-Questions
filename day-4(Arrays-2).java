import java.util.Scanner;

class Arrays2 {
    public static void main(String[] args) {
        //Substract two arrays
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        

        System.out.println("Enter the Elements of Array A: ");
        for(int i =0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Elements in Array A: ");
        for(int i =0;i<5;i++){

            System.out.print(a[i]+" ");
        }System.out.println();
        System.out.println("Enter the Elements of Array B: ");
        for (int j = 0; j < 5; j++) {
            b[j] = sc.nextInt();
        }
        System.out.println("Elements in Array B: ");
        for (int j = 0; j < 5; j++) {

            System.out.print(b[j] + " ");
        }
        sc.close();
        System.out.println();
        System.out.println("Substraction of Arrays is : ");
        for(int i=0;i<5;i++){
            c[i]=a[i]-b[i];
            System.out.print(c[i]+" ");
        }
    }
}
