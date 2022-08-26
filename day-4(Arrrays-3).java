import java.util.Scanner;

class Array3 {
    public static void main(String[] args) {
        //find the element in the arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the Elements in Array: ");
        for(int i =0;i<size;i++){
            a[i]=sc.nextInt();
        }
       
        System.out.println("Enter the Element to be found: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println("Element in Array: ");
        for(int i =0;i<a.length;i++){
            if(a[i]==x){
                System.out.println(x+" is found at index "+i);
            }
        }
    }
}
