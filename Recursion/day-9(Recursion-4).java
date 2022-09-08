package Recursion;

import java.util.Scanner;

class Recursion4 {
    public static void towerof(int n,String from,String helper,String dest){
        if(n==1){
            System.out.println("Move disk 1 from rod "+from+" to rod "+helper);
            return;
        }
        towerof(n-1,from,helper,dest);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+helper);
        towerof(n-1,helper,dest,from);
    }
    public static void main(String[] args) {
        //tower of hanoi

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        int disk = sc.nextInt();
        sc.close();
        towerof(disk, "A", "B", "C");
    }
}
