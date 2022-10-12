import java.util.Scanner;

class Recursion17{
    public static boolean LinearRec(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        
            return arr[index] == target || LinearRec(arr,target,index+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the element in array: ");
        int[] arr= new int[size];

        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element: ");
        int key = sc.nextInt();

      boolean answer =  LinearRec(arr,key,0);
      System.out.println("Found "+answer);

        sc.close();
    }
}