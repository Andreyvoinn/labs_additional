package com.avoinn;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, l=0;
        Scanner in = new Scanner(System.in);
        System.out.println("El number for x and y:");
        n = in.nextInt();
        int[] x = new int[n];
        char[] y = new char[n];
        for (int i = 0; i<n; i++){
            x[i] = (int)(0 + Math.random()*2);
            y[i] = (char)(65 + Math.random()*2);
            System.out.print(x[i]+"\t");
        }
        System.out.println();

        for (int i = 0; i<n; i++){
            System.out.print(y[i]+"\t");
        }
        System.out.println();

        for (int i = 0; i<n; i++){
            if (x[i]==0 && y[i]==(char)(66)){
                System.out.println("You cant remake the sequence x to y by this rule");
                break;
            }
            else
                l++;
        }
        if (l==n){
            System.out.println("You CAN remake the sequence x to y by this rule");
        }
    }
}