class Arrays9 {
    public static void main(String[] args) {
        //tranpose of matrix
        int[][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int mat[][] = new int[3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                mat[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
