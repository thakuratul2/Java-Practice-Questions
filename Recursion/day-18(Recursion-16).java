import java.util.Scanner;

class Recursion16 {
    public static boolean ArraySorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1] && ArraySorted(arr, index+1));

    }
    public static void main(String[] args) {
        //FInd the array is sorted by Recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();

        System.out.println("Enetr the element in array: ");
        int [] arr = new int[size];

        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        boolean answer = ArraySorted(arr, 0);
        System.out.println("Array is Sorted: "+answer);

        sc.close();
    }
}
