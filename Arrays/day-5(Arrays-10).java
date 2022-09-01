class Arrays10 {
    public static void main(String[] args) {
        //rotate a matrix by 90 degrees
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = arr[j][3-i-1];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
