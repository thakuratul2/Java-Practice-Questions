import java.util.Scanner;

class Search4 {
    public static int Celling(int arr[],int n,int x){
        int s = 0;
        int l = n;

        while(s<=l){
            int mid = (s+l)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                s= mid+1;
            }else{
                l = mid-1;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        //Celling of number
        //Input: nums = [1,3,5,6], target = 5
        //Output: 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in arrays: ");
        int[] arr= new int[size];

        //loop 
        for(int i =0;i<size;i++){
            arr[i]  = sc.nextInt();
        }
        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();
        int answer = Celling(arr, size, key);
        System.out.println("The Element found: "+answer);
        sc.close();
    }
}
