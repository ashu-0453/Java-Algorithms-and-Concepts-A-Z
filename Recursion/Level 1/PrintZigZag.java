package Recursion_Level_1;

import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");

    }
}
