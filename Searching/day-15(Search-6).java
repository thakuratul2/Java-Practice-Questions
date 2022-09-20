import java.util.Scanner;

class Search6 {
    public static String LeetCode1(String[] arr,String x){
        int start = 0;
        int last = arr.length-1;
        int ans = 0;

        int mid=0;
        while(start<=last){
            mid = (start+last)/2;
            if(arr[mid]==x){
                start = mid+1;
            }
            else{
                ans = mid;
                last = mid-1;
            }
        }
        return arr[ans];
    }
    public static void main(String[] args) {
        //find smallest number to greatest number than target
        Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        System.out.println("Elements in arrays: ");
        String arr[] = {"d", "j", "k"};
        System.out.println(arr);

        //loop 
        
        System.out.println("Enter the element to found: ");
        String key = sc.nextLine();

        String answer = LeetCode1(arr,key);
        System.out.println("Found Element: "+answer);
        sc.close();
    }
}
