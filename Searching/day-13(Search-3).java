import java.util.Scanner;

class Search3{
    public static int LinearAtul(int arr[], int n, int x) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first != -1) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        } else {
            System.out.println("Not Found");
        }
        return -1;

    }

    public static void main(String[] args) {
        //First and last occurrences of x
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in arrays: ");
        int[] arr = new int[size];

        //loop
        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to find: ");
        int key = sc.nextInt();
        LinearAtul(arr, size, key);
        sc.close();
    }
   

}