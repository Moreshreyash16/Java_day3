package Bridgelabz.day3.array;

import java.util.Arrays;
import java.util.Scanner;

public class inputarr {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter element of array");
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            arr[i]+=a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
