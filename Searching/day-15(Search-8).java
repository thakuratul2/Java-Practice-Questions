import java.util.Scanner;

class Search8 {
    static int foundAns(int arr[],int target){
        int s = 0;
        int end = 1;

        while(target>arr[end]){
            s = end;
            end = 2*end;
        }
        return BinaryAtul(arr, target,s,end);
    }
    static int BinaryAtul(int arr[], int x,int start,int end) {
       
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //Position of element in the infinite length of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in array: ");
        int arr[] = new int[5];

        //loop
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();

        int answer =foundAns(arr, key);
        System.out.println("The element location: "+answer);
        sc.close();

    }
}
