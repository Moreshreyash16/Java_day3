package Bridgelabz.day3.array;

import java.util.Arrays;

public class oddarr {
    public static void main(String[] args) {
        int [] arr={5,66,42,87,32,55,66};
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length;i++){
            if (i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
