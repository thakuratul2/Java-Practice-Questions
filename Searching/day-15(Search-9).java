import java.util.Scanner;

class Search9 {
    public static int BinaryAtul(int arr[],int n) {
        int s = 0;
        int l = n;

        while(s<l){
            int mid = (s+l)/2;
            if(arr[mid]>arr[mid+1]){
                l = mid;//for decreasing order of array
            }else{
                s = mid+1;//for increasing order of array
            }
        }
        return s;
    }
    public static void main(String[] args) {
        //Mountain of element
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr = new int[size];

        //loop
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int answer = BinaryAtul(arr, size);
        System.out.println("The element found in: "+answer);
        sc.close();
    }
}
