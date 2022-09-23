import java.util.Scanner;

class Search7 {
    
    public static void main(String[] args) {
        //firstandlastpostion(leetcode)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements in array: ");
        int[] arr = new int[size];

        //loop

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to found: ");
        int key = sc.nextInt();

        int answer = LeetCode2Search(arr,size,key,true);
        int answer2 = LeetCode2Search(arr, size, key, false);
        System.out.println("The Occurence are: "+answer);
        System.out.println("The Second Occurece are: "+answer2);
        sc.close();
    }
    
    public int[] LeetCode2(int arr[], int size, int key) {
        int[] ans = { -1, -1 };
        ans[0] = LeetCode2Search(arr, size, key, true);
        ans[1] = LeetCode2Search(arr, size, key, false);

        return ans;
    }

    static int LeetCode2Search(int arr[], int size, int key, Boolean findNum) {
        int ans = -1;
        int start = 0;
        int last = arr.length - 1;

        while (start <= last) {
            int mid = (start + last) / 2;
            if (arr[mid] > key) {
                last = mid-1;
            } else if (arr[mid] < key) {
                start = mid+1;
            } else {
                ans = mid;
                if (findNum == true) {
                    last = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
