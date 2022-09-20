import java.util.Scanner;

class Search5 {
    public static int Floor(int arr[],int size, int key){
        int start = 0;
        int last = size;
        while(start<=last){
            int mid = (start+last)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                last = mid-1;
            }
        }
        return last;

    }
    public static void main(String[] args) {
        //fllor of number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in arrays: ");
        int[] arr = new int[size];

        //loop
        for(int i =0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();

        int answer = Floor(arr, size, key);
        System.out.println("The Floor of number: "+answer);
        sc.close();
    }
}
