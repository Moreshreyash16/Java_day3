package Bridgelabz.day3.array;

import java.util.Arrays;

public class dulpicate {
    public static void main(String[] args) {
        int [] arr={10,5,6,5,8,10,7,6};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
