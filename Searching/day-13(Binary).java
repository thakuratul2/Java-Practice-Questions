import java.util.Scanner;

class Binary {
    public static int BinaryAtul(int arr[],int n,int x){
        int start = 0;
        int end = n;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]>x){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in arrays: ");
        int[] arr= new int[size];

        //loop
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();

        int answer = BinaryAtul(arr, size, key);
        System.out.println("Found in index: "+answer);
        sc.close();
    }
}
