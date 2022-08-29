

class Array5 {
    public static void main(String[] args) {
        // Program to find the frequency of each element in the array
       
        int[] arr = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
        ///int count = 1;
        System.out.println("Enter the elements of the array: ");
       
        //loop 
        for(int i =0;i<arr.length;i++){
            int count = 1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    //System.out.println(arr[i]+" ");
                    count++;
                    fr[j]=0;
                }
            }
            if(fr[i]!=0){
                //System.out.println(arr[i]+" "+fr[i]);
                fr[i]=count;
            }
        }
        for(int i =0;i<arr.length;i++){
            if(fr[i]!=0){
                System.out.println(arr[i]+" "+fr[i]);
            }
        }
       // sc.close();
    }
}
