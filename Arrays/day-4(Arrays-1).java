class Arrays1 {
    public static void main(String[] args) {
        //add two arrays
        int num=5;
        int a[] = new int[5];
        int b[] =new int[5];
        int c[] = new int[5];
        System.out.println("The elements of array A: ");
        for(int i =0;i<5;i++){
            a[i]=i;
        }
        for(int i =0;i<5;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("The elements of array B: ");
        for (int j = 0; j < 5; j++) {
            b[j] = num;
            ++num;
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(b[j]+" ");
        }
        System.out.println();
        System.out.println("Addition of Arrays is : ");
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
}
