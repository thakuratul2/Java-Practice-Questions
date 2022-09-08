package Recursion;

import java.util.Scanner;

class Recursion4 {
    public static void towerof(int n,String from,String to,String aux){
        if(n==1){
            System.out.println("Move disk 1 from rod "+from+" to rod "+to);
            return;
        }
        towerof(n-1,from,aux,to);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
        towerof(n-1,aux,to,from);
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
